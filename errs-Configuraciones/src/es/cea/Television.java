package es.cea;

public class Television {

	public Programa enciende(Espectador espectador) {
		if(espectador==null)
			throw new RuntimeException("esto no puede ser");
		Programa programa=new Programa();
		programa.miTitulo="Pocoyo";
		if(espectador.edad<18) return programa;
		programa.miTitulo="Salvados";
		return programa;
	}

}
