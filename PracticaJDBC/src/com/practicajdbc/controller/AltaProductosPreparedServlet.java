package com.practicajdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AltaProductosPreparedServlet")
public class AltaProductosPreparedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obtenemos los datos del formulario
				int idProducto = Integer.parseInt(request.getParameter("txtIdProducto"));
				String nombreProducto = request.getParameter("txtNombreProducto");
				double precioProducto = Double.parseDouble(request.getParameter("txtPrecioProducto"));
				
				//Configuramos la salida (objeto response) del servidor
				response.setContentType("text/html");
				PrintWriter salida = response.getWriter();
				
				//Seguimos los pasos para la bd
				//Paso 1. Declaramos las variables
				String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
				String usuario="root";
				String contrasenia="root";
				
				//Paso 2. Declaramos los objetos de la bd
				Connection conn=null;
				PreparedStatement stmnt = null;
				int isRecordSaved=0;
				
				//Paso 3. Establecer la estructura del try catch
				try
				{
					//Paso 4. Instanciar el contraldor
					Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
					
					//Paso 5. Abrir la conexión
					conn = DriverManager.getConnection(url, usuario, contrasenia);
					
					//Paso 6. Crear el prepared statement
					stmnt = conn.prepareStatement("insert into productos values(?,?,?)");
					//Paso 6.1. Asignar los valores a cada variable del statement
					stmnt.setInt(1, idProducto);
					stmnt.setString(2, nombreProducto);
					stmnt.setDouble(3, precioProducto);
					//Paso 6.2. Ejecutamos el query
					isRecordSaved = stmnt.executeUpdate();
										
					if (isRecordSaved==1)
					{
						salida.print("Registro Guardado con éxito");
					}
					else
					{
						salida.print("Pelas!!, no se guardó el registro!!");
					}
					salida.print("<br/> <a href=\"AltaProductos.jsp\">Regresar</a>");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				try {
					conn.close();
					stmnt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				salida.close();
	}

}
