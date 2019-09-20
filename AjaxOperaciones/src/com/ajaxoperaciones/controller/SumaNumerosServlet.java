package com.ajaxoperaciones.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajaxoperaciones.model.SumaNumeros;

@WebServlet("/SumaNumerosServlet")
public class SumaNumerosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numero1=Integer.parseInt(request.getParameter("Numero1"));
		int numero2=Integer.parseInt(request.getParameter("Numero2"));
		
		//response.setContentType("text");
		PrintWriter salida = response.getWriter();

		SumaNumeros objOperaciones = new SumaNumeros();
		objOperaciones.setNumero1(numero1);
		objOperaciones.setNumero2(numero2);
		salida.print(objOperaciones.sumarNumeros());

		salida.close();
	}

}
