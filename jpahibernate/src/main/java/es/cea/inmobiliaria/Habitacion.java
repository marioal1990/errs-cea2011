package es.cea.inmobiliaria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Habitacion {

	Long id;
	Casa casa;
	boolean tieneVentana;
	
	@Id
	@GeneratedValue()
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public boolean isTieneVentana() {
		return tieneVentana;
	}
	public void setTieneVentana(boolean tieneVentana) {
		this.tieneVentana = tieneVentana;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((casa == null) ? 0 : casa.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (tieneVentana ? 1231 : 1237);
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
		Habitacion other = (Habitacion) obj;
		if (casa == null) {
			if (other.casa != null)
				return false;
		} else if (!casa.equals(other.casa))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tieneVentana != other.tieneVentana)
			return false;
		return true;
	}
	
}
