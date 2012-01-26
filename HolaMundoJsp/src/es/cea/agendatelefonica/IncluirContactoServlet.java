package es.cea.agendatelefonica;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IncluirContactoServlet")
public class IncluirContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public IncluirContactoServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Agenda agenda = (Agenda) request.getSession().getServletContext()
				.getAttribute("agenda");
		String nombre=request.getParameter("nombre");
		String telefono=request.getParameter("telefono");
		agenda.contactos.add(new ContactoTel(nombre, telefono));
		
		
		request.getRequestDispatcher("incluido.jsp")
		.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
