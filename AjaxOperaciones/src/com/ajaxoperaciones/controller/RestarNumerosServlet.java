package com.ajaxoperaciones.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajaxoperaciones.model.RestaNumeros;

@WebServlet("/RestarNumerosServlet")
public class RestarNumerosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numero1 = Integer.parseInt(request.getParameter("Pizza"));
		int numero2 = Integer.parseInt(request.getParameter("Tacos"));
		response.setContentType("application/json");
		
		PrintWriter salida = response.getWriter();
		RestaNumeros objRestaNumeros = new RestaNumeros();
		objRestaNumeros.setNumero1(numero1);
		objRestaNumeros.setNumero2(numero2);
		
		salida.println("{");
		salida.print("\"resultadoResta\":");
		salida.println(objRestaNumeros.restaNumeros());
		salida.println("}");
		salida.close();
	}

}
