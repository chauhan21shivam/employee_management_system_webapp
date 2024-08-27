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
	<div class="container box">
        <form action="add_emp" method="post" class="form-container2">
            <div class="field">
            <label for="id">Employee Id:</label>
            <input type="number" id="id" name="id"><br>
            </div>
            <div class="field">
            <label for="name">Employee Name:</label>
            <input type="text" id="name" name="name"><br>
            </div>
            <div class="field">
            <label for="salary">Employee Salary:</label>
            <input type="text" id="salary" name="salary"><br>
            </div>
            <div class="field">
            <label for="phone">Employee Phone:</label>
            <input type="tel" id="phone" name="phone"><br>
             </div>
            <div class="field">
            <label for="password">Employee Password:</label>
            <input type="password" id="password" name="password"><br>
             </div>
            <div class="field">
            <label for="role">Employee Role:</label>
            <input type="text" id="role" name="role"><br>
            </div>
            <input type="submit" value="Submit">
       
</body>
</html>
<! removed form tag intentionally to add message within block>