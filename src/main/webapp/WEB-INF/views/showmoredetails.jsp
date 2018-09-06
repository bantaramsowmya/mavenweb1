<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style>
h{text-align: right;color:blue;font-family:Arial;font-size: 30px;}
p{font-size: 28px;
}
p1{font-size:20px;}
</style>
</head>
<body>
<div class="container-fluid">
  <div class="row">
    <div class="col-sm-6">
        <img src="resources/${pro.productId }.jpg" alt="abc" style="width:300px;height:300px;">
<form action="addtocart">
<input type="hidden" name="productId" value="${pro.productId }">
<p1>quantity<input path="text" name="quantity" > </p1>
<input type="submit" value="addtocart">
</form>
    </div>
    <div class="col-sm-6">
    <h>Specifications:</h>
    <p>Id:${pro.productId }<br>
        Name:${pro.productName }<br>
        Price:${pro.productPrice }<br>
        Description:${pro.productDescription }<br>
        Category:${pro.productCategory }<br>
        SupplierName:${pro.productSupplierName}<br>
</p>
    </div>
  </div>
</div>
    

 
</body>
</html>