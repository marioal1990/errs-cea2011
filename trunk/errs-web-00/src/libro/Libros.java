package libro;


import java.util.Date;

public class Libros {

private Integer id;
private String titulo;
private Date fecha;
private Autor autor;



public Libros(Integer id, String titulo, Date fecha, Autor autor) {

	this.id = id;
	this.titulo = titulo;
	this.fecha = fecha;
	this.autor = autor;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
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
public Autor getAutor() {
	return autor;
}
public void setAutor(Autor autor) {
	this.autor = autor;
}

public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Libros other = (Libros) obj;
	if (id != other.id)
		return false;
	return true;
}

public String toString() {
	return "Libros: " + titulo + ", fecha=" + fecha + "\n";
}

}
