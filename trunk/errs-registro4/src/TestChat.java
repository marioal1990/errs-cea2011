

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import es.cea.core.scopes.Contexto;
import es.cea.core.scopes.Sesion;

public class TestChat {

	@Test
	public void TestPositivoChat () {
		Sesion sesion = new Sesion();
		ServicioChat servicioChat = new ServicioChat();
		Contexto contexto = new Contexto();
		Chat chat =  new Chat();		
		
		Usuario usuario = new Usuario("Rocio", "errs", "XXX");
		sesion.addAtributo(usuario.getClave(), usuario);
		servicioChat.sesion=sesion;
		
		
		
		List<MensajeChat> listaMensaje= new ArrayList<MensajeChat>();
		listaMensaje.add(new MensajeChat("Mensaje", usuario));
		listaMensaje.add(new MensajeChat("Mensaje 2", usuario));
		listaMensaje.add(new MensajeChat("Mensaje 3", usuario));
		chat.mensajes=listaMensaje;
		servicioChat.chat=chat;

		contexto.addAtributo("chat", chat);
		servicioChat.contexto=contexto;
		
		try {
			servicioChat.publicaMensaje("Nuevo Mensaje");
		} catch (MensajeRepetido | MensajeNulo e) {
			e.printStackTrace();
			assert(false):"Aqui no debe de llegar";
		}	
	}

	@Test
	public void TestChatMensajeRepetido () {
		Sesion sesion = new Sesion();
		ServicioChat servicioChat = new ServicioChat();
		Contexto contexto = new Contexto();
		Chat chat =  new Chat();		
		
		Usuario usuario = new Usuario("Rocio", "errs", "XXX");
		sesion.addAtributo(usuario.getClave(), usuario);
		servicioChat.sesion=sesion;
		
		
		
		List<MensajeChat> listaMensaje= new ArrayList<MensajeChat>();
		listaMensaje.add(new MensajeChat("Mensaje", usuario));
		listaMensaje.add(new MensajeChat("Mensaje 2", usuario));
		listaMensaje.add(new MensajeChat("Mensaje 3", usuario));
		chat.mensajes=listaMensaje;
		servicioChat.chat=chat;

		contexto.addAtributo("chat", chat);
		servicioChat.contexto=contexto;
		
		try {
			servicioChat.publicaMensaje("Nuevo Mensaje");
			servicioChat.publicaMensaje("Nuevo Mensaje");
			assert(false):"Aqui no debe de llegar";	
		} catch (MensajeRepetido | MensajeNulo e) {
			e.printStackTrace();
			
		}	
	}
	
	@Test
	public void TestChatMensajeNulo () {
		Sesion sesion = new Sesion();
		ServicioChat servicioChat = new ServicioChat();
		Contexto contexto = new Contexto();
		Chat chat =  new Chat();		
		
		Usuario usuario = new Usuario("Rocio", "errs", "XXX");
		sesion.addAtributo(usuario.getClave(), usuario);
		servicioChat.sesion=sesion;
		
		
		
		List<MensajeChat> listaMensaje= new ArrayList<MensajeChat>();
		listaMensaje.add(new MensajeChat("Mensaje", usuario));
		listaMensaje.add(new MensajeChat("Mensaje 2", usuario));
		listaMensaje.add(new MensajeChat("Mensaje 3", usuario));
		chat.mensajes=listaMensaje;
		servicioChat.chat=chat;

		contexto.addAtributo("chat", chat);
		servicioChat.contexto=contexto;
		
		try {
			servicioChat.publicaMensaje("");
			assert(false):"Error, no puede llegar";	
		} catch (MensajeRepetido | MensajeNulo e) {
			e.printStackTrace();
			
		}	
	}
}
