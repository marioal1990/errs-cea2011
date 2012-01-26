<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="es.cea.ResultadoCalculadora"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<%
//accede al modelo!!
//request o sesion o servletContext
//e identificativo del atributo
ResultadoCalculadora res = (ResultadoCalculadora)request.getAttribute("resultado");
%>
<body>
<h1>SOY LA VISTA!!!!!</h1>
PARAMETRO1:<%=res.getSumando1() %><br></BR>
PARAMETRO2:<%=res.getSumando2() %><br></BR>
<HR></HR>
RESULTADO:<%=res.getResultado() %><br></BR>

</body>
</html>


