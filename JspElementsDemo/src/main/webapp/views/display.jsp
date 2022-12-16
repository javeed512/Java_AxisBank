<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
JSP Script: <br>
<% 

 String uname = (String) session.getAttribute("username");

	out.print(uname);

%>
<br>
JSP Exp : <br>

<%= session.getAttribute("username")  %>

<br>
EL- Expression:
<br>

${ username }  <br>

${ password}


</body>
</html>