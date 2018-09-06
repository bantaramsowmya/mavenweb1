<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sptags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="perform_login" method="post">
UserName<input type="text" name="username" />
passWord<input type="password" name="password" />
<input type="submit" value="Login" />
</form>
</body>
</html>