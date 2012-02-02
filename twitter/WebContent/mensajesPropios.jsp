<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="clases.Mensaje"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Mensajes del usuario</title>
</head>
<body>

<h1>ESCRIBIR MENSAJE</h1>

<form action='./guardarMensaje' method='get'>
Mensaje: <input type='text' name='mensaje' value =''> <br></br>
<input type='submit' value='Enviar mensaje'>

<table cellspacing="0">
                
                <c:forEach items="${requestScope.mensajes}" var="mensaje">  
               		 <tr>
                    	<td>${mensaje.texto}</td>
               		 </tr>
              </c:forEach>

</table>
<a href =./listaUsuarios>Lista usuarios</a> <br></br>
<a href =./siguiendo>Siguiendo</a> <br></br>
<a href =./seguidores>Seguidores</a> <br></br>


</body>
</html>