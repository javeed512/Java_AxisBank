<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello friends!<br>
<h1>Welcome to JSP</h1>

<%
int x = 99;

out.println("x value "+x);

session.setAttribute("username", "javeed");

session.setAttribute("password", "tiger");

%>
<br>

Value of X again from JSP EXP : <%= x %>


<%!

private int eid;
private static String ename;


%>

<jsp:include page="display.jsp" />







</body>
</html>