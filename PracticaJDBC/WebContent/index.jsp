<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <title>Proyecto JDBC</title>
    </head>

    <body>
        <h2>Proyecto JDBC</h2>
        <h3>Gestión de Productos</h3>
        <ul>
        	<li><a href="ConsultaGeneralProductos.jsp">Consulta General Productos</a></li>
        	<li><a href="ConsultaIndividualProductos.jsp">Consulta Individual Productos</a></li>
        	<li><a href="AltaProductos.jsp">Alta de Productos Normal</a></li>
        	<li><a href="AltaProductosPrepared.jsp">Alta de Productos con Prepared Statements</a></li>
        	<li><a href="BorrarProductos.jsp">Borrar Productos</a></li>
            <li><a href="ModificarProductos.jsp">Modificar Productos</a></li>
            <li><a href="TransaccionesProductosServlet">Ejemplo de Transacciones en productos</a></li>
        </ul>
        <hr/>
        <h3>Gestión de Clientes</h3>
        <ul>
        	<li><a href="ConsultaGeneralClientes.jsp">Consulta General Clientes</a></li>
        	<li><a href="ConsultaIndividualClientes.jsp">Consulta Individual Clientes</a></li>
        	<li><a href="AltaClientes.jsp">Alta de Clientes Normal</a></li>
        	<li><a href="AltaClientesPrepared.jsp">Alta de Clientes con Prepared Statements</a></li>
        	<li><a href="BorrarClientes.jsp">Borrar Clientes</a></li>
        	<li><a href="ModificarClientes.jsp">Modificar Clientes</a></li>
        </ul>
        <script src="script/jquery.js"></script>
        <script src="script/bootstrap.min.js"></script>
        <script src="script/script.js"></script>
    </body>

    </html>