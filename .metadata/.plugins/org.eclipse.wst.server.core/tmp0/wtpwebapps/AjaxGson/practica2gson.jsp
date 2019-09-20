<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <H2>Práctica 1 - Proceso de Serialización (Javascript Se envía un objeto form)</H2>
        <h3>Cuando tenemos objetos java y queremos generar un archivo json</h3>
        <form id="frmPractica2" action="Practica2GsonServlet" method="POST">
            <p>
                <label for="txtIdCliente">Introduce el Id del Cliente:</label>
                <input id="txtIdCliente" name="txtIdCliente" type="text">
            </p>
            <p>
                <label for="txtNombreCliente">Introduce el Nombre del Cliente:</label>
                <input id="txtNombreCliente" name="txtNombreCliente" type="text">
            </p>
            <p>
                <label for="txtDomicilioCliente">Introduce el Domicilio del Cliente:</label>
                <input id="txtDomicilioCliente" name="txtDomicilioCliente" type="text">
            </p>
        </form>
        <input id="btnSerializa" type="button" value="Serializa el Objeto">
        <div id="resultado"></div>
        <script src="script/practica2gson.js"></script>
    </body>

    </html>