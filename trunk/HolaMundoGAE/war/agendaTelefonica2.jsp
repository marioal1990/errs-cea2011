<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>  

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

<c:forEach  items="${applicationScope.agenda.contactos}" var="contacto">
<li>${contacto.nombre}
 ${contacto.telefono}

<a href='./PreguntarModificarServlet?nombre=${contacto.nombre}&telefono=${contacto.telefono}' >[Modificar]</a>
<a href='./PreguntarBorrarServlet?nombre=${contacto.nombre}&telefono=${contacto.telefono}' >[Borrar]</a>
</li>
</c:forEach> 

</ul>
<a href='./PreguntarIncluirContactoServlet' >[Añadir Contacto]</a>


</body>
</html>