package es.cea;

import java.util.ArrayList;
import java.util.List;

public class ServicioNoticias {
	List<Noticia> noticias=new ArrayList<Noticia>();
	
	public ServicioNoticias() {
		super();
		noticias.add(new Noticia());
	}

	public List<Noticia> getNoticias() {
		return noticias;
	}

}
