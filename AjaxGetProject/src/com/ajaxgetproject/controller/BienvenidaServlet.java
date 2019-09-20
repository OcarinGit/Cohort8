package com.ajaxgetproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ajaxgetproject.model.Bienvenida;

@WebServlet("/BienvenidaServlet")
public class BienvenidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		Bienvenida objBienvenida = new Bienvenida();
		objBienvenida.setNombre(request.getParameter("txtNombre"));
		salida.print("Bienvenido al servidor "+objBienvenida.getNombre());
	}

}
