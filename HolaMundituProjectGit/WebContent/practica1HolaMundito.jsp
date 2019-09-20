<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Mi Primer Proyecto MVC</h1>
	<form action="HolaMundituServlet" method="POST">
	<p>
		<label for="txtTesto">Introduce un Testo:</label>
		<input type="text" id="txtTesto" name="txtTesto"> 
	</p>
	<p>
		<label for="txtTesto2">Introduce otro Testo:</label>
		<input type="text" id="txtTesto2" name="txtTesto2"> 
	</p>
	<p>
		<input type="submit" value="Da Click!">
	</p>
	</form>
</body>
</html>