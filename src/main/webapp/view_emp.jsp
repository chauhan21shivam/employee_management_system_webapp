<%@page import="employee_management_system_webapp.model.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employee emp = (Employee)request.getAttribute("employee");
	%>
	<h1>Employee Datails</h1><br><br>
	<h2>Employee Id : <%= emp.getId() %></h2>
	<h2>Employee Name : <%= emp.getName() %></h2>
	<h2>Employee salary : <%= emp.getSalary() %></h2>
	<h2>Employee Phone : <%= emp.getPhone() %></h2>
	<h2>Employee Role : <%= emp.getRole() %></h2>
	<a href = 'admin_operations.jsp'>Go to Admin Operations </a>
			
</body>
</html>