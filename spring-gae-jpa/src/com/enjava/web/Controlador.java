package com.enjava.web;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enjava.Alumno;
import com.enjava.FichaUsuario;
import com.enjava.EMF;

@Controller()
@Scope(value="request")
public class Controlador {
	

	@Autowired
	EMF emf;
	@Autowired
	FichaUsuario fichaUsuario;

	
    @RequestMapping(value="/helloW/nombre={nombre}")
    public String helloWorld(@PathVariable String nombre, Model model) {
    	Alumno alumno=new Alumno();
    	alumno.setNombre(nombre);
    	EntityManager em = emf.getEM();
    	em.getTransaction().begin();
    	em.persist(alumno);
    	em.getTransaction().commit();
        model.addAttribute("message", "Hello World!"+alumno);
        fichaUsuario.setNombre(alumno.getNombre());
        
        return "helloWorld";
    }
    @RequestMapping(value="/helloW")
    public String helloWorld( Model model) {
    	model.addAttribute("message", "Hello World!"+fichaUsuario.getNombre());
    	return "helloWorld";
    }

}
