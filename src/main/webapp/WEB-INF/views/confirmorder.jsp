<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${conorder}
<form action="">
<input type="radio"  value="same shipping address"> same shipping address<br>
  <input type="radio"  value="change shipping address"> change shipping address<br>  
  <input type="submit" value="Shipping address">

</form>
</body>
</html>