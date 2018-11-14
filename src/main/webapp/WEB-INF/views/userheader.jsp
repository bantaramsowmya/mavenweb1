<%@page import="java.math.BigInteger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
p{font-size: 15px;
}
</style>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
<a class="navbar-brand" href="#"><image src="resources/jewellery.jpg" style="width:30px;height:30px"></a>
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="uh.html"><p>products</p></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Register.html"><p>Register</p></a>
    </li>
   
<li class="nav-item">
      <a class="nav-link" href="Login"><p>Login</p></a> 
    </li>
        
    
        <% BigInteger r=(BigInteger)session.getAttribute("rows");
    out.print(r); %>
    <li class="nav-item">
      <a class="nav-link" href="cart1"><img src="resources/cart.jpg"  style="width:30px;height:30px;"></a> 
    </li>
    <jscore:if test="${LoggedIn}">
    <li class="nav-item">
      <a class="nav-link" href="perform_logout"><p>Logout</p></a>
      </jscore:if>
    </li>
    
     </ul>
</nav>
<br>

</body>
</html>