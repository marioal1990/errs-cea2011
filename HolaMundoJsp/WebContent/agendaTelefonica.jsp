<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>  
<jsp:include page="principioDoc.jsp" />

<body>
<div id="menu">
	<ul>
		<li class="active"><a href="index.htm"title="" onMouseOver="playSound(0)" onMouseOut="stopSound(0)">Home</a></li>
		<li><a href="about.htm" title="" onMouseOver="playSound(0)" onMouseOut="stopSound(0)">EXIT</a></li>
		
	</ul>
</div>

	<div id="content">

	  <div id="left">
						<br/>
						<h1>News and Events </h1>
						<img src="images/free-flash-templates.jpg" style="margin-bottom:5px;">
						
						<span class="blue">26/01/2012 - Creación</span>
						<br/>
						<br/>
		  			
		  			<br/>
						
<br/>
<br/>
	  </div>
			<br/>
			<div id="right"><h1>Company profile</h1><span class="blue"></span>
				<br/>
				<img src="images/cerises.jpg" align="right" style="margin-left:10px" title=""><h1>AGENDA TELEFÓNICA</h1>
<HR></HR>
<ul>

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

		