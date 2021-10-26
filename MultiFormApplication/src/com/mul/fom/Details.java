package com.mul.fom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		String na=request.getParameter("sname");
		String id=request.getParameter("sid");
		String st=request.getParameter("state");
		String cou=request.getParameter("country");
		
		out.println("name="+na+"<br>");
		out.println("id="+id+"<br>");
		out.println("name="+st+"<br>");
		out.println("name="+cou+"<br>");
	}

}
