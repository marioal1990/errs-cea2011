package es.cea.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.cea.negocio.Persistencia;


@WebServlet("/listaUsuarios")
public class ListadoUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ListadoUsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			request.setAttribute("listaUsuarios", Persistencia.getUsuariosName());
			request.getRequestDispatcher("listadoUsuarios.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
