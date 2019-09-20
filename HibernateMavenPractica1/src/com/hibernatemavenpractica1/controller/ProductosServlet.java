package com.hibernatemavenpractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatemavenpractica1.model.Productos;

@WebServlet("/ProductosServlet")
public class ProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		int idProducto = Integer.parseInt(request.getParameter("txtIdProducto"));
		String nombreProducto = request.getParameter("txtNombreProducto");
		double precioProducto = Double.parseDouble(request.getParameter("txtPrecioProducto"));
		salida.print("Id Producto:"+idProducto);
		salida.print("Nombre Producto:"+nombreProducto);
		salida.print("Precio Producto:"+precioProducto);
		Productos producto1 = new Productos();
		producto1.setIdProducto(idProducto);
		producto1.setNombreProducto(nombreProducto);
		producto1.setPrecioProducto(precioProducto);
		
		//Paso 1
		//Seleccionamos el archivo de configuracion de hibernate y abrimos el objeto session
		//Forma 1
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory =  cfg.buildSessionFactory();
		
		//Forma 2
		//SessionFactory miSesionFactory= new Configuration().configure().buildSessionFactory();
		
		//Paso 2. Abrimos la sesion
		//Session miSesion = miSesionFactory.openSession();
		Session miSesion = factory.openSession();
		
		//Paso 3. Comenzamos la transacción
		Transaction miTransaccion = miSesion.beginTransaction();
		//Forma 2
		//miSesion.beginTransaction();
		
		//Paso 4. Guardamos el objeto
		miSesion.save(producto1);
		//Forma2
		//miSesion.save();
		
		//Paso 5. Hacemos commit
		miTransaccion.commit();
		//Forma 2
		//miSesion.getTransaction().commit();
		
		//Paso 6. Cerramos la sesion
		miSesion.close();
		//Paso
		salida.close();
	}

}
