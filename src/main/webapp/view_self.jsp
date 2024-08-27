<%@page import="employee_management_system_webapp.model.dto.Employee"%>
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
	<div class="container">
		<%
			Employee emp = (Employee)request.getAttribute("employee");
		%>
		<h1>Employee Datails</h1><br><br>
		<h2>Employee Id : <%= emp.getId() %></h2>
		<h2>Employee Name : <%= emp.getName() %></h2>
		<h2>Employee salary : <%= emp.getSalary() %></h2>
		<h2>Employee Phone : <%= emp.getPhone() %></h2>
		<h2>Employee Role : <%= emp.getRole() %></h2>
		
		<a href="update_self.jsp?id=<%=emp.getId()%>&name=<%=emp.getName()%>&salary=<%=emp.getSalary()%>&phone=<%=emp.getPhone()%>&password=<%=emp.getPassword()%>&role=<%=emp.getRole()%>">Update Employee</a>
		   <br><br>
		<a class="operations" href = 'emp_operations.jsp'>Go to Employee Operations </a>
	</div>		
</body>
</html>