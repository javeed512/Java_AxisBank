<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>

<c:out value="Hello Friends"></c:out>

<c:forEach begin="1"  step="1"  end="5" var="i" >

<c:out value="${i}"></c:out>


</c:forEach>




