<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Suma Numeros</title>
</head>
<body>
	<h1> Práctica Suma de Números</h1>
	
	<form method="GET" action="SumaNumerosServlet">
	<p>
		<label for="txtNumero1">Introduce un número:</label>
		<input class="form-control" type="text" id="txtNumero1" name="txtNumero1">
	</p>
	<p>
		<label for="txtNumero2">Introduce un número:</label>
		<input class="form-control" type="text" id="txtNumero2" name="txtNumero2">
	</p>
	<p>
		<input class="btn btn-primary" type="submit" value="Suma los números">
	</p>
	</form>

<script src="scripts/jquery.js"></script>
<script src="scripts/bootstrap.min.js"></script>
<script src="scripts/script.js"></script>
</body>
</html>