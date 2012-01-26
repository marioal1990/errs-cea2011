<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Modifica Contacto</title>
</head>
<body>
<h2>MODIFICAR CONTACTO</h2>
	<%
		
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		%>
		
	
<!--<a href="./ModificarContactoServlet?nombre=<%=nombre%>&telefono=<%=telefono %>">Borrar </a>-->
	
<form method="get" name="OK"  action="./ModificarContactoServlet">

<INPUT type="hidden" value="<%=nombre %>" name="nombreAnterior"/>
<INPUT type="hidden" value="<%=telefono %>" name="telefonoAnterior"/>

<INPUT type="text" value="<%=nombre %>" name="nombreNuevo"/>
<INPUT type="text" value="<%=telefono %>" name="telefonoNuevo"/>

	<input type="submit" name="OK" value="OK">
</form><br>

<a href="./agenda">Volver </a>

</body>
</html>