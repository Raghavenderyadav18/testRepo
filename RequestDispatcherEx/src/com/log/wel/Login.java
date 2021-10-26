package com.log.wel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    if(p.equals("955361"))
	    {  
	        RequestDispatcher rd=request.getRequestDispatcher("/welcome");  
	        rd.forward(request, response);  
	    }  
	    else
	    {  
	        out.print(" UserName or Password Error..TryAgain");  
	        RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
	        rd.include(request, response);  
	                      
	    }  
	}
}
