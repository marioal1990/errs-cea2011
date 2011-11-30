import java.sql.Date;

public class Autores {

	private String nombre;
	private int id;
	private Date fechaNacimiento;

	public Autores(Integer id, String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.id = id;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String toString() {
		return "Autor [nombre=" + nombre + ", id=" + id + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}

