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



@WebServlet("/LibroEditProcess")
public class LibroEditProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try
		{
			HttpSession ses = request.getSession();
			Object o = ses.getAttribute("nombreAdmin");			
			Connection conexion = (Connection) ses.getAttribute("conexion");			

			Statement s = conexion.createStatement();
			
			
			PrintWriter writer = response.getWriter();
			writer.println("<!DOCTYPE html>\n" +"<html>\n" +"<head>\n" +"<meta charset=\"ISO-8859-1\">\n" +"<title>Insert title here</title>\n" +"</head>\n" +"<body>\n");
			if(o == null)
			{
				writer.println("Usuario no Registrado<br />");
				throw new UsuarioNoRegistrado();
			}
			writer.println("Usuario Registrado. Bienvenido " + o + "<h2>Editar Libro</h2>"); 	
			int rsUpdate = s.executeUpdate("update libros set nombre='"+ request.getParameter("nombre") +"', fecha='" + request.getParameter("fecha") + "', idAutor="+Integer.parseInt(request.getParameter("idAutor"))+" where id="+ Integer.parseInt(request.getParameter("id")) +" ");
			ResultSet rs = s.executeQuery("select * from libros where id="+ Integer.parseInt(request.getParameter("id")));
			writer.println("<a href=\"./LibroDetail?id=" + Integer.parseInt(request.getParameter("id")) + "\">[Mostra libro modificado]</a> " +"<br /><a href=\"./Libros\">[Listar todos los libros]</a>");
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