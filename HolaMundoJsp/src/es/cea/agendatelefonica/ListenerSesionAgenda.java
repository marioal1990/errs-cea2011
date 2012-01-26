package es.cea.agendatelefonica;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;




@WebListener
public class ListenerSesionAgenda implements HttpSessionListener {

    public ListenerSesionAgenda() {
        
    }

	
    public void sessionCreated(HttpSessionEvent arg0) {
    	Agenda agenda=(Agenda) arg0.getSession().getServletContext().getAttribute("agenda");
		
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0) {
       
    }
	
}
