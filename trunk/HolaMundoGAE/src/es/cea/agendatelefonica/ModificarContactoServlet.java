package es.cea.agendatelefonica;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ModificarContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ModificarContactoServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 //SE CREA EL ENTITY MANAGER        
		EntityManagerFactory entityManagerFactory = (EntityManagerFactory) request.getSession().getServletContext().getAttribute("emf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		Query query = entityManager.createQuery("SELECT contacto from ContactoTel contacto where contacto.nombre=:nombreBusqueda and contacto.telefono=:jhjh");
		query.setParameter("nombreBusqueda", request.getParameter("nombreAntiguo"));
		query.setParameter("jhjh", request.getParameter("tel"));
		ContactoTel contactoTel = (ContactoTel) query.getSingleResult();

		request.setAttribute("contacto", contactoTel);
			
		transaction.commit();
		
				request.getRequestDispatcher("modificado.jsp").forward(request, response);

		
		
	}


	

}
