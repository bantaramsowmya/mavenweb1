<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sptags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<%@ include file="adminheader.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Supplier form</h2>
  <sptags:form class="form-horizontal" action="addSupplier" method="post" commandName="sup" >
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="supplierName">supplierName:</label>
      <div class="col-sm-10">          
        <sptags:input path="supplierName" class="form-control"  placeholder="Enter supplierName" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="supplierDesp">supplierDesp:</label>
      <div class="col-sm-10">          
        <sptags:input path="supplierDesp" class="form-control"  placeholder="Enter supplierDesp" />
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">saveSupplier</button>
      </div>
    </div>
</sptags:form>
</div>
 <div class="container">
              
  <table class="table table-bordered table-sm">
   <thead class="thead-dark">
      <tr>
        <th>supplierId</th>
        <th>supplierName</th>
        <th>supplierDesp</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
      <jscore:forEach items="${supplierinfo}" var="s">
      <tr class="table-primary">
     
        <td>${s.supplierId }</td>
        <td>${s.supplierName }</td>
        <td>${s.supplierDesp}</td>
        <td><a href="editsup?supid=${s.supplierId }">edit</a></td>
        <td><a href="deletesup?supid=${s.supplierId }">delete</a></td>
      </tr>
</jscore:forEach>
    </tbody>
  </table>
</div>

</body>
</html>
