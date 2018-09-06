<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
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
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#">Logo</a>

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="product1.html">products</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Register.html">Register</a>
    </li>
<li class="nav-item">
      <a class="nav-link" href="Login">Login</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="cart1"><img src="resources/cart.jpg"  style="width:30px;height:30px;"></a>
    </li>
    
    <li class="nav-item">
      <a class="nav-link" href="perform_logout">Logout</a>
    </li>
     </ul>
</nav>
<br>
<jscore:if test="${regresult}">
<h1> Registration sucess</h1>
</jscore:if>
<div class="container">
              
  <table class="table table-bordered table-sm">
   <thead class="thead-dark">
      <tr>
        <th>productId</th>
        <th>productName</th>
        <th>productPrice</th>
        <th>productDescription</th>
        <th>productCategory</th>
        <th>productSupplierName</th>
        <th>image</th>
        
        
      </tr>
    </thead>
    <tbody>
      <jscore:forEach items="${productInfo }" var="p">
      <tr class="table-primary">
     
        <td>${p.productId }</td>
        <td>${p.productName }</td>
        <td>${p.productPrice }</td>
        <td>${p.productDescription }</td>
        
        <td>${p.productCategory }</td>
        <td>${p.productSupplierName }</td>
        <td><a href="showmoredetails?proid=${p.productId }"><img src="resources/${p.productId }.jpg" alt="abc" style="width:75px;height:75px;"></a></td>
        
         
      </tr>
</jscore:forEach>
    </tbody>
  </table>
</div>
 
 

</body>
</html>