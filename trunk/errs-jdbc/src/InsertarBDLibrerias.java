import java.sql.* ;  
public class InsertarBDLibrerias {
	
	public static void main (String [] args)
	{
		try  
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/libreria","root", "root");  
			Statement s = conexion.createStatement(); 
			
			//INSERTAR EN LIBROS
			s.executeUpdate("delete from libros");
			s.executeUpdate("INSERT INTO libros(id, titulo, fecha, idAutor) VALUES ('1','AAA','1210-10-02','10')"); 
			s.executeUpdate("INSERT INTO libros(id, titulo, fecha, idAutor) VALUES ('2','bbb','1301-10-10','18')");	
			s.executeUpdate("INSERT INTO libros(id, titulo, fecha, idAutor) VALUES ('3','ccc','1410-10-12','05')");
			s.executeUpdate("INSERT INTO libros(id, titulo, fecha, idAutor) VALUES ('4','DDD','1510-10-12','07')");
			s.executeUpdate("INSERT INTO libros(id, titulo, fecha, idAutor) VALUES ('5','EEE','1610-10-05','08')");
		
		} 
		catch (Exception e)  
		{  
		   e.printStackTrace();  
		}   
		
		try  
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/libreria","root", "root");  
			Statement s = conexion.createStatement(); 
			
			//INSERTAR EN AUTORES
			s.executeUpdate("delete from autores");
			s.executeUpdate("INSERT INTO autores(idAutores, nombre, fechaNacimiento) VALUES ('6','FFF','1710-10-02')"); 
			s.executeUpdate("INSERT INTO autores(idAutores, nombre, fechaNacimiento) VALUES ('7','GGG','1801-10-10')");	
			s.executeUpdate("INSERT INTO autores(idAutores, nombre, fechaNacimiento) VALUES ('8','HHH','1910-10-10')");
			s.executeUpdate("INSERT INTO autores(idAutores, nombre, fechaNacimiento) VALUES ('9','III','2010-10-15')");
			s.executeUpdate("INSERT INTO autores(idAutores, nombre, fechaNacimiento) VALUES ('10','JJJ','2110-10-05')");
		} 
		catch (Exception e)  
		{  
		   e.printStackTrace();  
		}   
	}
}