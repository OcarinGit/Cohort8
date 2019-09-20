package com.practicajdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuscarProductoServlet")
public class BuscarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProducto = request.getParameter("txtIdProducto");
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		//Definimos las variables de conexión a la base de datos
		String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String nombreUsuario = "root";
		String password = "root";
		//Encerrar en un try catch las operaciones a la base de datos
		try
		{
			//Crear un objeto Driver del package com.mysql.jdbc
			//Driver = new Driver();
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(url, nombreUsuario, password);
			Statement stmnt = conn.createStatement();
			ResultSet rs = stmnt.executeQuery("select * from productos");
			while(rs.next())
			{
				/*
				salida.println("Campo Id Producto:"+rs.getInt(1));
				salida.println("Campo Nombre Producto:"+rs.getString(2));
				salida.println("Campo Precio:"+rs.getDouble(3));
				*/
				salida.println("Campo Id Producto:"+rs.getInt("IdProducto"));
				salida.println("Campo Nombre Producto:"+rs.getString("NombreProducto"));
				salida.println("Campo Precio:"+rs.getDouble("precio"));
				salida.println("<br/>");
			}
			rs.close();
			stmnt.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
		
		salida.close();
	}

}
