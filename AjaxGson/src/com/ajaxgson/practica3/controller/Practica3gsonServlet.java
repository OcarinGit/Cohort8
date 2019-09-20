package com.ajaxgson.practica3.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.reflect.*;

import com.ajaxgson.model.Producto;
import com.google.gson.Gson;


@WebServlet("/Practica3gsonServlet")
@MultipartConfig
public class Practica3gsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cadenaJson=request.getParameter("txtCadenaJson");
		PrintWriter salida = response.getWriter();
		
		//salida.println("Cadena Json:"+cadenaJson);
		Gson objGson = new Gson();
		
		Producto objProducto = objGson.fromJson(cadenaJson, Producto.class);
		salida.println("Datos de Objeto<br>");
		salida.println("Id del Producto:"+objProducto.getIdProducto()+"<br>");
		salida.println("Nombre del Producto:"+objProducto.getNombreProducto()+"<br>");
		salida.println("Precio del Producto:"+objProducto.getPrecioProducto());
		
		//List<Producto> objProducto = objGson.fromJson(cadenaJson, new TypeToken<List<Producto>>() {}.getType());
		List<Producto> ListProducto = (List<Producto>) objGson.fromJson(cadenaJson, Producto.class);
		
		salida.println(ListProducto.size());
		/*if(ListProducto!=null)
		{
			for(Producto object : ListProducto)
			{
				salida.println("Id Producto:"+object.getIdProducto());
				salida.println("Nombre Producto:"+object.getNombreProducto());
				salida.println("Precio Producto:"+object.getPrecioProducto());
			}
		}
		else
		{
			salida.println("Nel!!!");
		}*/
		
		salida.close();
	}

}
