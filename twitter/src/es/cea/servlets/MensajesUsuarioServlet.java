package es.cea.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.cea.negocio.Mensaje;
import es.cea.negocio.Persistencia;


@WebServlet("/mensajesUsuario")
public class MensajesUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MensajesUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Cargar los mensajes, meterlos en el request para imprimir;
	
		try {
			
			List<Mensaje> mensajes = Persistencia.getMensajesById((Integer)request.getSession().getAttribute("idDb"));
			request.setAttribute("mensajes", mensajes);
			request.getRequestDispatcher("mensajesPropios.jsp").forward(request, response);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
