package com.ecom.nike;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Validation")
public class Validation extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		try 
		   {
	     	 	String mail=request.getParameter("mail");
		    	String pwd=request.getParameter("password");
	   
			
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","techouts");
				
				Statement se = conn.createStatement();
				String s2="select firstname from register where mail='"+mail+"';";
                ResultSet rsname = se.executeQuery(s2);
                String name=null;
				while(rsname.next())
				{
                   name=rsname.getString("firstname");					
				}
				
			    HttpSession session=request.getSession();  
		        session.setAttribute("uname",name);  
				
				Statement stmt1 = conn.createStatement();
				String s1 = "select count(*) from  register where mail='"+mail+"' and password="+pwd+";";
				ResultSet rs=stmt1.executeQuery(s1);
                int count=0;
                while(rs.next()){
                	
                	count=rs.getInt(1);
                }
				out.println(count);
				if(count>0)
				{   
					
					RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
					rd.forward(request, response);
				}
				
				else
				{
					
					RequestDispatcher rd1 = request.getRequestDispatcher("login.html");
					rd1.forward(request, response);
					
				}
		    }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	}
}
