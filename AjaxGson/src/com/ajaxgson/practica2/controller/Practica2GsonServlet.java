package com.ajaxgson.practica2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Practica2GsonServlet")
public class Practica2GsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		String nombreCliente = request.getParameter("nombreCliente");
		String domicilioCliente = request.getParameter("domicilioCliente");
		
		PrintWriter salida = response.getWriter();
		salida.println("Id Cliente:"+idCliente);
		salida.println("Nombre del Cliente:"+nombreCliente);
		salida.println("Domicilio del Cliente:"+domicilioCliente);
		
		salida.close();
	}

}
