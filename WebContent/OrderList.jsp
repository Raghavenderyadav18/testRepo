<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.ecom.nike.*"%>
     <%@ page import="java.sql.*"%>
     <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
List<Product> list =(List<Product>)request.getAttribute("orderList");

for(int i=0; i<list.size(); i++) {
Product product=list.get(i);
int id=product.getId();
String name=product.getName();
Double price=product.getPrice();
String image=product.getImage();
String desc=product.getDescription();
%>

<%= id%>
<%= name%>
<%= price%>
<%= desc %>
<img src="<%=image %>>" width="100px" height="100px">

<% } %>




</body>
</html>