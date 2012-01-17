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
public class LibreriaServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Stat> estadisticas=(List<Stat>) request.getSession().getAttribute("estadisticas");
		Stat visita = new Stat("/libros", 1);
		estadisticas.add(visita);
		
		List<Stat>estadisticaContexto = (List<Stat>) request.getServletContext().getAttribute("estadisticas");
		Stat visitaContexto = new Stat("/libros",1);
		estadisticaContexto.add(visitaContexto);
		
 		try
		{
			PrintWriter writer = response.getWriter();
			writer.println("<html>" + "<body>" + "<h1>LISTADO DE LIBROS</h1>");

			Statement s;
			ResultSet rs;
			Connection conexion = (Connection) request.getSession().getAttribute("conexion");			
			s = conexion.createStatement();
			rs = s.executeQuery("select * from libros");
			List<Autor> autores = new ArrayList<Autor>(); 
			List<Libros> libros = new ArrayList<Libros>();
			
			while (rs.next()){
				    
				    autores.add(new Autor(rs.getInt(1), rs.getString(2), rs.getDate(3)));
			}	
			rs = s.executeQuery("select * from libros");
			while (rs.next()){			

				libros.add(new Libros(rs.getInt(1), rs.getString(2), rs.getDate(3),buscarAutor(rs.getInt(4))));
			}
			for (Libros element:libros){
			writer.println(element.getTitulo()+" <a href=\"./LibroDetail?id="+element.getId()+"\">[Detallar]</a>  <a href=\"./LibroEdit?id="+element.getId()+"\">[Editar]</a><br />");
			}
			writer.println("</body>\n" + "</html>\n");	
		} catch (Exception e){
		   e.printStackTrace();
		} 
	}
		public Autor buscarAutor(int idAutor) {
			Connection conexion;
			Statement s;
			ResultSet rs;

			try {

				Class.forName("com.mysql.jdbc.Driver");
				conexion = DriverManager.getConnection(
						"jdbc:mysql://localhost/libreria", "root", "root");
				s = conexion.createStatement();
				rs = s.executeQuery("select * from autores");

				while (rs.next())
					if (idAutor == Integer.parseInt(rs.getString(1)))
						return new Autor(rs.getInt(1), rs.getString(2),rs.getDate(3));

			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}
	}