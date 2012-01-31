package es.cea.agendatelefonica;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.enjava.model.Contacto;


public class IncluirContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public IncluirContactoServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//CREAMOS UN OBJETO CONTACTO PARA CREAR UNO NUEVO	
        ContactoTel contactoNuevo = new ContactoTel();
		
        //SE CREA EL ENTITY MANAGER        
		EntityManagerFactory entityManagerFactory = (EntityManagerFactory) request.getSession().getServletContext().getAttribute("emf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		contactoNuevo.setNombre(request.getParameter("nombre"));
		contactoNuevo.setTelefono(request.getParameter("telefono"));
		Agenda agenda=entityManager.find(Agenda.class, new Long(2));
		contactoNuevo.setAgenda(agenda);
		transaction.begin();
		entityManager.persist(contactoNuevo);

		transaction.commit();

				
		//SE VA A LA VISTA INCLUIDO.JSP
		request.getRequestDispatcher("incluido.jsp").forward(request, response);
	
	}
	
}
