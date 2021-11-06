package com.ecom.nike;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductList")
public class ProductList extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	 
	 String category=req.getParameter("category");
	 PrintWriter out = resp.getWriter();
	 try {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "techouts");
	 PreparedStatement stmnt = connect.prepareStatement("select * from products where category=?");
	 stmnt.setString(1, category);
	 ResultSet rs = stmnt.executeQuery();

	 List<Product> list=new ArrayList<Product>();
	 while (rs.next())
	 {
	 Product prdt=new Product();

	 prdt.setId(rs.getInt("id"));
	 prdt.setName(rs.getString("name"));
	 prdt.setPrice(rs.getDouble("price"));
	 prdt.setImage(rs.getString("image"));
	 //product.setDesc(rs.getString("Discription"));

	 list.add(prdt);
	 }
	 req.setAttribute("productList", list);
	 RequestDispatcher rd = req.getRequestDispatcher("ProductList.jsp");
	 rd.forward(req, resp);	 
	 }
	 catch(Exception e)
	 {
		 out.print(e);
	 }
	 
}
}
