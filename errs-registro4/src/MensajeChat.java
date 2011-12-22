

public class MensajeChat {
	String texto;
	Usuario usuario;
	
	
	public MensajeChat(String texto, Usuario usuario) {
		this.texto = texto;
		this.usuario = usuario;
	}

	public MensajeChat(){
		
	}
	
	public String getMensaje() {
		return texto;
	}

	public void setMensaje(String mensaje) {
		this.texto = mensaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		MensajeChat other = (MensajeChat) obj;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}


	
}
