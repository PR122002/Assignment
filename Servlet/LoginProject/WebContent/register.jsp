<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

	<%
	
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); // HTTP 1.1	
	
		response.setHeader("Pragma","no-cache"); //HTTP 1.0
		
		response.setHeader("Expires","0"); //Proxies
		
		if(session.getAttribute("username")!=null){
			response.sendRedirect("welcome.jsp");
		}
	%>
	
	
	<form action="Register" method="post">
		Enter username: <input type="text" name="username"><br>
		Enter password: <input type="password" name="pass"><br>
		<input type="submit" value="Register">
	</form>
	
	<a href="login.jsp">Already have an account?Login here</a>
	
	<%
		String message="";
		if(request.getAttribute("message")!=null){
			message=request.getAttribute("message").toString();
		}
		
	%>
	${message}
	
</body>
</html>