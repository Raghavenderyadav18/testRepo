package com.log.wel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet
{
    public  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
      {
    	  resp.setContentType("text/html");  
    	    PrintWriter out = resp.getWriter();  
    	          
    	    String name=req.getParameter("userName");  
    	    out.print("Welcome "+name);        
      }
}
