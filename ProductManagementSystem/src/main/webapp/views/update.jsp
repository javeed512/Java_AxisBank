<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">


</head>
<body>
<form class="container col-md-4"  action=" " method="post">
 
 <div> 
 <label>Enter Pid:</label>
 <input type="text"  class="form-control" name="pid" />
 </div>
 
 <div>
 <label>Enter PName:</label>
 <input type="text" class="form-control" name="pname" />
 </div>
 
 
 <div>
 <label>Enter Price:</label>
 <input type="text"  class="form-control" name="price" />
  </div>
  <br>
  <button type="submit" class="btn btn-primary">UPDATE </button>
  
</form>



</body>
</html>