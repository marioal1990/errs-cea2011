package es.cea;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeriodico {

	public ServicioSuscripciones servicioSuscripciones;
	public ServicioNoticias servicioNoticias;

	public List<Noticia> dameNoticias(Lector lector) {
		Suscripcion suscripcion = servicioSuscripciones.comprueba(lector);
		if (suscripcion.activa) {
			List<Noticia> noticias = servicioNoticias.getNoticias();
			return noticias;

		} else {
			return null;
		}
	}

}
