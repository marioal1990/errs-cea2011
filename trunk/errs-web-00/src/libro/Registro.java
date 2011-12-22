package libro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();
		if (request.getParameter("nombreUsuario").equals("Rocio")
				&& request.getParameter("claveUsuario").equals("Rocio")) {
			
			ses.setAttribute("nombreAdmin",
					request.getParameter("nombreUsuario"));
			PrintWriter writer = response.getWriter();
			writer.println("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n"
					+ "<meta charset=\"ISO-8859-1\">\n"
					+ "<title>Nuevo Libro</title>\n" + "</head>\n" + "<body>\n"
					+ "<h2><a href=\"./Libros\">[Listado Libros]</a>");
			writer.println("</body>\n" + "</html>\n");
			if(ses.getAttribute("conexion")==null)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/libreria","root", "root");
					ses.setAttribute("conexion", conexion);
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				
			}
			
		} else {
			PrintWriter writer = response.getWriter();
			writer.println("<!DOCTYPE html>\n"+ "<html>\n"+ "<head>\n"+ "<meta charset=\"ISO-8859-1\">\n"
					+ "<title>Nuevo Libro</title>\n"+ "</head>\n"+ "<body>\n"
					+ "<h2>Login</h2><br /><form name=\"registro\" action=\"./Registro\">"
					+ "<ul>"+ "<li><span>Nombre </span><input type=\"text\" name=\"nombreUsuario\" /></li>"+ "<li><span>Clave </span><input type=\"password\" name=\"claveUsuario\"/></li>"
					+ "</ul>" + "<input type=\"submit\" value=\"Enviar\" />"+ "</form><br />Usuario/Contrase&ntilde;a incorrecta");
			writer.println("</body>\n" + "</html>\n");
		}
	}
	


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

}
