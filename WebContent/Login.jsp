<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% String title = "Login"; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%= title %></title>
<style>
form { width: 400px; }
label { float: left; width: 150px; }
input[type=text] { float: up; width: 250px; }
.clear { clear: both; height: 0; line-height: 0; }
.floatright { float: right; }
</style>
</head>
<body>
<h1><%= title %></h1>

<form action="LoginServlet" method="POST" name="form">
<label for="enterUsername">Enter your Username:</label><input type="text" name="userName" id="userName"><br />
<br />
<label for="enterUsername">Enter your Password:</label><br><input type="password" name="passWord" id="passWord"><br />
<br />
<input type="submit" value="Submit" >
</form>

<br><br>
<a href="Registration.jsp">Register</a>

</body>
</html>