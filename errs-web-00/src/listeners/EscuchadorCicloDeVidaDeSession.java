package listeners;

import java.sql.SQLException;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.mysql.jdbc.Connection;


@WebListener
public class EscuchadorCicloDeVidaDeSession implements HttpSessionListener {

   
    public EscuchadorCicloDeVidaDeSession() {
    	System.out.println("EL TOMCAT ME CREA: soy el listener de session!");
    }

	
    public void sessionCreated(HttpSessionEvent arg0) {
    	System.out.println("el usuario se conecta a la session");
    }// todo conectar a MYSQL y dejar la conexión como un atributo de la sessión
    	//Connection con; // conectar
    	//arg0.getSession().setAttribute("conexion",con);

	
    public void sessionDestroyed(HttpSessionEvent arg0) {
    	System.out.println("el usuario se desconecta a la session");
  /*  	Connection con=(Connection)arg0.getSession().getAttribute("conexion");
    	try
    	{
    		con.close();
    	}catch (SQLException e){
    		e.printStackTrace();
    	}
    }*/
	}
}
