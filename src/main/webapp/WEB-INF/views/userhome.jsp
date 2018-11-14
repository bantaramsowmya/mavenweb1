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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jscore:if test="${regresult}">
<h1> Registration success</h1>
</jscore:if>
<div class="container">
              
  <table class="table table-bordered table-sm">
   <thead class="thead-dark">
      <tr>
      <th>Products</th>
      </tr>
    </thead>
    <tbody>
      <jscore:forEach items="${productInfo }" var="p">
      <tr class="table-primary">
      
        <td><div class="row"><div class="col-sm-3" ><a href="showmoredetails?proid=${p.productId }"><img src="resources/${p.productId }.jpg" alt="abc" style="width:170px;height:170px;"></a></div>
       <div class="col-sm-3">ProductId : ${p.productId }<br>
        ProductName : ${p.productName }<br>
        ProductPrice : ${p.productPrice }<br>
        ProductDescription : ${p.productDescription }<br>
        ProductCategory : ${p.productCategory }<br>
        ProductSupplier : ${p.productSupplierName }</div></div>
        </td>

      </tr>
</jscore:forEach>
    </tbody>
  </table>>
</div>
</body>
</html>