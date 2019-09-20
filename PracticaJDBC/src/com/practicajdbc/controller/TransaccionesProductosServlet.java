package com.practicajdbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransaccionesProductosServlet")
public class TransaccionesProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				Statement stmnt = null;
				int isRecordSaved=0;
				
				//Paso 3. Establecer la estructura del try catch
				try
				{
					//Paso 4. Instanciar el contraldor
					Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
					
					//Paso 5. Abrir la conexi�n
					conn = DriverManager.getConnection(url, usuario, contrasenia);
					//Paso 5.1. Colocamos el autocommit en false para acumular varias ejecuciones de una transacci�n
					conn.setAutoCommit(false);
					
					//Paso 6. Crear el statement
					stmnt = conn.createStatement();
					
					//Paso 7. Ejecutamos las sentencias sql que queramos
					try
					{
						isRecordSaved = stmnt.executeUpdate("insert into productos values (121,'Camisa',200.00)");
						isRecordSaved = stmnt.executeUpdate("insert into productos values (122,'Varita M�gica',300.00)");
						isRecordSaved = stmnt.executeUpdate("insert into productos values (123,'Cazuela',250.10)");
						conn.commit();
					}
					catch(SQLException ex)
					{
						System.out.println("Error en la Transacci�n");
						conn.rollback();
						salida.print("Se hizo un rollback por que alguna instrucci�n de la transacci�n fall�");
						ex.printStackTrace();
					}
					
					salida.print("<br/> <a href=\"index.jsp\">Regresar</a>");
				}
				catch(Exception e)
				{
					System.out.println("Error en la conexi�n");
					e.printStackTrace();
				}
				
				try {
					conn.close();
					stmnt.close();
				} catch (SQLException e) {
					System.out.println("Error en la cerrada de los objetos de la base de datos");
					e.printStackTrace();
				}
				
				salida.close();
	}

}
