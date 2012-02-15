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

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning hello view");

        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("message", "sin anotaciones");
		return new ModelAndView("hello", hashMap);// lleva primero el nombre de la clase (es la vista) y en segundo es un mapa de atributos.
    }

}
