<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="Login" method="post">
		Enter username: <input type="text" name="username"><br>
		Enter password: <input type="password" name="pass"><br>
		<input type="submit" value="login">
	</form>
	
	<a href="register.jsp">Don't have an account?Register here</a><br>
	
	<%
		String message="";
		if(request.getAttribute("message")!=null){
			message=request.getAttribute("message").toString();
		}
		
	%>
	${message}
</body>
</html>