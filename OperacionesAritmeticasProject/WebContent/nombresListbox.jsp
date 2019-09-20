<%!String[] nombresAlumnos = {"Cesarin","Richard","Hugo","Julius","Pepe"};%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nombres Listbox</title>
</head>
<body>
	<h2>Práctica de Nombres en un Listbox</h2>
	<select name="misNombres">
		<option value="nombre1">Nombre1</option>
		<option value="nombre2">Nombre2</option>
		<option value="nombre3">Nombre3</option>
		
	</select>
	<label for="txtNombre">Nombre Estudiante 2:</label>
	<input type="text" id="txtNombre" value="<%=nombresAlumnos[2] %>">
</body>
</html>




