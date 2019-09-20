<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Alta Productos</h2>
	<form method="POST" action="ProductosServlet">
	<p>
		<label for="txtIdProducto">Id Producto:</label>
		<input type="text" id="txtIdProducto" name="txtIdProducto">
	</p>
	<p>
		<label for="txtNombreProducto">Nombre Producto:</label>
		<input type="text" id="txtNombreProducto" name="txtNombreProducto">
	</p>
	<p>
		<label for="txtPrecioProducto">Precio Producto:</label>
		<input type="text" id="txtPrecioProducto" name="txtPrecioProducto">
	</p>
	<p>
		<input type="submit"value="Dar de Alta Producto"/>
	</p>
	</form>
</body>
</html>