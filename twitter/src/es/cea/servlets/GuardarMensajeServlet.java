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

@WebServlet("/guardarMensaje")
public class GuardarMensajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GuardarMensajeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			Persistencia.guardarMensaje(
					(Integer)request.getSession().getAttribute("idDb"),
			        request.getParameter("mensaje")
			        );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/mensajesUsuario").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
