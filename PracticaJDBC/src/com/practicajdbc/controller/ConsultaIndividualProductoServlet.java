package com.practicajdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConsultaIndividualProductoServlet")
public class ConsultaIndividualProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProducto=request.getParameter("txtIdProducto");
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
			while(rs.next())
			{
				salida.print("Id Producto:"+rs.getInt("IdProducto")+"   ");
				salida.print("Nombre del Producto:"+rs.getString("NombreProducto")+"   ");
				salida.print("Precio del Producto:"+rs.getDouble("precio")+"   ");
				salida.print("<br/>");
			}
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
