package com.enjava.chat;

import java.util.List;


public interface DAOChat {
	public ComentarioChat incluirComentario(String texto);

	public List dameUsuarios();

	public List dameComentarios();

}
