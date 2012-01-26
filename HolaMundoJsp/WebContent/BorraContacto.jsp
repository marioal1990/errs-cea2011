<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="es.cea.agendatelefonica.ContactoTel"%>
<%@page import="es.cea.agendatelefonica.Agenda"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Borrar Contacto</title>

</head>
<body>
	<h2>¿Estas seguro de borrar contacto?</h2>
	Contacto:
	<%
		
		String nombre = request.getParameter("nombre");
	%>
	<%=nombre%>
	<br>Teléfono: 
	<%
		String telefono = request.getParameter("telefono");
	%>
		 <%=telefono%>
	

<form method="get" name="OK"  action="./BorrarContactoServlet">

<INPUT type="hidden" value="<%=nombre %>" name="nombre"/>
<INPUT type="hidden" value="<%=telefono %>" name="telefono"/>
	<input type="submit" name="OK" value="OK">
</form><br>
<a href="./agenda"> </a>
</body>
</html>