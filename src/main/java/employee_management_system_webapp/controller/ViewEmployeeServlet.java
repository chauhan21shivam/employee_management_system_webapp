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

@WebServlet(value="/view_emp")
public class ViewEmployeeServlet extends HttpServlet {
	
	EmployeeDao edao = new EmployeeDao();
	Employee emp;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		emp = edao.viewEmployee(id);
		PrintWriter pw = resp.getWriter();
		RequestDispatcher rd1 = req.getRequestDispatcher("view_emp.jsp");
		RequestDispatcher rd2 = req.getRequestDispatcher("view.jsp");
		
		if(emp!=null) {
			req.setAttribute("employee", emp);
			rd1.forward(req, resp);
			
		}
		else {
			rd2.include(req, resp);
			pw.println("Employee ID Not Found");
		}
	}

}
