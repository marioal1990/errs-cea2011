<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Listado de todos los usuarios</title>
</head>
<body>
<h1>LISTADO DE TODOS LOS USUARIOS</h1>
<hr></hr>
     
     	<ul>
   
             	<c:forEach items="${requestScope.listaUsuarios}" var="usuario">  
               		 
                    	<li>${usuario.nombre} 	<form action='./seguirUsuario' method='get'>
												<input type='hidden' name='nombre' value ='${usuario.nombre}'> 
												<input type='submit' value= "Seguir" >
											    </form>
						</li>
               			<br></br>
               </c:forEach>
		</ul>


</body>
</html>