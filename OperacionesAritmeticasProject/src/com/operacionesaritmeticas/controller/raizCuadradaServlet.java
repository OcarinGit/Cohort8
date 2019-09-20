package com.operacionesaritmeticas.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operacionesaritmeticas.model.OperacionesAritmeticas;

@WebServlet("/raizCuadradaServlet")
public class raizCuadradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numero1=Integer.parseInt(request.getParameter("txtNumero"));
		OperacionesAritmeticas objOperaciones = new OperacionesAritmeticas();
		
		objOperaciones.setNumero1(numero1);
		response.getWriter().write("La raíz cuadrada es:"+objOperaciones.raizCuadrada());
		
	}

}
