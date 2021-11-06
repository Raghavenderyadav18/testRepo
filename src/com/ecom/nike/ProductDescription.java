package com.ecom.nike;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pd")
public class ProductDescription extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	 int id = Integer.parseInt(req.getParameter("id"));
	 PrintWriter out = resp.getWriter();
	 try {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "techouts");
	 Statement stmt = connect.createStatement();
	 String s="select * from products where id="+id+";";
	 ResultSet rs = stmt.executeQuery(s);
    
	 List<Product1> list1=new ArrayList<Product1>();
	 while (rs.next())
	 {
	 Product1 prdt=new Product1();

	 prdt.setId(rs.getInt("id"));
	 prdt.setName(rs.getString("name"));
	 prdt.setPrice(rs.getDouble("price"));
	 prdt.setImage(rs.getString("image"));
	 //product.setDesc(rs.getString("Discription"));

	 list1.add(prdt);
	 }
	 req.setAttribute("productList", list1);
	 RequestDispatcher rd = req.getRequestDispatcher("ProductDesc.jsp");
	 rd.forward(req, resp);	 
	 }
	 catch(Exception e)
	 {
		 out.print(e);
	 }
	 
}
}
