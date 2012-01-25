<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/simple" prefix="simple" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<fmt:setBundle basename="es.cea.i18n.Mensajes"/>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${fn:contains("curso java cea", "cea")}

<fmt:message key="hola"/>
<fmt:message key="webmaster"/>

<simple:menu  />

<simple:debugRequest />

<simple:form action="./holaTag.jsp">
	<simple:inputText name="input1"/>
	<simple:inputText name="input2"/>
	<simple:inputText name="input3"/>
	<simple:inputText name="adios"/>
	<simple:inputText name="hola"/>
</simple:form>

<simple:simpleTag color="red" mensaje="este es el mensaje que se visualiza" />

<simple:tablita celdas="un,dos,tres"/>

<simple:formRegistro action='/index.html' method='get'/>

<simple:enlaceGoogleTag  textoEnlace="asdfasdf" />
<simple:enlaceGoogleTag  textoEnlace="ir a google"/>
<simple:enlaceGoogleTag  textoEnlace="tu buscador favorito"/>
<simple:imagen url="http://www.google.es/images/srpr/nav_logo14.png"/>

</body>
</html>