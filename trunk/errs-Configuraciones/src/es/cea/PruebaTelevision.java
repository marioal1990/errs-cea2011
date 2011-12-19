package es.cea;

import org.testng.annotations.Test;

public class PruebaTelevision {

	@Test
	public void controlEdadTest() {
		// escenario de la prueba
		Espectador espectador = new Espectador();
		espectador.edad = 17;
		Television television = new Television();
		// invocacion del programa
		Programa programa = television.enciende(espectador);
		// comprobacion de los resultados
		assert (programa.miTitulo.equals("Pocoyo")) : "" + "El titulo obtenido:"
				+ programa.miTitulo + "" + "El titulo esperado Pocoyo";

	}

	@Test
	public void controlEdadTestMayor() {
		// escenario de la prueba
		Espectador espectador = new Espectador();
		espectador.edad = 19;
		Television television = new Television();
		// invocacion del programa
		Programa programa = television.enciende(espectador);
		// comprobacion de los resultados
		assert (programa.miTitulo.equals("Salvados")) : ""
				+ "El titulo obtenido:" + programa.miTitulo + ""
				+ "El titulo esperado Salvados";
	}

	@Test
	public void controlExcepcion() {
		Television television = new Television();
		try {
			Programa programa = television.enciende(null);
			assert (false) : "deberia lanzar una excepcion!";
		} catch (Exception e) {
			assert (true);
		}
	}

}
