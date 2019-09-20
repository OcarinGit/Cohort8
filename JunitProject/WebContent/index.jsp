<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Proyecto de JUnit</h2>
	<form method="POST" action="sumaServlet">
		<p>
			<label for="txtNumero1">Introduce un número:</label>
			<input type="text" id="txtNumero1" name="txtNumero1" required>
		</p>
		<p>
			<label for="txtNumero2">Introduce un número:</label>
			<input type="text" id="txtNumero2" name="txtNumero2" required>
		</p>
		<p>
			<input type="submit" value="Suma">
		</p>
	</form>
</body>
</html>