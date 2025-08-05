package com.aaslin.servlets;

import com.aaslin.util.DBConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class UpdateComplaintServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String newStatus = req.getParameter("status");

        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE complaints_ma SET status=?, updated_date=NOW() WHERE id=?"
            );
            ps.setString(1, newStatus);
            ps.setInt(2, id);
            ps.executeUpdate();
            res.sendRedirect("view.jsp");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
