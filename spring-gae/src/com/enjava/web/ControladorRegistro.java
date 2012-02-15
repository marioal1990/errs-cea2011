package com.enjava.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enjava.registro.ExceptionEdad;
import com.enjava.registro.ExceptionYaExiste;
import com.enjava.registro.ServicioRegistro;
import com.enjava.registro.UsuarioReg;

@Controller
public class ControladorRegistro {

	@Autowired
	ServicioRegistro servicioRegistro;
	
		
	@RequestMapping("/registrando/edad={edad}&mail={mailUsuario}&clave={clave}")
	public String registra( @PathVariable int edad, @PathVariable String mailUsuario, @PathVariable String clave, Model model){
	
	
		try {
			model.addAttribute("mail", servicioRegistro.registra(edad, mailUsuario, clave) );
			return "registroCorrecto";
		} catch (ExceptionEdad e) {
			
			return "erroredad";
		} catch (ExceptionYaExiste e) {
			
			return "errorRegistro";
		}
	}
}

	
		
