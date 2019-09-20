<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>

    <%! String salidaJson = "";%>
    
    <body>
        <H2>Resta de Números Ajax, Respuesta en Json</H2>
        <p>
            <label for="txtNumero1">Introduce un Número:</label>
            <input id="txtNumero1" name="txtNumero1" type="text">
        </p>
        <p>
            <label for="txtNumero2">Introduce un Número:</label>
            <input id="txtNumero2" name="txtNumero2" type="text">
        </p>
        <input id="btnResta" type="button" value="Resta Numeros">
        <p>
            <div id="resultadoResta"></div>
        </p>
        <p>
        	<div id="otraSalida"><%=request.getParameter("") %></div>
        </p>
        <script src="script/scriptResta.js"></script>
    </body>

    </html>