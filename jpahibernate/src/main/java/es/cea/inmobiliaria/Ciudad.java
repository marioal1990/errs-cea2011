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
public class Ciudad {
	Long id;
	String codigo;
	List<Inmobiliaria> listaInmobiliaria;
	List<Barrio> listaBarrios;
	
	@Id
	@GeneratedValue()
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@ManyToMany()
	@JoinTable(name="CIUDADES_INMOBILIARIAS", 
		joinColumns=
		@JoinColumn(name="ciudad_id", referencedColumnName="id"),
		inverseJoinColumns=
		@JoinColumn(name="inmobiliaria_id", referencedColumnName="id"))
	
	public List<Inmobiliaria> getListaInmobiliaria() {
		return listaInmobiliaria;
	}
	public void setListaInmobiliaria(List<Inmobiliaria> listaInmobiliaria) {
		this.listaInmobiliaria = listaInmobiliaria;
	}
	
	@OneToMany(mappedBy="ciudad")
	public List<Barrio> getListaBarrios() {
		return listaBarrios;
	}
	public void setListaBarrios(List<Barrio> listaBarrios) {
		this.listaBarrios = listaBarrios;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((listaBarrios == null) ? 0 : listaBarrios.hashCode());
		result = prime
				* result
				+ ((listaInmobiliaria == null) ? 0 : listaInmobiliaria
						.hashCode());
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
		Ciudad other = (Ciudad) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaBarrios == null) {
			if (other.listaBarrios != null)
				return false;
		} else if (!listaBarrios.equals(other.listaBarrios))
			return false;
		if (listaInmobiliaria == null) {
			if (other.listaInmobiliaria != null)
				return false;
		} else if (!listaInmobiliaria.equals(other.listaInmobiliaria))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
