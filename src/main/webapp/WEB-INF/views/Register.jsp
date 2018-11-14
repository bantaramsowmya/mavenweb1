<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="sptags"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    <%@ include file="userheader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bg-secondary text-white">
<core:if test="${regresult}">
<h1> Registration sucess</h1>
</core:if>
<sptags:form class="form-horizontal" action="Register1" method="post" commandName="reg" name="register" onsubmit="return display()">
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
        <sptags:input path="email" class="form-control" type="email" placeholder="Enter email" />
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
<script >
function display() 
{
	var username=document.register.userName.value;
	var password=document.register.passWord.value;
	var moblieno=document.register.mobileNo.value;
	if(username.length>6&&password.length>6&&mobileno.length==10)
		{
		return true;
		}
	else
		{
		alert("username and password should contain atleast 7 characters and mobileno should contain 10 num");
		return false;
		}
}
	</script>
</body>
</html>