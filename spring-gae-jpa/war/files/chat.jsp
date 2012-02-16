<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Chat</title>

</head>
<body>
<h1>CHAT CON SPRING</h1>
<hr></hr>
<hr></hr>


	<ul>
		<c:forEach items="${comentario}"var="coment">
			<li>${coment.texto}</li>
		</c:forEach>
	</ul>
	

	<ul>
		<c:forEach items="${usuario}"var="usu">
			<li>${usu.nombre}</li>
		</c:forEach>
	</ul>
	
	<br></br>
	<br></br>
	<br></br>
	<INPUT type="text" value="" name="nombre"/>
</body>
</html>