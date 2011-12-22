import org.testng.annotations.Test;

import es.cea.core.scopes.Contexto;
import es.cea.core.scopes.Sesion;


public class TesFavorito {
	
	@Test
	public void TestPositivoFavorito(){
		ServicioForo  servicioForo = new ServicioForo();
		Sesion sesion = new Sesion();
		Contexto contexto = new Contexto();
		sesion.addAtributo("usuario", new Usuario("Rocio", "errs", "XXX"));
		
		sesion.addAtributo("favorito", new Mensaje("MensajeF 1 "));
		sesion.addAtributo("favorito", new Mensaje("MensajeF 2 "));
		sesion.addAtributo("favorito", new Mensaje("MensajeF 3 "));
		
		Mensaje mensaje= new Mensaje("Nuevo Mensaje");
		servicioForo.sesion=sesion;
		servicioForo.contexto=contexto;
		servicioForo.addFavorito(mensaje);	
		
	}

}
