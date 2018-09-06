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
  <h2>Horizontal form</h2>
  <sptags:form class="form-horizontal" action="addCategory" method="post" commandName="cat">
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="categoryName">categoryName:</label>
      <div class="col-sm-10">          
        <sptags:input path="categoryName" class="form-control"  placeholder="Enter categoryName" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="categoryDesp">categoryDesp:</label>
      <div class="col-sm-10">          
        <sptags:input path="categoryDesp" class="form-control"  placeholder="Enter categoryDesp" />
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">saveCategory</button>
      </div>
    </div>
</sptags:form>
</div>
 <div class="container">       
  <table class="table table-bordered table-sm">
    <thead class="thead-dark">
      <tr>
        <th>categoryId</th>
        <th>categoryName</th>
        <th>categoryDesp</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
    <jscore:forEach items="${categoryinfo}" var="c">
      <tr class="table-success">
        <td>${c.categoryId }</td>
        <td>${c.categoryName }</td>
        <td>${c.categoryDesp }</td>
        <td><a href="editcat?catid=${c.categoryId }">edit</a></td>
        <td><a href="deletecat?catid=${c.categoryId}">delete</a></td>
      </tr>
     </jscore:forEach>
    </tbody>
  </table>
</div>
 


</body>
</html>
