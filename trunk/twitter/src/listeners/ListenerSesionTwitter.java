package listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class ListenerSesionTwitter implements HttpSessionListener {


    public ListenerSesionTwitter() {
        // TODO Auto-generated constructor stub
    }


    public void sessionCreated(HttpSessionEvent arg0) {
       System.out.println("Sesion creada");
    }

    public void sessionDestroyed(HttpSessionEvent arg0) {
    	 System.out.println("Sesion destruida");
    }
	
}
