<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ecom.nike.*"%>
     <%@ page import="java.sql.*"%>
     <%@ page import="java.util.*"%>
      <%
HttpSession session1=request.getSession(false);  
 String n=(String)session1.getAttribute("uname");
/*  PrintWriter pw = response.getWriter();  
 pw.print("Hello "+n);   */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style type="text/css">



ul {
	list-style-type: none;
	background-color:#808080;
	border-style: hidden;
	border-radius: 5px;
}

li {
	display: inline-flex;
	color: black;
	padding: 4px 18px;
	text-decoration: none;
}

a {
	text-decoration: none;
	color: black;
	border: solid 2px black;
	border-width:1.5px;
	border-radius: 5px;
}
#na{
    text-decoration: none;
	color: black;
	border: solid 2px black;
	border-width:1.5px;
	border-radius: 5px;
}
}

li a:hover {
	
	color:white;
}

.co{
  float:right;
  
}
</style>
</head>
<body>

	<div class="abc">
		<ul>
		   <%-- 
			<li><a href="shoes.jsp">Shoes </a></li>
			<li><a href="loafers.jsp">Loafers</a></li>
			<li><a href="slippers.jsp">Slippers</a></li>
			<li><a href="sandals.jsp">Sandals</a></li>
		    //<li><a href="#"><%=name %></a></li> --%>
			<li><form action="ProductList" ><button value="shoes" name="category">Shoes</button></form></li>
			<li><form action="ProductList" ><button value="loafers" name="category">Loafers</button></form></li>
			<li><form action="ProductList" ><button value="slippers" name="category">Slippers</button></form></li>
			<li><form action="ProductList" ><button value="sandals" name="category">Sandals</button></form></li>
			<div class="co">
			<li><%=n%></li>
			<li><form action="CartList" ><button>Cart</button></form></li>
			<li><form action="OrderList" ><button value="sandals" name="category">Order</button></form></li>
			</div>
		</ul>
	</div>
<%
List<Product> list =(List<Product>)request.getAttribute("productList");

for(int i=0; i<list.size(); i++) {
Product product=list.get(i);
int id=product.getId();
String name=product.getName();
Double price=product.getPrice();
String image=product.getImage();
%>
<%= price%>
<%= name%>
<%= id%>



<form action="Pd" method="post"><button type="submit" name="id" value="<%= id%>"><img alt="no image" src="<%=image %>" width="300px" height="300px"></button> </form>

<% } %>




</body>
</html>