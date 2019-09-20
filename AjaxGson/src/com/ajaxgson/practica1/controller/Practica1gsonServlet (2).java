package com.ajaxgson.practica1.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Practica1gsonServlet")
@MultipartConfig
public class Practica1gsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Capturamos los campos del formulario enviado por el ajax
		int idCliente = Integer.parseInt(request.getParameter("idCliente"));
		String nombreCliente = request.getParameter("nombreCliente");
				
		String fechaStr = request.getParameter("fechaNacimientoCliente");
		SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaNacimientoCliente=null;
		try {
			fechaNacimientoCliente = (Date) objSimpleDateFormat.parse(fechaStr);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		
		String horaStr = request.getParameter("txtHoraNacimientoCliente");
		SimpleDateFormat objSimpleDateFormatHora = new SimpleDateFormat("HH:mm");
		Date horaNacimientoCliente= null;
		try {
			horaNacimientoCliente = (Date) objSimpleDateFormatHora.parse(horaStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String tipoSangreCliente = request.getParameter("tiposSangre");
		String EstadoCivil = request.getParameter("EstadoCivil");
		
		String SexoCliente = request.getParameter("SexoCliente");
		
		PrintWriter salida = response.getWriter();
		
		//Paso 1 . Definir las variables
		Properties props = new Properties();
		String propNombreArchivo="config.properties";
		InputStream input = null;
		
		input = getClass().getClassLoader().getResourceAsStream(propNombreArchivo);
		props.load(input);
		
		//Paso 2. Crear los objetos
		Connection conn = null;
		PreparedStatement stmnt = null;
		int isRegistroGuardado=0;
		String sql = "insert into Clientes (IdCliente, NombreCliente, FechaNacimiento, HoraNacimiento, TipoSangre, EstadoCivil, sexo) values(?,?,?,?,?,?,?)";
		//String sql = "insert into Clientes (IdCliente, NombreCliente) values(?,?)";
		//Paso 3. Estructura del try catch
		try
		{
			//Paso 4. Instanciar el driver
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			
			//Paso 5. Abrir la conexión
			conn = DriverManager.getConnection(props.getProperty("miUrl"), props.getProperty("miUsuario"), props.getProperty("miPass"));
			
			//Paso 6. Crear el statement
			stmnt=conn.prepareStatement(sql);
			stmnt.setInt(1, idCliente);
			stmnt.setString(2, nombreCliente);
			stmnt.setString(3,  objSimpleDateFormat.format(fechaNacimientoCliente));
			stmnt.setString(4,  objSimpleDateFormatHora.format(horaNacimientoCliente));
			stmnt.setString(5, tipoSangreCliente);
			stmnt.setString(6, EstadoCivil.substring(0, 1));
			stmnt.setString(7, SexoCliente.substring(0, 1));
			
			//Paso 7. Ejecutamos la instrucción sql
			isRegistroGuardado=stmnt.executeUpdate();
			if(isRegistroGuardado!=0)
			{
				salida.println("Registro Guardado con Éxito");
			}
			else
			{
				salida.println("Registro NO fue Guardado");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		try {
			conn.close();
			stmnt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		/*String url = props.getProperty("miUrl");
		String user = props.getProperty("miUsuario");
		String pass = props.getProperty("miPass");
		
		/*salida.println("Link:"+props.getProperty("miUrl"));
		salida.println("Usuario:"+props.getProperty("miUsuario"));
		salida.println("Contrasena:"+props.getProperty("miPass"));
		/*String url="jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username="root";
		String password="root";
		/*salida.println("Id Cliente:"+idCliente);
		salida.println("Nombre del Cliente:"+nombreCliente);
		salida.println("Fecha de Nacimiento:"+objSimpleDateFormat.format(fechaNacimientoCliente));
		salida.println("Hora Nacimiento del Cliente:"+objSimpleDateFormatHora.format(horaNacimientoCliente));
		salida.println("Tipo de Sangre del Cliente:"+tipoSangreCliente);
		salida.println("Estado Civil:"+EstadoCivil);
		salida.println("Sexo del Cliente:"+SexoCliente);*/
		salida.close();
		
	}

}
