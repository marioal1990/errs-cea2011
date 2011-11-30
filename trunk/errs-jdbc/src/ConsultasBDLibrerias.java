import org.testng.annotations.Test;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasBDLibrerias {

	Connection conexion;
	Statement s;
	ResultSet rs;

	
		@Test
		public void prueba() {

			
			// Libros
			Libros libro;
			List<Libros> libros = new ArrayList<Libros>();
			int idAutor=0;
			
			try {

				Class.forName("com.mysql.jdbc.Driver");
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "root");
				s = conexion.createStatement();
				rs = s.executeQuery("select * from libros");
				while (rs.next()) {
					
				
					idAutor = Integer.parseInt(rs.getString(4));
					
					libro = new Libros(rs.getInt("id"), rs.getString("titulo"), rs.getDate("fecha"), rs.getInt("idAutor"));
					libros.add(libro);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Libros");
			
			
			for (Libros l : libros) {
				System.out.println(l);
			}
		
		// Autor
					Autores autor;
					List<Autores> autores = new ArrayList<Autores>();
					
					try {

						Class.forName("com.mysql.jdbc.Driver");
						conexion = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "root");
						s = conexion.createStatement();
						rs = s.executeQuery("select * from autores");
						while (rs.next()) 
						{
							autor = new Autores(rs.getInt("idAutores"), rs.getString("nombre"), rs.getDate("fechaNacimiento"));
							autores.add(autor);
						}
					} 
					catch (Exception e) {
						e.printStackTrace();
					}
		}
		

		public Autores buscarAutor(int idAutor){
			Connection conexion;
			Statement s;
			ResultSet rs;
			
			try {

				Class.forName("com.mysql.jdbc.Driver");
				conexion = DriverManager.getConnection(
						"jdbc:mysql://localhost/libreria", "root", "root");
				s = conexion.createStatement();
				rs = s.executeQuery("select * from autores");
				while (rs.next()) {
					
					if (idAutor == Integer.parseInt(rs.getString(1))){
						
						return new Autores(rs.getInt("idAutores"), rs.getString("nombre"), rs.getDate("fechaNacimiento"));
					}
				
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
}
