package com.elpack.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elpack.model.ElPack;

@WebServlet("/ElPackServlet")
public class ElPackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Testitu!!!");
		String nombre = request.getParameter("txtNombre");
		ElPack objElPack = new ElPack();
		objElPack.setNombre(nombre);
		response.getWriter().write("Pasa el Pack "+objElPack.getNombre()+"!!!");
	}

}








