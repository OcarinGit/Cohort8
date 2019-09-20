<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
    <h2>Práctica 3 - Deserialización de un archivo Json mediante Gson</h2>
    <h3>Obtener un objeto Java a partir de una cadena Json</h3>

    <p>
        <label for="txtCadenaJson">Introduce una cadena Json</label>
        <input id="txtCadenaJson" name="txtCadenaJson" type="text" placeholder="{IdProducto:valor, NombreProducto:valor, PrecioProducto:Valor}" size="90">
    </p>
    <p>
        <input id="btnDeserializa" type="button" value="Deserializa el Objeto">
    </p>
    <div id="resultado"></div>
    <script src="script/practica3gson.js"></script>
</body>
</html>