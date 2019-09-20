package com.ajaxgson.practica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajaxgson.practica1.model.Cliente;
import com.google.gson.*;

@WebServlet("/Practica1GsonServlet")
@MultipartConfig
public class Practica1GsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		String nombreCliente = request.getParameter("nombreCliente");
		String domicilioCliente = request.getParameter("domicilioCliente");
		
		PrintWriter salida = response.getWriter();
		salida.println("Id Cliente:"+idCliente);
		salida.println("Nombre del Cliente:"+nombreCliente);
		salida.println("Domicilio del Cliente:"+domicilioCliente);
		
		Cliente objCliente = new Cliente(idCliente, nombreCliente, domicilioCliente);
		Gson gson = new Gson();
		
		String jsonCliente = gson.toJson(objCliente);
		
		salida.println("El Json Resultante es:"+jsonCliente);
		
		salida.close();
	}

}
