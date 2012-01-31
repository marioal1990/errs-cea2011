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

public class CreaAgendaNueva extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		EntityManagerFactory entityManagerFactory = (EntityManagerFactory) req.getSession().getServletContext().getAttribute("emf");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//ABRIMOS LA TRANSACCION
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Agenda agenda=new Agenda();
		entityManager.persist(agenda);
		transaction.commit();
		entityManager.close();
		resp.getWriter().print("hecho!");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
