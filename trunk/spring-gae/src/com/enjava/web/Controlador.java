package com.enjava.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enjava.Alumno;
import com.enjava.aplicacioncapas.Servicio;

@Controller
public class Controlador {

	
	@Autowired
	Alumno alumnoBean;
	
	public Alumno getAlumnoBean(){
		return alumnoBean;
	}
	
	public void setAlumnoBean(Alumno alumnoBean){
		this.alumnoBean = alumnoBean;
	}
	
		
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!:"+alumnoBean.getNombre());
        return "helloWorld";
    }
    
    @RequestMapping("/helloDescanso")
    public String helloDescanso(Model model) {
        model.addAttribute("message", "por fin!!! DESCANSO");
        return "helloDescanso";
    }
    
}
