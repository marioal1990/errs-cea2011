

import java.util.List;

public class Foro {
	private String nombre;
	private List<MensajeChat> listaMensaje;
	
	public Foro (String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<MensajeChat> getListaMensaje() {
		return listaMensaje;
	}

	public void setListaMensaje(List<MensajeChat> listaMensaje) {
		this.listaMensaje = listaMensaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Foro other = (Foro) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Foro [nombre=" + nombre + "]";
	}
	

}
