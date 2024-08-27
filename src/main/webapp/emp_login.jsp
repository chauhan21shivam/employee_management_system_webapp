<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
	<form action="emp_login" method="post" autocomplete="off" class="form-container">
		<label for="id">Employee Id:</label>
		<input type="number" id="id" name="id"><br>
		<label for="password">Employee Password:</label>
		<input type="password" id="password" name="password"><br>
		<input type="submit" value="Login">
	
</body>
</html>
<! removed form tag intentionally to add message within block>