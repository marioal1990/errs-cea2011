package listeners;

import java.sql.DriverManager;
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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/libreria","root", "root");
			arg0.getSession().setAttribute("conexion", conexion);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

    }// todo conectar a MYSQL y dejar la conexión como un atributo de la sessión
    	//Connection con; // conectar
    	//arg0.getSession().setAttribute("conexion",con);

	
    public void sessionDestroyed(HttpSessionEvent arg0) {
    	System.out.println("el usuario se desconecta a la session");
		Connection conexion = (Connection) arg0.getSession().getAttribute("conexion");			
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);

		}

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
