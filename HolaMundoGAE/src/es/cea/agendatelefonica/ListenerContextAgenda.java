package es.cea.agendatelefonica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



public class ListenerContextAgenda implements ServletContextListener {

	public ListenerContextAgenda() {

	}

	public void contextInitialized(ServletContextEvent arg0) {
		
		//CREACION DEL ENTITY MANAGER FACTORY PARA PODER TRABAJAR CON PERSISTENCIAS
		EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("transactions-optional");
		arg0.getServletContext().setAttribute("emf", emfInstance);
		
		
		// EntityManagerFactory entityManagerFactory = (EntityManagerFactory)
		// arg0.getServletContext().getAttribute("emf");
		// EntityManager entityManager =
		// entityManagerFactory.createEntityManager();
		// EntityTransaction transaction = entityManager.getTransaction();
		// transaction.begin();
		// entityManager.persist(new ContactoTel("Dario", "123456"));
		// transaction.commit();
		//
		
		
		

		
	}

	public void contextDestroyed(ServletContextEvent arg0) {

	}

}
