<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    
    
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">




<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include  page="/views/header.jsp" />


<h1>View All Products Here </h1>

<form class="container col-md-4"  action="http://localhost:8080/ProductManagementSystem/ProductController" method="post">
 
<button type="submit"  class="btn btn-warning"   value="displayAll" name="action">Display Products</button>
</form>

<br>

${productList}
<br>
<table class="container table table-dark">

<tr><th></th><td>PID</td><th>PNAME</th><th>PRICE</th><th>DOP</th></tr>


<c:forEach items="${productList}" var="product"  >


<tr><td></td><td>${product.productId}</td> <td>${product.productName}</td>
     <td>${product.price}</td> <td>${product.dop}</td> 
     
     <td>
<form class="container col-md-4"  action="http://localhost:8080/ProductManagementSystem/ProductController" method="post">
 <input type="hidden"  value="${product.productId}" name="pid" />
 
<button type="submit"  class="btn btn-danger"   value="delete" name="action">Delete</button>
</form>
	
</td>
     
     
     
      </tr>
</c:forEach>


</table>



</body>
</html>