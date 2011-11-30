import java.sql.Date;

public class Libros {

	private int id;
	private String titulo;
	private Date fecha;
	private int idAutor;

	public Libros(Integer id, String titulo, Date fecha, Integer idAutor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.fecha = fecha;
		this.idAutor = idAutor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getAutor() {
		return idAutor;
	}

	public void setIdAutor(int autor) {
		this.idAutor = autor;
	}

	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", fecha=" + fecha
				+ ", autor=" + idAutor + "]";
	}

	

}
