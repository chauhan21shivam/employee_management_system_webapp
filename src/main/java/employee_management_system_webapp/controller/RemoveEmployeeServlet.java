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

@WebServlet(value="/remove_emp")
public class RemoveEmployeeServlet extends HttpServlet {
	
	EmployeeDao eDao = new EmployeeDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		boolean result = eDao.removeEmployee(id);
		
		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rd1 = req.getRequestDispatcher("view_all_emp.jsp");
		RequestDispatcher rd2 = req.getRequestDispatcher("view_all_emp");
		
		if(result) {
			rd2.forward(req, resp);
		}
		else {
			rd1.include(req, resp);
			pw.println("Failed to remove employee");
		}
	}
}
