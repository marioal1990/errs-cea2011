package com.enjava.chat;

import java.util.*;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enjava.EMF;

@Controller
public class ControladorChat {
	
	
	//@Autowired
	//ServicioComentChatI servicioComent;
	
	@RequestMapping(value="/chat")// establecemos la URL a la que llamaremos desde el navegador
		public String enviaDatosChat(Model model){
		
		//Crear objeto calendar para que nos de la fecha actual
		Calendar c = Calendar.getInstance(); 
		Date date = c.getTime();
		
		//Crar Usuario
		UsuarioChat usuarioChat1 = new UsuarioChat((long) 1,"Rocio");
		UsuarioChat usuarioChat2 = new UsuarioChat((long) 2,"Juan");
		UsuarioChat usuarioChat3 = new UsuarioChat((long) 3,"Pablo");
		
		//Creamos Comentario
		ComentarioChat comentarioChat1 = new ComentarioChat(date,"Primer comentario",usuarioChat1);
		ComentarioChat comentarioChat2 = new ComentarioChat(date,"Segundo comentario",usuarioChat2);
		ComentarioChat comentarioChat3 = new ComentarioChat(date,"Tercer comentario",usuarioChat3);
		ComentarioChat comentarioChat4 = new ComentarioChat(date,"Cuarto comentario",usuarioChat3);
		 
		//Creamos lista Usuario donde añadimos todos los usuarios creados
		List <UsuarioChat> listaUsuario = new ArrayList<UsuarioChat>();
		listaUsuario.add(usuarioChat1);
		listaUsuario.add(usuarioChat2);
		listaUsuario.add(usuarioChat3);
		
		//Creamos lista Comentario dende añadimos todos los comentarios del chat
		List<ComentarioChat> listaComentarios= new ArrayList<ComentarioChat>();
		listaComentarios.add(comentarioChat1);
		listaComentarios.add(comentarioChat2);
		listaComentarios.add(comentarioChat3);
		listaComentarios.add(comentarioChat4);
		
		//Añadir al modelo con la clave usuario el valor de la lista usuario
		model.addAttribute("usuario",listaUsuario);
		//Añadir al modelo con la clave comentario el valor de la lista comentario
		model.addAttribute("comentario",listaComentarios);
		
		//Devolver el jsp llamado chat para que pinte la vista
		return "chat";
	}
	
}
