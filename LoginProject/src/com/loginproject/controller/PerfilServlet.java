package com.loginproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PerfilServlet")
public class PerfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		
		
		HttpSession objSesion = request.getSession();
		if(objSesion != null && objSesion.getAttribute("usuario")!=null) //!objSesion.equals(null)
		{
			request.getRequestDispatcher("links.jsp").include(request, response);
			String usuario = (String) objSesion.getAttribute("usuario");
			salida.println("Hola "+usuario+" Bienvenido a tu perfil");
		}
		else
		{
			salida.println("Porfavó logueate primero");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		salida.close();
	}

}
