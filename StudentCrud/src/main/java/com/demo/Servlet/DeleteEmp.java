package com.demo.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Service.EmployeeServiceImpl;
import com.demo.Service.IEmployeeService;


@WebServlet("/deleteemp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IEmployeeService e1=new EmployeeServiceImpl();
		int id=Integer.parseInt(request.getParameter("eid"));
		e1.DeleteByid(id);
		RequestDispatcher rd=request.getRequestDispatcher("DisplayEmp");
		rd.forward(request, response);
	}

}
