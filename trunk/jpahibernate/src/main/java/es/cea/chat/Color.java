package es.cea.chat;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Color {

	Long id;
	String Html_Code;
	String nombre;
	List<Usuario> listaUsuario;
	
	@Id
	@GeneratedValue()
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHtml_Code() {
		return Html_Code;
	}
	public void setHtml_Code(String html_Code) {
		Html_Code = html_Code;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@OneToMany(mappedBy="color")
	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Html_Code == null) ? 0 : Html_Code.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		if (Html_Code == null) {
			if (other.Html_Code != null)
				return false;
		} else if (!Html_Code.equals(other.Html_Code))
			return false;
		return true;
	}
	
	
}
