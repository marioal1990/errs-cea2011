package com.enjava.chat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DAOChatImpl implements DAOChat{
	
	
	
	private List<UsuarioChat> listaUsuarios;
	private List<ComentarioChat> listaComentarios;
    //USAMOS EL CONSTRUCTOR VACIO PARA CREAR LAS LISTAS
	public DAOChatImpl() {
		
		//Crear un objeto calendar para que nos de la fecha actual del reloj
		Calendar c = Calendar.getInstance();
		Date fecha = c.getTime();
		
		//Crear usuarios (nos falta el dato que se refiere a la lista de mensajes)
		UsuarioChat usuario1 = new UsuarioChat((long) 1, "Rocio");
		UsuarioChat usuario2 = new UsuarioChat((long) 2, "Juan");
		UsuarioChat usuario3 = new UsuarioChat((long) 3, "Pablo");
		
		//Crear comentarios 
		ComentarioChat comentario1 = new ComentarioChat(fecha,"Primer comentario", usuario1);
		ComentarioChat comentario2 = new ComentarioChat(fecha,"Segundo comentario", usuario2);
		ComentarioChat comentario3 = new ComentarioChat(fecha,"Tercer comentario", usuario3);
		
		
		listaUsuarios = new ArrayList<UsuarioChat>();
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario3);
		
		listaComentarios = new ArrayList<ComentarioChat>();
		listaComentarios.add(comentario1);
		listaComentarios.add(comentario2);
		listaComentarios.add(comentario3);
		
		}

	public ComentarioChat incluirComentario(String texto){
		
		//Crear un objeto calendar para que nos de la fecha actual del reloj
		Calendar c = Calendar.getInstance();
		Date fecha = c.getTime();

		ComentarioChat comentario4 = new ComentarioChat(fecha,texto, listaUsuarios.get(0));
		listaComentarios.add(comentario4);
				
			return comentario4;
	}


	public List dameUsuarios() {
	
		return listaUsuarios;
	}
	public List dameComentarios() {
		
		return listaComentarios;
	}
}
