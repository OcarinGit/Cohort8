package com.practicajdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuscarActualizarProductoServlet")
public class BuscarActualizarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProducto=Integer.parseInt(request.getParameter("txtIdProducto"));
		String nombreProducto;
		Double precioProducto;
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		//Paso 1
		//Definimos las variables de conexión a la base de datos
		String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String nombreUsuario = "root";
		String password = "root";
		
		//Paso 2
		//Definimos los objetos de la conexión a la base de datos
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		
		//Paso 3
		//Escribimos la estructura del try catch y destruimos los objetos de la conexión a la base de datos
		try
		{
			//Paso 4
			//Creamos la instancia del Driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//Paso 5
			//Abrimos la conexión con el DriverManager
			conn = DriverManager.getConnection(url, nombreUsuario, password);
			
			//Paso 6
			//Creamos el objeto statement
			stmnt = conn.createStatement();
			
			//Paso 7
			//Ejecutamos la sentencia sql
			rs = stmnt.executeQuery("select * from productos where IdProducto="+idProducto);
			
			//Paso 8
			//Leer del resulset la información obtenida
			
			//Me ubico en el primer registro del query je
			rs.next();
			
			idProducto = rs.getInt("IdProducto");
			nombreProducto = rs.getString("NombreProducto");
			precioProducto = rs.getDouble("precio");
			
			request.setAttribute("AttrIdProducto", idProducto);
			request.setAttribute("AttrNombreProducto", nombreProducto);
			request.setAttribute("AttrPrecioProducto", precioProducto);
			
			RequestDispatcher view = request.getRequestDispatcher("EditarProducto.jsp");
			view.forward(request, response);
			
			//salida.print("Id Producto:"+idProducto);
			//salida.println("Nombre Producto:"+nombreProducto);
			//salida.print("Precio Producto:"+precioProducto);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		salida.close();
	}

}
