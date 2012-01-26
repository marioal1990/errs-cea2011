package es.cea.agendatelefonica;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ListenerContextAgenda implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerContextAgenda() {
        
    }

	
    public void contextInitialized(ServletContextEvent arg0) {
       Agenda agenda=new Agenda();

		
		agenda.contactos.add(new ContactoTel("Rocío", "123456"));
		agenda.contactos.add(new ContactoTel("Emilia", "7891011"));
		agenda.contactos.add(new ContactoTel("Juan", "12131415"));
		
		arg0.getServletContext().setAttribute("agenda",agenda);
	    
    }

	
    public void contextDestroyed(ServletContextEvent arg0) {

    }
	
}
