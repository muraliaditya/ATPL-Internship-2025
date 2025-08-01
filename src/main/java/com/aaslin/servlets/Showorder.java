package com.aaslin.servlets;

import com.aaslin.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Showorder")


public class Showorder extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	PrintWriter out = response.getWriter();
  	
    	String sql = "Select * from orders_am;";
    	
        try {
        	
        	Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet set = ps.executeQuery();
            out.println("Here is the order Data: ");
            
            while (set.next()) { 
            	out.println(set.getInt(1)+" ");
            	out.println(set.getInt(2)+" ");
            	out.println(set.getString(3)+" ");
            	out.println(set.getInt(4)+" ");
            	out.print(set.getDate(5)+" ");
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            response.getWriter().println("Error: " + e.getMessage());
        }
    }

}