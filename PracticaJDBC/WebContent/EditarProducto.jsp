<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Editar Producto Seleccionado</h2>
	<form action="GuardarCambiosProductoServlet" method="post">
        <p>
            <label for="txtIdProducto">Id Producto:</label>
            <input type="text" id="txtIdProducto" name="txtIdProducto" value="<%=request.getAttribute("AttrIdProducto")%>" disable>
        </p>
        <p>
            <label for="txtNombreProducto">Nombre de Producto:</label>
            <input type="text" id="txtNombreProducto" name="txtNombreProducto" value="<%=request.getAttribute("AttrNombreProducto")%>">
        </p>
        <p>
            <label for="txtPrecioProducto">Precio Producto:</label>
            <input type="text" id="txtPrecioProducto" name="txtPrecioProducto" value="<%=request.getAttribute("AttrPrecioProducto")%>">
        </p>
        <p>
            <input type="submit" value="Actualiza el Producto!!">
        </p>
        <a href="index.jsp">Menu Principal</a>
    </form>
</body>
</html>