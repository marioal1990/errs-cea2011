package libro;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LibroDetail")
public class LibroDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Stat> estadisticas=(List<Stat>) request.getSession().getAttribute("estadisticas");
		
		Stat visita = new Stat("/libroDetail", 1);
		estadisticas.add(visita);

		try {
			Connection conexion = (Connection) request.getSession().getAttribute("conexion");			
			Statement s = conexion.createStatement();

			PrintWriter writer = response.getWriter();
			writer.println("<html><head><h1>DETALLE DE LIBRO</h1></head><body>");
			ResultSet rs = s.executeQuery("select * from autores");
			List<Autor> autores = new ArrayList<Autor>();
		
			while (rs.next()) {

				autores.add(new Autor(rs.getInt(1), rs.getString(2), rs.getDate(3)));
			}
			rs = s.executeQuery("select * from libros where id="+ Integer.parseInt(request.getParameter("id")));
			List<Libros> libros = new ArrayList<Libros>();
			Integer nombre = 0;
			while (rs.next()) {
				libros.add(new Libros(rs.getInt(1), rs.getString(2), rs.getDate(3),buscarAutor(rs.getInt(4))));
				nombre = rs.getInt(4);
			}

			for (Libros l : libros) {
				writer.println("ID: " + l.getId());
				writer.println("Titulo: " + l.getTitulo());
				writer.println("Fecha: " + l.getFecha());
				writer.println("Autor: " + nombre);

			}
			writer.println("<a href=\"./Libros\">[Volver]</a>");
			writer.println("</body>\n" + "</html>\n");
		} catch (SQLException e) {

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