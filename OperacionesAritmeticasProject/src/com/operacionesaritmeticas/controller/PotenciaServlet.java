package com.operacionesaritmeticas.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operacionesaritmeticas.model.OperacionesAritmeticas;


@WebServlet("/PotenciaServlet")
public class PotenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int iBase=Integer.parseInt(request.getParameter("txtBase"));
		int iExponente=Integer.parseInt(request.getParameter("txtExponente"));
		
		response.getWriter().write("El valor de la base es: "+iBase+"<br/>");
		response.getWriter().write("El valor del exponente es: "+iExponente+"<br/>");
		
		OperacionesAritmeticas objOperaciones = new OperacionesAritmeticas();
		objOperaciones.setNumero1(iBase);
		objOperaciones.setNumero2(iExponente);
		response.getWriter().write("El valor de la Potencia es:"+objOperaciones.potencia());
	}

}


