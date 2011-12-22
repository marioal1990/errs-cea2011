package libro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@WebServlet("/LibroNewProcess")
public class LibroNewProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try
		{
			HttpSession ses = request.getSession();
			Object o = ses.getAttribute("nombreAdmin");			
			Connection conexion = (Connection) ses.getAttribute("conexion");			

			Statement s = (Statement) conexion.createStatement();	
			
			PrintWriter writer = response.getWriter();
			writer.println("<!DOCTYPE html>\n" +
					"<html>\n" +
						"<head>\n" +
							"<meta charset=\"ISO-8859-1\">\n" +
							"<title>Nuevo Libro</title>\n" +
						"</head>\n" +
						"<body>\n");
			if(o == null)
			{
				writer.println("Usuario no Registrado<br />");
				writer.println("<a href=\"./FormularioRegistro\">Logearse</a><br />");
				throw new UsuarioNoRegistrado();
			}
			writer.println("Usuario Registrado. Bienvenido " + o + "<h2>Nuevo Libro</h2>");
			int executeUpdate = s.executeUpdate("insert into libros (nombre, fecha, idAutor) values('"+ request.getParameter("nombre") +"', '" + request.getParameter("fecha") + "', "+Integer.parseInt(request.getParameter("idAutor"))+")");
			writer.println("Libro introducido correctamente.");
			writer.println("<br /><a href=\"./Libros\">[Listar todos los libros]</a>");
			writer.println("</body>\n" +
				"</html>\n");	
			writer.close();
			conexion.close();
		} catch (Exception e){
		   e.printStackTrace();
		} 
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
}
