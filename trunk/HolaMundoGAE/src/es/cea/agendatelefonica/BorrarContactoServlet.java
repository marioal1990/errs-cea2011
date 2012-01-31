package es.cea.agendatelefonica;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BorrarContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BorrarContactoServlet() {
        super();
       
    }

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//SE CREA EL ENTITY MANAGER 
	EntityManagerFactory entityManagerFactory = (EntityManagerFactory) request.getSession().getServletContext().getAttribute("emf");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	//SE ABRE LA TRANSACCION
	transaction.begin();
	Query query = entityManager.createQuery("DELETE from ContactoTel where id="+ request.getParameter("id"));
	query.executeUpdate();
	transaction.commit();
	

								
			
			//SE VA A LA VISTA BORRADO.JSP
			request.getRequestDispatcher("borrado.jsp")	.forward(request, response);

}


	

}
