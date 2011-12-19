package es.cea;

import java.util.List;

public class ServicioSuscripciones {

	public List<Lector> lectores;

	public Suscripcion comprueba(Lector lector) {
		boolean esContenido = lectores.contains(lector);
		Suscripcion suscripcion = new Suscripcion(esContenido);
		return suscripcion;
	}

}
