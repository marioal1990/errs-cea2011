<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Listado de usuarios seguidos</title>
</head>
<body>
<h1>LISTADO DE SEGUIDOS</h1>
<hr></hr>

<ul>
           <c:forEach items="${requestScope.seguidos}" var="usuario">  
               		 
                    	<li>${usuario.nombre}
						</li>
               			<br></br>
               			
               			<a href = './mensajesUsuario'> Volver al inicio </a>
               			
               </c:forEach>
		</ul>

</body>
</html>