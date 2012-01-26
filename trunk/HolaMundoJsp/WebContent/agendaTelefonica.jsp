<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="es.cea.agendatelefonica.Agenda"%>
<%@page import="es.cea.agendatelefonica.ContactoTel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Agenda Telefónica</title>
</head>
<body>
<h1>AGENDA TELEFÓNICA</h1>
<HR></HR>
<ul>
<%Agenda agenda = (Agenda) request.getSession().getServletContext().getAttribute("agenda");

for(ContactoTel contacto:agenda.contactos){%>	
<li><%=contacto.getNombre()%>: <%=contacto.getTelefono()%>

<a href='./PreguntarModificarServlet?nombre=<%=contacto.getNombre()%>&telefono=<%=contacto.getTelefono() %>' >[Modificar]</a>
<a href='./PreguntarBorrarServlet?nombre=<%=contacto.getNombre()%>&telefono=<%=contacto.getTelefono() %>' >[Borrar]</a>
</li>
<%
}
%>
</ul>
<a href='./PreguntarIncluirContactoServlet' >[Añadir Contacto]</a>


</body>
</html>