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
	<jsp:useBean id="Flight" class="a1.javaclasses.Flights" scope="session"/>
	
	
	
	<button onclick="history.back()">Back</button>
	<button onclick="window.location.replace('FlightSearch.jsp')">Home</button>
	
	<br><br>
	
	<form action="ViewAndBookServlet" method="post">
	<div style="float:left; margin-right:10px">
	<b>Flight #:</b> <jsp:getProperty name="Flight" property="flightNumber"/><br>
	<b>Date:</b> <jsp:getProperty name="Flight" property="travelDate"/><br>
	<b>Departure Time:</b> <jsp:getProperty name="Flight" property="departure"/><br>
	<b>Arrival Time:</b> <jsp:getProperty name="Flight" property="arrival"/><br>
	<b>Duration:</b> <jsp:getProperty name="Flight" property="duration"/><br>
	<b>Aircraft Type:</b> <jsp:getProperty name="Flight" property="aircraft"/><br>
	<b>Stops:</b> <jsp:getProperty name="Flight" property="stops"/><br>
	<b>Cost:</b> <jsp:getProperty name="Flight" property="cost"/><br>
	<b>Seats:</b> <jsp:getProperty name="Flight" property="seatNumber"/> <br>
	<b>How many seats do you want?:</b> <select name="seatsNeeded">
  	<option value="1">1</option>
  	<option value="2">2</option>
  	<option value="3">3</option>
  	<option value="4">4</option>
  	<option value="5">5</option>
  	<option value="6">6</option>
  	<option value="7">7</option>
  	<option value="8">8</option>
  	<option value="9">9</option>
  	<option value="10">10</option>
  	<option value="11">11</option>
  	<option value="12">12</option>
  	<option value="13">13</option>
  	<option value="14">14</option>
  	<option value="15">15</option>
</select>
	</div>
	<!--  
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
	-->
<input type="submit" name="select" value="Select Flight"/>
	</form>
	
	
</body>
</html>