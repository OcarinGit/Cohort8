package com.ajaxgson.practica2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajaxgson.model.Producto;
import com.google.gson.*;

@WebServlet("/Practica2gsonServlet")
@MultipartConfig
public class Practica2gsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Producto objProducto = new Producto(Integer.parseInt(request.getParameter("txtIdProducto")), request.getParameter("txtNombreProducto"),Double.parseDouble(request.getParameter("txtPrecioProducto"))); 
		Producto objProducto = new Producto();
		objProducto.setIdProducto(Integer.parseInt(request.getParameter("txtIdProducto")));
		objProducto.setNombreProducto(request.getParameter("txtIdProducto"));
		objProducto.setPrecioProducto(Double.parseDouble(request.getParameter("txtPrecioProducto")));
		
		PrintWriter salida = response.getWriter();
		Gson objGson = new Gson();
		
		String json = objGson.toJson(objProducto);
		
		/*salida.println("Id del Producto:"+objProducto.getIdProducto());
		salida.println("Nombre del Producto:"+objProducto.getNombreProducto());
		salida.println("Precio del Producto:"+objProducto.getPrecioProducto());
		*/
		salida.println(json);
		salida.close();
	}

}
