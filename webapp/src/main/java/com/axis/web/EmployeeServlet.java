package com.axis.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.axis.web.entity.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =	response.getWriter();
		
			out.print("<h1 style='color:red'>Welcome to Employee Servlets</h1>");
		
			
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename =	request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("salary"));
			 
			 Employee emp = new Employee();
			 
			 	emp.setEid(eid);
			 	emp.setEname(ename);
			 	emp.setSalary(salary);
			 
			 	
			 	HttpSession session =	request.getSession();
			 	
			 //ServletContext application =		request.getServletContext();
			 
			// application.setAttribute("emp", emp);
			 
			 		session.setAttribute("emp", emp);
			 	
			RequestDispatcher rd = 		request.getRequestDispatcher("/DisplayServlet");
			 	
					//rd.forward(request, response);
			
			System.out.println(session);
					session.invalidate();
					rd.include(request, response);
					
					
			
			// Employee class obj call setter and set above values to emp object using setter
			 
			 // dao.addEmployee(employee); --> connect with JDBC any DB 
			 
			 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
