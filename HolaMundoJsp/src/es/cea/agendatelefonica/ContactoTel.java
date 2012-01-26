package es.cea.agendatelefonica;

public class ContactoTel {

	String nombre;
	String telefono;
	
	public ContactoTel(String string, String string2) {
		nombre = string;
		telefono = string2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
