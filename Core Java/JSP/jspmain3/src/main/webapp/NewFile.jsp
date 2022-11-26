<%@page import=" java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
	Class.forName("com.mysql.jdcb.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhuvan","root","password");
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from student123");  
	while(rs.next()) { 
	out.println(rs.getInt("id")+"  "+rs.getString("name"));  
	 
	
	}
}catch(Exception e) {out.println(e);

}
%>


</body>
</html>