package com.aaslin.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Admindatacollect")

public class Admindatacollect extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	       
	        response.setContentType("text/html;");
	        PrintWriter out = response.getWriter();
	        out.println("<html>"
	                + "<body>"
	                + "<form method='get' action='Admindatacollect'>"
	                + "<label>Enter your adminID: </label>"
	                + "<input type='number' name='id' required><br><br>"
	                + "<label>Enter your role: </label>"
	                + "<input type='text' name='role' required><br><br>"
	                + "<input type='submit' value=\"Get details\">"
	                + "</form>"
	                + "</body>"
	                + "</html>");
	    	   
	}
}