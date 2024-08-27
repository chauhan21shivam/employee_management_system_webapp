<%@page import="employee_management_system_webapp.model.dto.Employee"%>
<%@page import="java.util.List"%>
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
<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employees");
%>

<table >
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Salary</th>
	<th>Phone</th>
	<th>Password</th>
	<th>Role</th>
	<th colspan="2" style="text-align: center">Operations</th>
</tr>
	
	<%
		for(Employee emp : employees) {
	%>
<tr>
	<td> <%= emp.getId() %></td>
	<td> <%= emp.getName() %></td>
	<td> <%= emp.getSalary() %></td>
	<td> <%= emp.getPhone() %></td>
	<td> <%= emp.getPassword() %></td>
	<td> <%= emp.getRole() %></td>
	
	<td> <a class="remove btn" href ="remove_emp?id=<%=emp.getId()%>&source=viewAll"">Remove Employee</a></td>
	<td> <a class="operations btn" href ="update_emp.jsp?id=<%=emp.getId()%>&name=<%=emp.getName()%>&salary=<%=emp.getSalary()%>&phone=<%=emp.getPhone()%>&password=<%=emp.getPassword()%>&role=<%=emp.getRole()%>">Update Employee</a></td>

</tr>
	<%
		}
	%>

</table>
</body>
</html>