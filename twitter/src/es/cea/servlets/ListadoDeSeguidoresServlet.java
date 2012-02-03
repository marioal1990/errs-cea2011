package es.cea.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.cea.negocio.Persistencia;
import es.cea.negocio.Usuario;


@WebServlet("/seguidores")
public class ListadoDeSeguidoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ListadoDeSeguidoresServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Usuario> seguidores = Persistencia.getSeguidoresById((Integer)request.getSession().getAttribute("idDb"));
			request.setAttribute("seguidores", seguidores);
			request.getRequestDispatcher("listadoSeguidores.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
