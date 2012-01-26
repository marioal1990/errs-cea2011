package es.cea.agendatelefonica;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModificarContactoServlet")
public class ModificarContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ModificarContactoServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Agenda agenda = (Agenda) request.getSession().getServletContext()
				.getAttribute("agenda");
		
		String nombreAntiguo=request.getParameter("nombreAnterior");
		String telefonoAntiguo=request.getParameter("telefonoAnterior");

		String nombreNuevo=request.getParameter("nombreNuevo");
		String telefonoNuevo=request.getParameter("telefonoNuevo");
		System.out.println(telefonoAntiguo);
		
		ContactoTel busca = null;
				for (ContactoTel contacto : agenda.contactos) {
					if (contacto.getTelefono().equals(telefonoAntiguo)) {
						busca = contacto;
						System.out.println(busca);
						
					}

				}
				
				
				agenda.contactos.remove(busca);
				agenda.contactos.add(new ContactoTel(nombreNuevo, telefonoNuevo));
			
		
				request.getRequestDispatcher("modificado.jsp")
				.forward(request, response);

		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

}
