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
 <div align="center">
        <h1>User registration page</h1>
        <c:form action="/RedBus/add" method="post" modelAttribute="user">
        <table style="width: 80%">
            <tr>
                <td>User name</td>
                <td><input type="text" name="userName" required></td>
            </tr>
            <tr>
                <td>password</td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td>MobileNumber</td>
                <td><input type="number" name="mobileNumber" required></td>
            </tr>
            <tr>
                <td>email</td>
                <td><input type="email" name="email" required></td>
            </tr>
             <tr>
                <td>Location</td>
                <td><input type="text" name="location" required></td>
            </tr>
            </table>   
                <input type="submit" value="Register">
        </c:form>
    </div>

</body>
</html>