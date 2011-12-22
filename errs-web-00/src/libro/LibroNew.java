package libro;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LibroNew")
public class LibroNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		HttpSession ses = request.getSession();
		Object o = ses.getAttribute("nombreAdmin");			
		Connection conexion = (Connection) ses.getAttribute("conexion");			

		Statement s = conexion.createStatement();

		Autor a= new Autor();
		ResultSet rs= s.executeQuery("select * from autores");
		List<Autor> listaAutor = new ArrayList<Autor>(); 
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>\n" +"<html>\n" +"<head>\n" +"<meta charset=\"ISO-8859-1\">\n" +"<title>Nuevo Libro</title>\n" +"</head>\n" +"<body>\n");
		if(o == null)
		{
			writer.println("Usuario no Registrado<br />");
			writer.println("<a href=\"./FormularioRegistro\">Logearse</a><br />");
			throw new UsuarioNoRegistrado();
		}
		writer.println("Usuario Registrado. Bienvenido " + o + "<h2>Nuevo Libro</h2>"); 	
		while (rs.next()) //Creo la lista de autores
			listaAutor.add(new Autor(rs.getInt(1), rs.getString(2), rs.getDate(3)));
			 
		writer.println("--- Detalle Libro---<br />");
		writer.println("" +
			"<form method=\"get\" action=\"LibroNewProcess\">" +"<ul>");
			writer.println("<li><label>Nombre </label><input type=\"text\" name=\"nombre\" /></li>" +
					"<li><label>Fecha </label><input type=\"text\" name=\"fecha\"/></li>" +
					"<li><label>Autor </label><select name=\"idAutor\">");
				for(Autor elementAutor:listaAutor)
					writer.println("<option value=\""+elementAutor.getId()+"\">"+elementAutor.getNombre()+"");
			writer.println("</select>");

		writer.println("" +"</ul>" +"<input type=\"submit\" value=\"Enviar\"  />"+"</form>" +"<br /><a href=\"./Libros\">[Volver]</a> ");
		writer.println("</body>\n" +"</html>\n");	
		writer.close();
		conexion.close();
	} catch (Exception e){
	   e.printStackTrace();
	} 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
