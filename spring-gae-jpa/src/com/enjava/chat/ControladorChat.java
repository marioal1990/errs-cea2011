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
	
	
	@Autowired
	DAOChat daoChat;
//	ServicioComentChatI servicioComent;
	
	@RequestMapping(value="/chat")// establecemos la URL a la que llamaremos desde el navegador
		public String enviaDatosChat(Model model){
		
			UsuarioChat usuario = new UsuarioChat();
			ComentarioChat comentario = new ComentarioChat();
			//Añadir al modelo con la clave usuario el valor de la lista usuario
			model.addAttribute("usuario",daoChat.dameUsuarios());
			//Añadir al modelo con la clave comentario el valor de la lista comentario
			model.addAttribute("comentario",daoChat.dameComentarios());
			//Incluir comentario
			model.addAttribute("incluircomentario", daoChat.incluirComentario(comentario.getTexto()));
			
		//Devolver el jsp llamado chat para que pinte la vista
		return "chat";
	}
	
}
