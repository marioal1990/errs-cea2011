package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Persistencia;
import clases.Usuario;


@WebServlet("/siguiendo")
public class ListadoSeguidosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListadoSeguidosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Usuario> seguidos;
		try {
			seguidos = Persistencia.getSeguidoresById((Integer)request.getSession().getAttribute("idDb"));
			request.setAttribute("seguidos", seguidos);
			request.getRequestDispatcher("listadoSeguidos.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
