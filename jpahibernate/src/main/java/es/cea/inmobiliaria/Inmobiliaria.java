package es.cea.inmobiliaria;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class Inmobiliaria {
	
	Long id;
	String cif;
	String nombre;
	List<Ciudad> listaCiudad;
	List<Barrio> listaBarrio;
	
	@Id
	@GeneratedValue()
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@ManyToMany()
	@JoinTable(name="CIUDADES_INMOBILIARIAS", 
		joinColumns=
		@JoinColumn(name="inmobiliaria_id", referencedColumnName="id"),
		inverseJoinColumns=
		@JoinColumn(name="ciudad_id", referencedColumnName="id"))
	
	public List<Ciudad> getListaCiudad() {
		return listaCiudad;
	}
	public void setListaCiudad(List<Ciudad> listaCiudad) {
		this.listaCiudad = listaCiudad;
	}
	
	@OneToMany (mappedBy = "inmobiliaria")
	
	
	public List<Barrio> getListaBarrio() {
		return listaBarrio;
	}
	public void setListaBarrio(List<Barrio> listaBarrio) {
		this.listaBarrio = listaBarrio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cif == null) ? 0 : cif.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((listaBarrio == null) ? 0 : listaBarrio.hashCode());
		result = prime * result
				+ ((listaCiudad == null) ? 0 : listaCiudad.hashCode());
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
		Inmobiliaria other = (Inmobiliaria) obj;
		if (cif == null) {
			if (other.cif != null)
				return false;
		} else if (!cif.equals(other.cif))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaBarrio == null) {
			if (other.listaBarrio != null)
				return false;
		} else if (!listaBarrio.equals(other.listaBarrio))
			return false;
		if (listaCiudad == null) {
			if (other.listaCiudad != null)
				return false;
		} else if (!listaCiudad.equals(other.listaCiudad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
