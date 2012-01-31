package es.cea.agendatelefonica;


import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;





public class ListenerSesionAgenda implements HttpSessionListener {

    public ListenerSesionAgenda() {
        // TODO Auto-generated constructor stub
    }

	
    public void sessionCreated(HttpSessionEvent arg0) {
    	Agenda agenda=(Agenda) arg0.getSession().getServletContext().getAttribute("agenda");
		
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
