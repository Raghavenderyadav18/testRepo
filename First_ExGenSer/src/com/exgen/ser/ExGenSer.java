package com.exgen.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ExGenSer extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
		  PrintWriter out = res.getWriter();
		 // out.println("<h1>This is first servlet .....</h1>");
		  
		  String userName=req.getParameter("name");
		  String password=req.getParameter("pwd");
		  out.println("Name of the user="+userName);
		  out.println("Password="+password);
		
	}

}
