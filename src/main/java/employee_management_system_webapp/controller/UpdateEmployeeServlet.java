package employee_management_system_webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee_management_system_webapp.model.dao.EmployeeDao;
import employee_management_system_webapp.model.dto.Employee;

@WebServlet(value ="/update_emp")
public class UpdateEmployeeServlet extends HttpServlet {
	EmployeeDao eDao = new EmployeeDao();
	Employee emp;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String salary = req.getParameter("salary");
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");
		String role = req.getParameter("role");
		
		emp = eDao.viewEmployee(id);
		
		if(!name.isEmpty()) {
			emp.setName(name);
		}
		if(!salary.isEmpty()) {
			emp.setSalary(Double.parseDouble(salary));
		}
		if(!phone.isEmpty()) {
			emp.setPhone(Long.parseLong(phone));
		}
		if(!password.isEmpty()) {
			emp.setPassword(password);
		}
		if(!role.isEmpty()) {
			emp.setRole(role);
		}
		
		boolean result = eDao.UpdateEmployee(emp);
		PrintWriter pw = resp.getWriter();
		RequestDispatcher rd1 = req.getRequestDispatcher("update_emp.jsp");
		RequestDispatcher rd2 = req.getRequestDispatcher("view_all_emp");
		
		if(result) {
			rd2.forward(req, resp);
		}
		else {
			rd1.include(req, resp);
			pw.println("Failed to update Record");
		}
		
	}
}
