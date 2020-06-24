<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <div align="center">
        <h1>User Login page</h1>
        <c:form action="/RedBus/login" method="post" modelAttribute="cred">
        <table style="width: 80%">
            <tr>
                <td>User Name</td>
                <td><input type="text" name="userName" required></td>
            </tr>
            <tr>
                <td>password</td>
                <td><input type="password" name="password" required></td>
            </tr>
             </table>   
                <input type="submit" value="Login">
                 <a	href="/RedBus/register">Register</a>
        </c:form>
    </div>
            
</body>
</html>