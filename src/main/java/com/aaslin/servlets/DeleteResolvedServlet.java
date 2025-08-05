package com.aaslin.servlets;

import com.aaslin.util.DBConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class DeleteResolvedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int days = Integer.parseInt(req.getParameter("days"));
        try (Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM complaints_ma WHERE status='RESOLVED' AND updated_date < NOW() - INTERVAL ? DAY"
            );
            ps.setInt(1, days);
            int count = ps.executeUpdate();
            res.getWriter().write(count + " resolved complaints deleted.");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
