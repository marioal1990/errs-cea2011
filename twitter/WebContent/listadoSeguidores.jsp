<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Listado de seguidores</title>
</head>
<body>
<h1>Listado de seguidores:</h1>
<hr></hr>
<hr></hr>
<ul>
   
             	<c:forEach items="${requestScope.seguidores}" var="usuario">  
               		 
                    	<li>${usuario.nombre}
						</li>
               			<br></br>
               			
               			<a href = './mensajesUsuario'> Volver al inicio </a>
               			
               </c:forEach>
		</ul>
		

</body>
</html>