package employee_management_system_webapp.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import employee_management_system_webapp.model.dao.EmployeeDao;
import employee_management_system_webapp.model.dto.Employee;



@WebServlet(value="/emp_login")
public class EmployeeLoginServlet extends HttpServlet {
	
	EmployeeDao eDao = new EmployeeDao();
	Employee emp = new Employee();
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String  password = req.getParameter("password");
		
		emp.setId(id);
		emp.setPassword(password);
		
		PrintWriter pw = resp.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("emp_login.jsp");
		
		boolean result =  eDao.loginValidateForEmployee(emp);
		
		if(result) {
			HttpSession session = req.getSession();
			session.setAttribute("empId", id);
			resp.sendRedirect("emp_operations.jsp");
		}
		else {
			rd.include(req, resp);
			pw.println("<h2 style='color: red;'>Login Failed, Invalid id or password</h2>");
		}
	 }

}
