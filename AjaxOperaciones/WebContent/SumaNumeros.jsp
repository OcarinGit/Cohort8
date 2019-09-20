<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <h2>Suma de Números</h2>
        <p>
            <label for="txtNumero1">Introduce un Número:</label>
            <input id="txtNumero1" name="txtNumero1" type="text">
        </p>
        <p>
            <label for="txtNumero2">Introduce un Número:</label>
            <input id="txtNumero2" name="txtNumero2" type="number">
        </p>
        <input id="btnSuma" type="button" value="Suma Numeros">
        <p>
            <div id="resultadoSuma"></div>
        </p>
        <script src="script/script.js"></script>
    </body>

    </html>