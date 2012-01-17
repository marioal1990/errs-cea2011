package libro;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class MiContextListener implements ServletContextListener {

    
    public MiContextListener() {
      
    }

	
    public void contextInitialized(ServletContextEvent arg0) {
    	List<Stat> lista = new ArrayList <Stat>();	
    	arg0.getServletContext().setAttribute("estadisticas", lista);
		
    }

	
    public void contextDestroyed(ServletContextEvent arg0) {
 
    }
	
}
