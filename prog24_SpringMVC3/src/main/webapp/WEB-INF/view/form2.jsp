<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome On Form</h1>

<% 
String heading = (String) request.getAttribute("heading"); 
String name = (String) request.getAttribute("name"); 
String add = (String) request.getAttribute("add"); 
List<String> hobbies= (List<String>) request.getAttribute("h"); 
%>

<h2>
<%= heading %><br><br>
<br>My Name =<%= name %>
<br>My Address =<%= add %>
<br>My Hobbies = 
<%
for(String i:hobbies)
out.println(i);
%>
</h2>

<a href="">BACK</a>
</body>
</html>