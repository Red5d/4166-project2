<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View And Book Flight</title>

</head>
<body>

<%! 
	Random randNum = new Random();
	int duration = Math.abs(randNum.nextInt());
	int stops = Math.abs(randNum.nextInt());
	float cost = Math.abs(randNum.nextFloat());
	String flightCraftType = "Boeing 747";
%>

	<h1>View And Book Flight</h1>
	<br>
	
	<button onclick="history.back()">Back</button>
	<button onclick="window.location.replace('FlightSearch.jsp')">Home</button>
	
	<br><br>
	
	<form action="transaction.jsp" method="post">
	<div style="float:left; margin-right:10px">
	Flight #:<br>
	Date:<br>
	Departure Time:<br>
	Arrival Time:<br>
	Duration:<br>
	Aircraft Type:<br>
	Stops:<br>
	Cost:<br>
	Seats:<br>
	</div>
	
	<div style="float:left">
	<%= request.getParameter("flightNum") %><br>
	<%= request.getParameter("flightDate") %><br>
	<%= request.getParameter("flightDepTime") %><br>
	<%= request.getParameter("flightArrTime") %><br>
	<%= duration %><br>
	<%= flightCraftType %><br>
	<%= request.getParameter("stops") %><br>
	<%= request.getParameter("cost") %><br>
	<%= request.getParameter("seats") %>
	</div>
	
	<br><br><br><br><br><br><br><br><br><br>
	<input type="hidden" name="flightNum" value=<%= request.getParameter("flightNum") %> />
	<input type="hidden" name="flightDate" value=<%= request.getParameter("flightDate") %> />
	<input type="hidden" name="flightDepTime" value=<%= request.getParameter("flightDepTime") %> />
	<input type="hidden" name="flightArrTime" value=<%= request.getParameter("flightArrTime") %> />
	<input type="hidden" name="flightStopsNum" value=<%= request.getParameter("stops") %> />
	<input type="hidden" name="flightCost" value=<%= request.getParameter("cost") %> />
	<input type="submit" name="bookFlightBtn" value="Select" />
	</form>
	
</body>
</html>