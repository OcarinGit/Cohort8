<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Práctica 2 - Serialización de un objeto Json mediante Gson</h2>
    <p>
        <label for="txtIdProducto">Introduce el Id del Producto:</label>
        <input id="txtIdProducto" name="txtIdProducto" type="text">
    </p>
    <p>
        <label for="txtNombreProducto">Introduce el Nombre del Producto:</label>
        <input id="txtNombreProducto" name="txtNombreProducto" type="text">
    </p>
    <p>
        <label for="txtPrecioProducto">Introduce el Precio del Producto:</label>
        <input id="txtPrecioProducto" name="txtPrecioProducto" type="text">
    </p>
    <p>
        <input id="btnSerializa" type="button" value="Serializa el Objeto">
    </p>
    <div id="resultado"></div>
    <script src="script/practica2gson.js"></script>
</body>
</html>