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
<div>
<h1>This is the information about your journey</h1>
 

<h2>Have a safe journey</h2>
<p>Source:${source}</p>
<p>Destination:${destination}</p>
         <c:forEach var="Ticket" items="${ticketdetails}">
			
			TicketId:<c:out value="${Ticket.ticketId }"></c:out>
			</c:forEach>
			
			

</div>
</body>
</html>