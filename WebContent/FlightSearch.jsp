<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Search</title>
<style>
form { width: 400px; }
label { float: left; width: 150px; }
input[type=text] { float: up; width: 250px; }
select { float: up; width: 250px; }
option { float: up; width: 250px; }
.clear { clear: both; height: 0; line-height: 0; }
.floatright { float: right; }
</style>
</head>
<body>
<H1>Search for a Flight</H1>
<form name="input" action="SearchResult.jsp" method="post">
<label for="source">Source:</label><input type="text" name="source"><br />
<br />
<label for="destination">Destination:</label> <input type="text" name="destination"><br />
<br />
<label for="travelDate">Travel Date:</label> <input type="text" name="travelDate"><br />
<br />
<label for="noOfSeats">No. of Seats:</label><br>
<select name="noOfSeats">
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
  	<option value="16">16</option>
  	<option value="17">17</option>
  	<option value="18">18</option>
  	<option value="19">19</option>
  	<option value="20">20</option>
</select>
<br />
<br />
<label for="classType">Class Type:</label><br />
<select name="class">
<option value="volvo">Economy</option>
<option value="saab">Business</option>
<option value="fiat">First Class</option>
</select><br /><br /><br />
<input type="submit" value="Search">
<input type="button" value="Booking History" onclick="window.location.href='BookingHistory.jsp'">

</form> 
</body>
</html>