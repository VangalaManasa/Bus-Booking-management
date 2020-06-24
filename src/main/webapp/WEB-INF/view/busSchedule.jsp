<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
			
				<h1>Bus Details</h1>

	<table>
		<tr>
			<th>busNumber</th>
			<th>source</th>
			<th>Destination</th>
			<th>busType</th>
			<th>Seats</th>
			<th>Travels Name</th>
			<th>Book</th>
		</tr>
		<c:forEach var="Bus" items="${bus}">
			<tr>
				<td><p>${busSchedule.busNumber}</p></td>
				<td><p>${busSchedule.source}</p></td>
				<td><p>${busSchedule.destination}</p></td>
				<td><c:out value="${Bus.busType}" /></td>
		        <td><c:out value="${Bus.seats }"></c:out>
				<td><c:out value="${Bus.travelsName }"></c:out>
			<td><a href="/RedBus/ticketDetails?busScheduleId=${busSchedule.busScheduleId}&busId=${Bus.busId}&source=${busSchedule.source}&destination=${busSchedule.destination}">Book</a>
			</tr>
		</c:forEach>
	</table>
</div>


</body>
</html>