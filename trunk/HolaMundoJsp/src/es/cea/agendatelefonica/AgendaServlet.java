package es.cea.agendatelefonica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgendaServlet
 */
@WebServlet("/agenda")
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ContactoTel> contactos=new ArrayList<ContactoTel>();
		contactos.add(new ContactoTel("Dario", "123456"));
		contactos.add(new ContactoTel("Maria", "7891011"));
		contactos.add(new ContactoTel("Joselito", "12131415"));
		
		//publicar el modelo
		request.setAttribute("contactos", contactos);
		//seleccionar la vista
		request.getRequestDispatcher("agendaTelefonica.jsp")
		.forward(request, response);
		
	}

}

