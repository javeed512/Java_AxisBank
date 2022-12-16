<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Success Page </h1>
JSP ACTION TAG:
<br>


<jsp:useBean  id="emp" class="com.axis.bean.Employee"  scope="session" >
</jsp:useBean>

<jsp:getProperty property="eid" name="emp" />
<jsp:getProperty property="ename" name="emp" />
<jsp:getProperty property="salary" name="emp" />

<br>
<h1>Employee Details: 
${emp}
</h1>

</body>
</html>