package es.cea.agendatelefonica;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BorrarContactoServlet")
public class BorrarContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BorrarContactoServlet() {
        super();
        
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	Agenda agenda = (Agenda) request.getSession().getServletContext()
			.getAttribute("agenda");
	
	String nombre=request.getParameter("nombre");
	String telefono=request.getParameter("telefono");
	System.out.println(telefono);
	
	ContactoTel busca = null;
			for (ContactoTel contacto : agenda.contactos) {
				if (contacto.getTelefono().equals(telefono)) {
					busca = contacto;
					System.out.println(busca);
					
				}

			}
			agenda.contactos.remove(busca);
			
		
	
			request.getRequestDispatcher("borrado.jsp")
			.forward(request, response);

}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
