package com.sumanumeros.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sumanumeros.model.OperacionesAritmeticas;

@WebServlet("/SumaNumerosServlet")
public class SumaNumerosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*int numero1 = Integer.parseInt(request.getParameter("txtNumero1"));
		int numero2= Integer.parseInt(request.getParameter("txtNumero2"));
		int resultadoSuma=numero1+numero2;
		
		response.getWriter().write("El resultado de la suma es:"+resultadoSuma);
		*/
		OperacionesAritmeticas objOperaciones=new OperacionesAritmeticas();
		
		int numero1= Integer.parseInt(request.getParameter("txtNumero1"));
		objOperaciones.setInumero1(numero1);
		
		int numero2 = Integer.parseInt(request.getParameter("txtNumero2"));
		objOperaciones.setInumero2(numero2);
		
		int SumaNumeros=objOperaciones.sumaNumeros();
		response.getWriter().write("La suma de los números es:"+SumaNumeros);
	}

}






