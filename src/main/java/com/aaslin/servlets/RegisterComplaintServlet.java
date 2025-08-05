package com.aaslin.servlets;

import com.aaslin.util.DBConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDateTime;

public class RegisterComplaintServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int userId = Integer.parseInt(req.getParameter("userId"));
        String desc = req.getParameter("description");
        String category = req.getParameter("category");
        String priority = req.getParameter("priority");

        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO complaints_ma (user_id, description, category, priority, status, created_date, updated_date) VALUES (?, ?, ?, ?, 'OPEN', NOW(), NOW())"
            );
            ps.setInt(1, userId);
            ps.setString(2, desc);
            ps.setString(3, category);
            ps.setString(4, priority);
            ps.executeUpdate();
            res.sendRedirect("view.jsp");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
