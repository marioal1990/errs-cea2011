<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="es.cea.agendatelefonica.ContactoTel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Agenda telefonica</title>
</head>
<body>
<h1>AGENDA TELEFÓNICA</h1>
<HR></HR>
<ul>
<%
List<ContactoTel>contactos=(List)request.getAttribute("contactos");

for(ContactoTel contacto:contactos){
%>
<li><%=contacto.getNombre()%>: <%=contacto.getTelefono()%>
<a href='modificar?nombre=<%=contacto.getNombre()%>'> [Modificar]</a><a href='borrar?nombre=<%=contacto.getNombre()%>'>[Borrar]</a><br></br>

</li> 

<%	
}
%>
</ul>
<a href='nuevo'> Nuevo </a>

</body>
</html>