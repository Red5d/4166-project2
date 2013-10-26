<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<script type="text/javascript">

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Search Results</title>
<body>
<H1>Here are your search results!</H1>
<jsp:useBean id="Flight" type="a1.javaclasses.Flights" scope="session"/>

<form action="FlightSearchResultsServlet" method="post">
<table border="1">
	<tr>
		<th>Flight Number</th>
		<th>Flight Date:</th>
		<th>Departure Time:</th>
		<th>Arrival Time:</th>
		<th>No. of Stops:</th>
		<th>Cost:</th>
		
	</tr>
	<tr>
		<td><input type="text" name="email" id="email" value="<jsp:getProperty name="Flight" property="flightNumber"/>"></td>
		<td><jsp:getProperty name="Flight" property="travelDate"/></td>
		<td><jsp:getProperty name="Flight" property="departure"/></td>
		<td><jsp:getProperty name="Flight" property="arrival"/></td>
		<td><jsp:getProperty name="Flight" property="stops"/></td>
		<td><jsp:getProperty name="Flight" property="cost"/></td>
	</tr>

</table>
<br />
<input type="button" value="Search Another" onclick="window.location.href='FlightSearch.jsp'">
<br><br>




	<input type="submit" value="View and Book">
</form>

</body>
</html>