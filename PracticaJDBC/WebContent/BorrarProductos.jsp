<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Borrar Productos</h2>
	<form action="BorrarProductoServlet" method="post">
            <p>
                <label for="txtIdProducto">Introduce el Id del Producto:</label>
                <input type="text" id="txtIdProducto" name="txtIdProducto">
            </p>
            <p>
                <input type="submit" value="Buscar Producto">
            </p>
        </form>
</body>
</html>