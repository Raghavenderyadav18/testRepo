package com.ecom.nike;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomerDetails")
public class CustomerDetails extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","techouts");
	     	PreparedStatement pstmt = conn.prepareStatement("insert into register values(?,?,?,?,?)");
	     	pstmt.setString(1,request.getParameter("firstname"));
	     	pstmt.setString(2,request.getParameter("lastname"));
	     	pstmt.setString(3,request.getParameter("mobile"));
	     	pstmt.setString(4,request.getParameter("mail"));
	     	pstmt.setString(5,request.getParameter("password"));
	     	pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		rd.forward(request, response);
	}

	

}
