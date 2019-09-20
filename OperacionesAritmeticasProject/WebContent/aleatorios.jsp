<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aleatorios</title>
</head>
<body>
	<h2>Práctica de Generación de Números Pseudoaleatorios</h2>
	<form method="POST" action="AleatoriosServlet">
		<p>
			<label for="txtCantidadAleatorios">Cuantos aleatorios quieres?</label>
			<input type="text" id="txtCantidadAleatorios" name="txtCantidadAleatorios">
		</p>
		<p>
			<input type="submit" value="Genéramelos!!!">
		</p>
	</form>
</body>
</html>