<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Ra�z Cuadrada N�meros</h2>
	<form method="GET" action="raizCuadradaServlet">
		<p>
			<label for="txtNumero">Introduce el n�mero que quieras calcular su ra�z cuadrada:</label>
			<input type="text" id="txtNumero" name="txtNumero">
		</p>
		<p>
			<input type="submit" value="Calcular Ra�z Cuadrada!!">
		</p>
	</form>
	<a href="operacionesaritmeticas.jsp">Regresar a Men� Principal</a>
</body>
</html>