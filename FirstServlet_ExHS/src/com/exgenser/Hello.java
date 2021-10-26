package com.exgenser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("pwd");
		 
		out.println("UserName="+name+"  Password="+password);
		
		//super.doGet(req, resp);
	}

	
	/*
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { PrintWriter out =
	 * resp.getWriter(); out.println("Servlet by extending HttpServlet"); }
	 */
}
