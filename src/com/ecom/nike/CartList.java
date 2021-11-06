package com.ecom.nike;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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

@WebServlet("/CartList")
public class CartList extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "techouts");
			Statement stmt = connect.createStatement();
			String s = "select * from cart;";
			ResultSet rs = stmt.executeQuery(s);

			List<Product> list = new ArrayList<Product>();
			while (rs.next()) {
				Product prdt = new Product();

				prdt.setId(rs.getInt("id"));
				prdt.setName(rs.getString("name"));
				prdt.setPrice(rs.getDouble("price"));
				prdt.setImage(rs.getString("image"));
				prdt.setDescription(rs.getString("desc"));

				list.add(prdt);
			}
			req.setAttribute("cartList", list);
			RequestDispatcher rd = req.getRequestDispatcher("CartList.jsp");
			rd.forward(req, resp);
		}

		catch (Exception e) {

		}

	}
}
