package es.cea.inmobiliaria;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Barrio {
	
	Long id;
	String nombre;
	Ciudad ciudad;
	Inmobiliaria inmobiliaria;
	List<Casa> listaCasa;
	
	@Id
	@GeneratedValue()
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@ManyToOne
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	@ManyToOne
	public Inmobiliaria getInmobiliaria() {
		return inmobiliaria;
	}
	public void setInmobiliaria(Inmobiliaria inmobiliaria) {
		this.inmobiliaria = inmobiliaria;
	}
	
	@OneToMany (mappedBy = "barrio")
	public List<Casa> getListaCasa() {
		return listaCasa;
	}
	public void setListaCasa(List<Casa> listaCasa) {
		this.listaCasa = listaCasa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((inmobiliaria == null) ? 0 : inmobiliaria.hashCode());
		result = prime * result
				+ ((listaCasa == null) ? 0 : listaCasa.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Barrio other = (Barrio) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inmobiliaria == null) {
			if (other.inmobiliaria != null)
				return false;
		} else if (!inmobiliaria.equals(other.inmobiliaria))
			return false;
		if (listaCasa == null) {
			if (other.listaCasa != null)
				return false;
		} else if (!listaCasa.equals(other.listaCasa))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
	

}
