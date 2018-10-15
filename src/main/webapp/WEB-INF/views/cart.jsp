<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<%@ include file="userheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
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

<div class="container">
              
  <table class="table table-bordered table-sm">
   <thead class="thead-dark">
      <tr>
        <th>cartId</th>
        <th>productName</th>
        <th>quantity</th>
        <th>productPrice</th>
        <th>totalPrice</th>
        <th>cartUser</th>
        
      </tr>
      
    </thead>
    
    <tbody>
    
      <jscore:forEach items="${cartinfo }" var="c">
      <tr class="table-primary">
     
        <td>${c.cartId}</td>
        <td>${c.productName }</td>
        <td>${c.quantity}</td>
        <td>${c.productPrice}</td>
        <td>${c.totalPrice }</td>
        <td>${c.cartUser }</td>
        </tr>
       <jscore:set var="payableAmount" value="${payableAmount+c.totalPrice}" />
        
</jscore:forEach>
payableAmount=${payableAmount }
    </tbody>
  </table>
</div>
<div class="col-sm-6">
<form action="CancelOrder" method="post">
<input type="submit" value="CancelOrder">
</form>
</div>
<div class="col-sm-6">
<form action="" method="post">
<input type="submit" value="ConfirmOrder">
</form>
</div>
</body>
</html>