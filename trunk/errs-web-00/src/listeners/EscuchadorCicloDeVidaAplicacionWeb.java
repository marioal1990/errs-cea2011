package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class EscuchadorCicloDeVidaAplicacionWeb implements ServletContextListener {

    public EscuchadorCicloDeVidaAplicacionWeb() {
       System.out.println("EL TOMCAT ME CREA: soy el listener!");
    }
	
    public void contextInitialized(ServletContextEvent arg0) {
       System.out.println("LA APLICACIÓN SE HA DESPLEGADO OK!");
    }

	
    public void contextDestroyed(ServletContextEvent arg0) {
       System.out.println("LA APLICACIÓN SE HA ELIMINADO DEL SERVIDOR");
    }
	
}
