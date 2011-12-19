package es.cea;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Alumno {
	protected final Log logger = LogFactory.getLog(getClass());
	String nombre;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this.nombre.equals("admin"))
			logger.error("esto nunca puede pasar soy el admin!!");
		if (obj == null)
			logger.warn("me intentan comparar con un objeto nulo!!");
		logger.info("intentando comparar con" + ((Alumno) obj).nombre);
		logger.debug("yo soy " + this.nombre);

		// System.out.println("me intentan comparar con un objeto nulo!!");

		boolean resultado = resultado(obj);
		logger.debug("resultado " + resultado);

		return resultado;
	}

	private boolean resultado(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
