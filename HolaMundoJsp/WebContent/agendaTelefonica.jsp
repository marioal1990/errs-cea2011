<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>  
<jsp:include page="principioDoc.jsp" />
<html>
<body>

<c:forEach  items="${applicationScope.agenda.contactos}" var="contacto">
<li>${contacto.nombre}
 ${contacto.telefono}

<a href='./PreguntarModificarServlet?nombre=${contacto.nombre}&telefono=${contacto.telefono}' >[Modificar]</a>
<a href='./PreguntarBorrarServlet?nombre=${contacto.nombre}&telefono=${contacto.telefono}' >[Borrar]</a>
</li>
</c:forEach> 

</ul>
<a href='./PreguntarIncluirContactoServlet' >[Añadir Contacto]</a>
				
				
				
				
			
	    <div style="clear: both;"></div>
</div>
<div id="footer">
	<p>Copyright &copy; 2012 YOUR COMPANY.</p>
</div>
<br/>
</div>
</body>
</html>

		