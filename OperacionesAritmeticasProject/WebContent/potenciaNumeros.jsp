<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Potencias</title>
</head>
<body>
	<h2>Ejercicio del cálculo de potencias</h2>
	<form method="GET" action="PotenciaServlet">
		<p>
			<label for="txtBase">Introduce la base:</label>
			<input id="txtBase" name="txtBase"	type="text">
		</p>
		<p>
			<label for="txtExponente">Introduce el exponente:</label>
			<input id="txtExponente" name="txtExponente" type="text">
		</p>
		<p>
			<input type="submit" value="Calcula Potencia!!">
		</p>
	</form>
</body>
</html>