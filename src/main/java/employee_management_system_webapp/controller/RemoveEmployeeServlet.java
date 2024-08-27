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
		String source = req.getParameter("source"); // Get the source parameter
		
		boolean result = eDao.removeEmployee(id);
	
//		PrintWriter pw = resp.getWriter();
		
		RequestDispatcher rdError = req.getRequestDispatcher("error.jsp");
		RequestDispatcher rdViewAll = req.getRequestDispatcher("view_all_emp");
		RequestDispatcher rdViewEmp = req.getRequestDispatcher("view_emp");
		
		if(result) {
			if ("viewAll".equals(source)) {
				rdViewAll.forward(req, resp);
				
			} else if ("viewEmployee".equals(source)) {
				req.setAttribute("empid", id);
				rdViewEmp.forward(req, resp);
				
			} else {
				// Default case, redirect to admin operations or a suitable page
				resp.sendRedirect("admin_operations.jsp");
				
			}
		} else {
			rdError.forward(req, resp);
		}
	}
}