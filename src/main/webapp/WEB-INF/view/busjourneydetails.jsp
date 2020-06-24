<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<h1> User journey details</h1>
				 <form action="/RedBus/buses" method="post" >
			
				<table>
					<tr>
						<td>Source</td>
						<td><input type="text" name="source" /></td>
					</tr>
					<tr>
						<td>Destination</td>
						<td><input type="text" name="destination" /></td>
					</tr>

					<tr>
						<td>Journey Date</td>
						<td><input name="departureDate" /></td>
					</tr>

				</table>
				<input type="submit" value="Search" />
				</form>
		</div>
	
</body>
</html>