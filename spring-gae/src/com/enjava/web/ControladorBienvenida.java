package com.enjava.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enjava.aplicacioncapas.Servicio;

@Controller
public class ControladorBienvenida {
	
	@Autowired
	Servicio servicio;
	
	@RequestMapping("/saludando")
	public String saluda(Model model){
		model.addAttribute("buenosDias", servicio.dameBuenosDias());
		return "bienvenida";
	}

	
	public void setServicioSaludo(Servicio servicio) {
		this.servicio = servicio;
	}
	
}
