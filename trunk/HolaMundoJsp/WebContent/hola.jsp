<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

<%
String sumando1 = request.getParameter("sumando1");
String sumando2 = request.getParameter("sumando2");
int resultado = Integer.parseInt(sumando1)+Integer.parseInt(sumando2);
%>
<h1>Calculadora</h1>
Sumando1: <%=sumando1 %><br></br>
Sumando2: <%=sumando2 %><br></br>
Resultado: <%=resultado %>
</body>
</html>