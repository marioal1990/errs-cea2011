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

import org.testng.annotations.Test;
@WebServlet("/Libros")
public class Libreria extends HttpServlet{


	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter writer = response.getWriter();
			writer.println("<html>" + "<body>" + "<h1>LISTADO DE LIBROS</h1>");

			Connection conexion;
			Statement s;
			ResultSet rs;
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "root");
			s = conexion.createStatement();
			rs = s.executeQuery("select * from libros");
			List<Autor> autores = new ArrayList<Autor>(); 
			List<Libros> libros = new ArrayList<Libros>();
			Autor a= new Autor();
			while (rs.next()){
				    
				    autores.add(new Autor(rs.getInt(1), rs.getString(2), rs.getDate(3)));
			}	
			rs = s.executeQuery("select * from libros");
			while (rs.next()){			

				libros.add(new Libros(rs.getInt(1), rs.getString(2), rs.getDate(3),a.buscarAutor(rs.getInt(4))));
			}
			for (Libros element:libros){
			writer.println(element.getTitulo()+" <a href=\"./LibroDetail?id="+element.getId()+"\">[Detallar]</a>  <a href=\"./LibroEdit?id="+element.getId()+"\">[Editar]</a><br />");
			}
			writer.println("</body>\n" + "</html>\n");	
			conexion.close();
		} catch (Exception e){
		   e.printStackTrace();
		} 
	}
	}