<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Pr�ctica de Factorial de N�mero</h2>
	<form method="GET" action="FactorialServlet">
		<p>
			<label for="txtFactorial">Introduce un n�mero a calcular su factorial:</label>
			<input type="text" id="txtFactorial" name="txtFactorial">
		</p>
		<p>
			<label for="txtPassword">Introduce password:</label>
			<input type="password" id="txtPassword" name="txtPassword">
		</p>
		<p>
			<input type="submit" value="Calcular Factorial">
		</p>
	</form>
</body>
</html>