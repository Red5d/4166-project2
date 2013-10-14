<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction</title>
</head>
<body>
	<h1>Complete Transaction</h1>
	
	<form action="transaction-confirmed.jsp" method="post">
	<div style="float:left; margin-right:10px">
	Flight #:<br>
	Date:<br>
	Departure Time:<br>
	Arrival Time:<br>
	Stops:<br>
	Cost:<br>
	<br><br>
	<b>Payment Information:</b><br>
	Cardholder Name:<br>
	Credit Card Number:<br>
	CVV Code:<br>
	</div>
	
	<div style="float:left">
	<%= request.getParameter("flightNum") %><br>
	<%= request.getParameter("flightDate") %><br>
	<%= request.getParameter("flightDepTime") %><br>
	<%= request.getParameter("flightArrTime") %><br>
	<%= request.getParameter("flightStopsNum") %><br>
	<%= request.getParameter("flightCost") %><br>
	<br><br><br>
	<input type="text" name="cardName" /><br>
	<input type="number" name="ccNum" /><br>
	<input type="number" name="cvvNum" /><br>
	</div>
	
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<input type="hidden" name="flightNum" value=<%= request.getParameter("flightNum") %> />
	<input type="hidden" name="flightDate" value=<%= request.getParameter("flightDate") %> />
	<input type="hidden" name="flightDepTime" value=<%= request.getParameter("flightDepTime") %> />
	<input type="hidden" name="flightArrTime" value=<%= request.getParameter("flightArrTime") %> />
	<input type="hidden" name="flightStopsNum" value=<%= request.getParameter("flightStopsNum") %> />
	<input type="hidden" name="flightCost" value=<%= request.getParameter("flightCost") %> />
	<input type="submit" name="confirmTransBtn" value="Confirm" />
	</form>
	<br>
	<button onclick="window.location.replace('FlightSearch.jsp')">Cancel</button>
	
</body>
</html>