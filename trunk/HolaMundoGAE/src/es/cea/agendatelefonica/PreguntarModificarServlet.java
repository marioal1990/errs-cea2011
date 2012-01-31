package es.cea.agendatelefonica;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class PreguntarModificarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PreguntarModificarServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("modificaContacto.jsp")
		.forward(request, response);
		
		
		
	}

	
	

}
