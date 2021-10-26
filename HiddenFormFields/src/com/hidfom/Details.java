package com.hidfom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		String na=request.getParameter("uname");
		String id=request.getParameter("id"); 
		
		
		out.println("name=" + na + "<br>");
		//out.println("id=" + id + "<br>");
		 
		
		out.println("<form action='/HiddenFormFields/details2' method='post'>");
	     //out.print("<input type=\"hidden\" name=\"uname\" value=\""+na+"\">");  
	     out.print("<input type='hidden' name='uname' value='"+na+"'>");
	     out.print("<input type='hidden' name='id' value='"+id+"'>"); 
	     out.println("<input type='submit' value='Go'>");
	     out.println("</form>");
        out.close();		
	}

}
