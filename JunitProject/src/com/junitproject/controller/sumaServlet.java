package com.junitproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sumaServlet")
public class sumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		int numero1 = Integer.parseInt(request.getParameter("txtNumero1"));
		int numero2 = Integer.parseInt(request.getParameter("txtNumero2"));
		salida.write("Estamos en el servlet");
		
		salida.close();
	}

}
