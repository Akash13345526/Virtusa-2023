<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page errorPage="error.jsp" %>
<%
String n1=request.getParameter("num1");
String n2=request.getParameter("num2");


int a=Integer.parseInt("n1");
int b=Integer.parseInt("n2");
int c=a/b;
out.print("division is "+c);
%>

</body>
</html>