

import java.util.List;

public class Usuario {

	private String nombre;
	private String clave;
	private String direccion;
	private List<Foro> foros;
	
	public Usuario(String nombre, String clave, String direccion) {
		super();
		this.nombre = nombre;
		this.clave = clave;
		this.direccion = direccion;
	}
	public Usuario(){}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Foro> getForos() {
		return foros;
	}
	public void setForos(List<Foro> foros) {
		this.foros = foros;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
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
		Usuario other = (Usuario) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", clave=" + clave
				+ ", direccion=" + direccion + ", foros=" + foros + "]";
	}
	
	

}
