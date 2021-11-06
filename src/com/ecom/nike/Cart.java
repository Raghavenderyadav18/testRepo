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

@WebServlet("/Cart")
public class Cart extends HttpServlet
{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	try {
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "techouts");
		PreparedStatement stmnt = connect.prepareStatement("select * from products where id=?;");
		stmnt.setInt(1, id);
		ResultSet rs = stmnt.executeQuery();
		
		int id1 = 0;
		String name = null;
		double price = 0.0;
		String description = null;
		String category=null;
		String image = null;
		
		
		
		while (rs.next()) 
		{
			id1 = rs.getInt("id");
			name = rs.getString("name");
			price = rs.getDouble("price");
			image = rs.getString("image");
			description = rs.getString("description");
			category=rs.getString("category");
			
		}
		PreparedStatement stmnt1 = connect.prepareStatement("insert into cart values (?,?,?,?,?)");
		stmnt1.setInt(1, id1);
		stmnt1.setString(2, name);
		stmnt1.setDouble(3, price);
		stmnt1.setString(4, image);
		stmnt1.setString(5, description);
		stmnt1.executeUpdate();
		
		  PreparedStatement stmnt2 = connect.prepareStatement("select * from products where id=?");
		  stmnt2.setInt(1, id1); 
		  ResultSet rs1 = stmnt2.executeQuery();
		  
		  List<Product1> list = new ArrayList<Product1>();
		  while (rs1.next()) 
		  {
		  Product1 product = new Product1();
		  product.setId(rs1.getInt("id"));
		  product.setName(rs1.getString("name"));
		  product.setPrice(rs1.getDouble("price"));
		  product.setImage(rs1.getString("image"));
		  list.add(product); 
		  }
		 request.setAttribute("success", "Item Added To Cart Succesfully");
		request.setAttribute("productList", list);
		RequestDispatcher rd = request.getRequestDispatcher("/ProductDesc.jsp");
		rd.forward(request, response);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
