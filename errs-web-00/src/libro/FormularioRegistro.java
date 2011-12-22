package libro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormularioRegistro")
public class FormularioRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>\n" +"<html>\n" +"<head>\n" +"<meta charset=\"ISO-8859-1\">\n" +"<title>Nuevo Libro</title>\n" +"</head>\n" +
					"<body>\n" +"<h2>Login</h2><br /><form name=\"registro\" action=\"./Registro\">" +"<ul>" +"<li><span>Nombre </span><input type=\"text\" name=\"nombreUsuario\" /></li>" +
					"<li><span>Clave </span><input type=\"password\" name=\"claveUsuario\"/></li>" +"</ul>" +"<input type=\"submit\" value=\"Enviar\" />" +"</form>");
		writer.println("</body>\n" +"</html>\n");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

