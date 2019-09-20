<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts 2 con anotaciones</title>
</head>
<body>
	<h2>Struts2 con anotaciones</h2>
	<s:form action="persona.action" method="post">
		<!--<s:label for="txtNombre" value="Nombrecitu:"></s:label>-->
		<s:textfield var="txtNombre" label="Introduce tu Nombre" name="nombre" />
		<s:submit method="execute" value="Da Click"></s:submit>
	</s:form>

</body>
</html>


