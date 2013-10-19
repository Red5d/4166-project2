<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String title = "Registration"; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function passwordCheck(){
	
	var password = document.forms["form"]["passWord"].value;
	var passwordCopy = document.forms["form"]["passwordConfirm"].value;
	
	if (password != passwordCopy){
		alert("Passwords must match.");
		return false;
	}
}
</script>
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

<form action="RegistrationServlet" method="POST" onsubmit="return passwordCheck()" name="form">
<label for="enterUsername">Enter a Username:</label><input type="text" name="userName" id="userName"><br />
<br />
<label for="enterUsername">Enter your Email:</label><br><input type="text" name="email" id="email"><br />
<br />
<label for="enterUsername">Enter your Date of Birth:</label><br><input type="text" name="bDate" id="bDate"><br />
<br />
<label for="enterUsername">Enter a Password:</label><br><input type="password" name="passWord" id="passWord"><br />
<br />
<label for="enterUsername">Confirm Password:</label><br><input type="password" name="passwordConfirm" id="passwordConfirm"><br />
<br />
<input type="submit" value="Submit" >
</form>
</body>
</html>