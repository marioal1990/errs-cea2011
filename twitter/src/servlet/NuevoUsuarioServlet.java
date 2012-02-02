package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Persistencia;
import clases.Usuario;


@WebServlet("/guardarNuevoUsuario")
public class NuevoUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NuevoUsuarioServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try  
		{  
			Usuario nuevoUsuario = new Usuario();
			nuevoUsuario.setNombre(request.getParameter("nombre"));
			nuevoUsuario.setClave(request.getParameter("clave"));
			Persistencia.guardarNuevoUsuario(nuevoUsuario);
			
			PrintWriter writer = response.getWriter();
			writer.println("<html> <head> </head><body>");
			writer.println("<font size='5'>Usuario registrado correctamente</font> <br>");
			writer.println("<a href = './twitter'> Volver al inicio </a><br>");
			writer.println("</body> </html>");
			writer.close();
			
		} catch (Exception e)  
		{  
			
			PrintWriter writer = response.getWriter();
			writer.println("<html> <head> </head><body>");
			writer.println("<font size='5'>Error en el registro</font> <br>");
			writer.println("<a href = './twitter'> Volver al inicio </a><br>");
			writer.println("</body> </html>");
			writer.close();
		   e.printStackTrace();  
		}   
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
