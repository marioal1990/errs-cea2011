<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="principioDoc.jsp" />
<html>
<body>

<title>Incluye Contacto</title>

<h2>INCLUIR CONTACTO</h2>
  <form method="get" name="OK"  action="./IncluirContactoServlet">

<INPUT type="text" value="nombre" name="nombre"/>
<INPUT type="text" value="telefono" name="telefono"/>

<input type="submit" name="OK" value="OK">
</form><br>

<a href="./agenda">[Volver] </a>
</body>
</html>
		
<div style="clear: both;"></div>
</div>
<div id="footer">
	<p>Copyright &copy; 2012 YOUR COMPANY.</p>
</div>
<br/>
</div>
</body>
</html>

		