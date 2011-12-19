package es.cea.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MiAplicacion")
public class SuperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String nombreUsuario = request.getParameter("nombreUsuario");
	String claveUsuario = request.getParameter("claveUsuario");
	
	System.out.println("Pasando por el get" + nombreUsuario+ " = " +claveUsuario);
	
	PrintWriter writer = response.getWriter();
	
	writer.println ("<html>" + "<body>"+ "hola ");
	writer.println ("<h1>nombreUsuario: " + nombreUsuario+ "</h1>");
	writer.println ("claveUsuario:  " + claveUsuario);
	writer.println ("fin proceso!!! ");
	writer.close();
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
