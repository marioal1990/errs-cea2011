package libro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Autor {
	private int id;
	private String nombre;
	private Date fechaNacimiento;
	
	public Autor(int id, String nombre, Date fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public Autor() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + "]<br/>\n";
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
