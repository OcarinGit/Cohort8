package com.operacionesaritmeticas.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operacionesaritmeticas.model.OperacionesAritmeticas;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int iFactorial = Integer.parseInt(request.getParameter("txtFactorial"));
		response.getWriter().write("El valor a calcular su factorial es (doGet): "+iFactorial);
		response.getWriter().write("<br/>El valor del password es:"+request.getParameter("txtPassword"));
		
		response.getWriter().write("El valor del factorial es:"+OperacionesAritmeticas.factorial(iFactorial));
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int iFactorial = Integer.parseInt(request.getParameter("txtFactorial"));
		response.getWriter().write("El valor a calcular su factorial es (doPost): "+iFactorial);
		response.getWriter().write("<br/>El valor del password es:"+request.getParameter("txtPassword"));
	}

}


