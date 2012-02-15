package com.enjava.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorBienvenida {
	
	@Autowired
	ServicioSaludo servicioSaludo;
	
	@RequestMapping("/saludando")
	public String saluda(Model model){
		model.addAttribute("buenosDias", servicioSaludo.dameBuenosDias());
		return "bienvenida";
	}

	
	public void setServicioSaludo(ServicioSaludo servicioSaludo) {
		this.servicioSaludo = servicioSaludo;
	}
	
}
