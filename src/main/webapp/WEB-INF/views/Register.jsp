<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="sptags"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<core:if test="${regresult}">
<h1> Registration sucess</h1>
</core:if>
<sptags:form class="form-horizontal" action="Register1" method="post" commandName="reg">
<div class="form-group">
      <label class="control-label col-sm-2" for="userName">userName:</label>
      <div class="col-sm-10">          
        <sptags:input path="userName" class="form-control"  placeholder="Enter userName" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="dateOfBirth">dateOfBirth:</label>
      <div class="col-sm-10">          
        <sptags:input path="dateOfBirth" class="form-control"  placeholder="Enter dateOfBirth" />
      </div>
    </div>
<div class="form-group">
      <label class="control-label col-sm-2" for="email">email:</label>
      <div class="col-sm-10">          
        <sptags:input path="email" class="form-control"  placeholder="Enter email" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="mobilNo">mobileNo:</label>
      <div class="col-sm-10">          
        <sptags:input path="mobileNo" class="form-control"  placeholder="Enter mobileNo" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="address">address:</label>
      <div class="col-sm-10">          
        <sptags:input path="address" class="form-control"  placeholder="Enter address" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="passWord">passWord:</label>
      <div class="col-sm-10">          
        <sptags:input path="passWord" class="form-control"  placeholder="Enter passWord" />
      </div>
    </div>
     <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Register</button>
      </div>
    </div>
   
</sptags:form>
</body>
</html>