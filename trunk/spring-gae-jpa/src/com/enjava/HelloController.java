package com.enjava;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.HashMap;

public class HelloController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    FichaUsuario fichaUsuario;
    
    
    public FichaUsuario getFichaUsuario() {
		return fichaUsuario;
	}


	public void setFichaUsuario(FichaUsuario beanSesion) {
		this.fichaUsuario = beanSesion;
	}


	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning hello view");

        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("message", "sin anotaciones"+fichaUsuario.getNombre());
		return new ModelAndView("hello", hashMap);
    }

}
