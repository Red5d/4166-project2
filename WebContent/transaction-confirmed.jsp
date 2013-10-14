<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction Confirmed</title>
</head>
<body>
	<h1>Your purchase has been confirmed.</h1>
	<br>
	
	<div style="float:left; margin-right:10px">
	Flight #:<br>
	Date:<br>
	Departure Time:<br>
	Arrival Time:<br>
	Stops:<br>
	Cost:<br>
	</div>
	
	<div style="float:left">
	<%= request.getParameter("flightNum") %><br>
	<%= request.getParameter("flightDate") %><br>
	<%= request.getParameter("flightDepTime") %><br>
	<%= request.getParameter("flightArrTime") %><br>
	<%= request.getParameter("flightStopsNum") %><br>
	<%= request.getParameter("flightCost") %><br>
	</div>
	
	<br><br><br><br><br><br><br><br>
	<button onclick="window.location.replace('FlightSearch.jsp')">Home</button>
	
</body>
</html>