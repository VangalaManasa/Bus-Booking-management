<%@taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h1>Login failed please try again or register with the new account if you dont have an account</h1>

<c:form action="/BusBooking/login" method="post" modelAttribute="user">


			<h1>
				<a href="/RedBus/register">Register</a>
			</h1>
			<h1>
				<a href="/RedBus">Login</a>
			</h1>
	</c:form>
</div>
</body>
</html>