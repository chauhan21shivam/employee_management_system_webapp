package employee_management_system_webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee_management_system_webapp.model.dao.EmployeeDao;
import employee_management_system_webapp.model.dto.Employee;

@WebServlet(value="/view_all_emp")
public class ViewAllEmpServlet extends HttpServlet{
	
	EmployeeDao eDao = new EmployeeDao();
	List<Employee> employees;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		employees = eDao.viewAllEmployee();
		PrintWriter pw = resp.getWriter();
		RequestDispatcher rd1 = req.getRequestDispatcher("admin_operations.jsp");
		RequestDispatcher rd2 = req.getRequestDispatcher("view_all_emp.jsp");
		
		if(employees != null) {
			req.setAttribute("employees", employees);
			rd2.forward(req, resp);
		}
		else {
			rd1.include(req, resp);
			pw.println("No Data Present");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    doPost(req, resp);
	}

}
