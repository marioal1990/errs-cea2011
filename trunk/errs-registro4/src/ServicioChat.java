

import java.util.List;

import es.cea.core.scopes.Contexto;
import es.cea.core.scopes.Sesion;

public class ServicioChat {
	Sesion sesion;
	Contexto contexto;
	Chat chat;

	public void publicaMensaje(String mensaje) throws MensajeRepetido, MensajeNulo  {

		Usuario usuario = (Usuario) sesion.getAtributo("errs");
		chat = (Chat) contexto.getAtributo("chat");
		addMensaje(mensaje, usuario);

	}

	public void addMensaje(String mensaje, Usuario usuario)
			throws MensajeRepetido, MensajeNulo {
		if (chat.mensajes.contains(new MensajeChat(mensaje, usuario)))
			throw new MensajeRepetido();

		if (mensaje == "")
			throw new MensajeNulo();

		chat.mensajes.add(new MensajeChat(mensaje, usuario));

	}

}
