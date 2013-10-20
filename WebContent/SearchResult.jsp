<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
	//All the random Generation
	
	/*
	Converts the random generated double to 
	an integer for the departure time.
	*/
	Double time =  new Double(Math.random() * 12 + 1);
    Double time2 =  new Double(Math.random() * 60 + 1);
	int dTime = time.intValue();
	int dTime2 = time2.intValue();
	
	/*
	Converts the random generated double to 
	an integer for the arrival time.
	*/
	Double time3 =  new Double(Math.random() * 12 + 1);
	Double time4 =  new Double(Math.random() * 60 + 1);
	int aTime = time3.intValue();
	int aTime2 = time4.intValue();
	
	/*
	The following converts the random generated double to 
	an integer for the No. of Stops, flight number, and the cost.
	*/
	
	Double stops = Math.floor((Math.random() * 5)+1);
	int noOfStops = stops.intValue();
	
	Double flightNumber = Math.floor((Math.random() * 100000)+1);
	int flightNo = flightNumber.intValue();
	
	Double Cost = Math.floor((Math.random() * 1000)+1);
	int cost = Cost.intValue();

%>
<html>
<head>
<script type="text/javascript">

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Search Results</title>
<body>
<H1>Here are your search results!</H1>
<jsp:useBean id="pageBean" class="a1.javaclasses.Flights" />
<jsp:setProperty name="pageBean" property="*" />
<table border="1">
	<tr>
		<td>Flight Number:</td>
		<td><jsp:getProperty name="pageBean" property="flightNumber" /></td>
	</tr>
	<tr>
		<td>Flight Date:</td>
		<td><%= request.getParameter("travelDate") %></td>
	</tr>
	<tr>
		<td>Departure Time:</td>
		<td><%= dTime + ":" + dTime2 + "a.m." %></td>
	</tr>
	<tr>
		<td>Arrival Time:</td>
		<td> <%= aTime + ":" + aTime2 + "p.m." %></td>
	</tr>
	<tr>
		<td>No. of Stops:</td>
		<td><%= noOfStops %></td>
	</tr>
	<tr>
		<td>Cost:</td>
		<td><%= "$" + cost %></td>
	</tr>
</table>
<br />
<input type="button" value="Search Another" onclick="window.location.href='FlightSearch.jsp'">
<br><br>

<form action="view-book.jsp" method="post">
	<input type="hidden" name="flightNum" value=<%= flightNo %> />
	<input type="hidden" name="flightDate" value=<%= request.getParameter("travelDate") %> />
	<input type="hidden" name="flightDepTime" value=<%= dTime + ":" + dTime2 + "a.m." %> />
	<input type="hidden" name="flightArrTime" value=<%= aTime + ":" + aTime2 + "p.m." %> />
	<input type="hidden" name="stops" value=<%= noOfStops %> />
	<input type="hidden" name="cost" value=<%= "$" + cost %> />
	<input type="hidden" name="seats" value=<%= request.getParameter("noOfSeats") %> />

	<input type="submit" value="View and Book">
</form>

</body>
</html>