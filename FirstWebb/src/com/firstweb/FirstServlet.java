
package com.firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet 
{
    private ServletConfig config;
	public FirstServlet() {

	}

	@Override
	public void destroy() {
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 
		System.out.println("Service method is called");
	  res.setContentType("text/html");
	  PrintWriter out = res.getWriter();
	 // out.println("<h1>This is first servlet .....</h1>");
	  
	  String userName=req.getParameter("name");
	  String password=req.getParameter("pwd");
	  out.println("Name of the user="+userName);
	  out.println("Password="+password);
	}

}
