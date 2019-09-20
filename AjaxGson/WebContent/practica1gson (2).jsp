<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <title>Insert title here</title>
    </head>

    <body>
        <div class="container">
            <h2>Practica 1 - Envío de datos de un Formulario</h2>
            <div class="row">
                <div class="form-horizontal">
                    <div class="form-group">
                        <label for="txtIdCliente">Introduce el Id del Cliente:</label>
                        <input class="form-control" id="txtIdCliente" name="txtIdCliente" type="text">
                    </div>
                    <div class="form-group">
                        <label for="txtNombreCliente">Introduce el Nombre del Cliente:</label>
                        <input class="form-control" id="txtNombreCliente" name="txtNombreCliente" type="text">
                    </div>
                    <div class="form-group">
                        <label for="txtFechaNacimientoCliente">Introduce la Fecha de Nacimiento del Cliente:</label>
                        <input class="form-control" id="txtFechaNacimientoCliente" name="txtFechaNacimientoCliente" type="date">
                    </div>
                    <div class="form-group">
                        <label for="txtHoraNacimientoCliente">Introduce la Hora de Nacimiento del Cliente:</label>
                        <input class="form-control" id="txtHoraNacimientoCliente" name="txtHoraNacimientoCliente" type="time">
                    </div>

                    <div class="form-group">
                        <label for="tiposSangre">Selecciona el tipo de Sange del Cliente:</label>
                        <select id="tiposSangre" name="tiposSangre">
                            <option selected value="O-">O-</option>
                            <option value="O+">O+</option>
                            <option value="A-">A-</option>
                            <option value="A+">A+</option>
                            <option value="B-">B-</option>
                            <option value="B+">B+</option>
                            <option value="AB-">AB-</option>
                            <option value="AB+">AB+</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="EstadoCivil">Selecciona el tipo de Sange del Cliente:</label>
                        <select id="EstadoCivil" name="EstadoCivil">
                            <option selected value="Soltero">Soltero</option>
                            <option value="Casado">Casado</option>
                            <option value="Divorciado">Divorciado</option>
                            <option value="Viudo">Viudo</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="SexoCliente">Sexo:</label>
                        <input class="radio" id="SexoCliente" name="SexoCliente" type="radio" value="Hombre" checked> Hombre</input>
                        <input class="radio" id="SexoCliente" name="SexoCliente" type="radio" value="Mujer">Mujer</input>
                    </div>
                    <div id="resultado"></div>
                    <div class="form-group">
                        <input id="btnEnviarDatos" class="btn btn-primary" type="button" value="Envía Formulario">
                    </div>
                    <div class="form-group">
                        <a class="btn btn-primary" href="index.jsp">Menu Principal</a>
                    </div>
                </div>
            </div>
        </div>
        <script src="script/jquery.js"></script>
        <script src="script/bootstrap.min.js"></script>
        <script src="script/practica1gson.js"></script>
    </body>

    </html>