package es.cea.agendatelefonica;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//SE CREA EL ENTITY MANAGER	
	EntityManagerFactory entityManagerFactory = (EntityManagerFactory) request.getSession().getServletContext().getAttribute("emf");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	//ABRIMOS LA TRANSACCION
	EntityTransaction transaction = entityManager.getTransaction();
	transaction.begin();

	String jpql = "select contactoTel from ContactoTel contactoTel";
	List<ContactoTel> contactos = entityManager.createQuery(jpql).getResultList();
	
	transaction.commit();
	
	request.setAttribute("contactos", contactos);
		
		
		//SE VA A LA VISTA AGENDATELEFONICA.JSP
		request.getRequestDispatcher("agendaTelefonica.jsp").forward(request, response);
		
	}


}
