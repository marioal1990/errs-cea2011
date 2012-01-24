<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="es.cea.agendatelefonica.ContactoTel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Borrar</title>
</head>
<%
	ContactoTel contacto=(ContactoTel)request.getAttribute("contacto");
	
%>
<body>
<h1>ESTÁS SEGURO DE BORRAR CONTACTO???</h1>
<h2>Contacto: <%= contacto.getNombre()%> </h2> 
<h2>Número: <%=contacto.getTelefono()%></h2> <br></br>


<a href='borradoOK?nombre=<%=contacto.getNombre()%>'>[OK]</a> 
<a href='agenda'>[Volver]</a> 

</body>
</html>