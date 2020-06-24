<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flight details</title>
</head>
<body>
 <div align="center">
        <h1> Bus Journey details</h1>
           <table>
		
			<tr>
				<th>busNumber</th>
				<th>fare</th>
				<th>Duration</th>
				<th>Details</th>
			</tr>
			<c:forEach var="BusSchedule" items="${busList}">
				<tr>
					<td><c:out value="${BusSchedule.busNumber}" /></td>
					<td><c:out value="${BusSchedule.fare}" /></td>
					<td><c:out value="${BusSchedule.duration }"/></td>
			<td><a href="busList?busScheduleId=${BusSchedule.busScheduleId}&busNumber=${BusSchedule.busNumber}">Details</a><br>
				</tr>
			</c:forEach>
		</table>
		</div>
            
</body>
</html>