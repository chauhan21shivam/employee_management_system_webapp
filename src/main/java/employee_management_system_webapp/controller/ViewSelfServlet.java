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

@WebServlet(value="/view_self")
public class ViewSelfServlet extends HttpServlet {
	
	EmployeeDao edao = new EmployeeDao();
	Employee emp;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int id = (Integer)session.getAttribute("empId");
	
		emp = edao.viewEmployee(id);
		PrintWriter pw = resp.getWriter();
		RequestDispatcher rd1 = req.getRequestDispatcher("view_self.jsp");
		RequestDispatcher rd2 = req.getRequestDispatcher("emp_operations.jsp");
		
		if(emp!=null) {
			req.setAttribute("employee", emp);
			rd1.forward(req, resp);
			
		}
		else {
			rd2.include(req, resp);
			pw.println("<h2 style='color: red;'>Employee ID Not Found</h2>");
		}
	}

}
