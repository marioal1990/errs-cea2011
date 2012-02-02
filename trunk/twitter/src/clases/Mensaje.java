package clases;

public class Mensaje {
	
	String texto;

	
	public Mensaje(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Mensaje [texto=" + texto + "]";
	}
	
	

}
