

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import es.cea.core.scopes.Sesion;

public class TestForo {
	
	@Test
	public void TestDameForo() throws UsuarioNoExiste, UsuarioSinPermisos{
		
		ServicioForo servicioForo = new ServicioForo();
		Sesion sesion = new Sesion();
		List<Foro> listaForos= new ArrayList<Foro>();
		List<Foro> listaForosUsuario= new ArrayList<Foro>();
		List<MensajeChat> listaMensaje = new ArrayList<MensajeChat>();
		
		
		Usuario usuario = new Usuario("Rocio", "errs", "XXX");
		listaForosUsuario.add(new Foro("A"));
		listaForosUsuario.add(new Foro("B"));
		usuario.setForos(listaForosUsuario);
		
		listaForos.add(new Foro("A"));
		listaForos.add(new Foro("B"));
		listaForos.add(new Foro("C"));
		listaForos.add(new Foro("D"));

		
		sesion.addAtributo(usuario.getNombre(), usuario);
		
		
		servicioForo.sesion=sesion;
		servicioForo.listaForo=listaForos;
		
		Foro foro = servicioForo.dameForo("A");
		assert(foro!=null):"Espero valor " + foro;
	}

}
