package es.cea.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.cea.negocio.Persistencia;
import es.cea.negocio.Usuario;


@WebServlet("/entrar")
public class ValidarLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ValidarLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

Usuario usuarioLogeando = new Usuario();
		
		usuarioLogeando.setNombre(request.getParameter("nombre"));
		usuarioLogeando.setClave(request.getParameter("clave"));
		
	
		try {
			if ( Persistencia.validarUsuario(usuarioLogeando) == true){
				

				request.getSession().setAttribute("usuario", usuarioLogeando);
				request.getSession().setAttribute("idDb", Persistencia.getUsuarioDbId(usuarioLogeando));
				request.getRequestDispatcher("/mensajesUsuario").forward(request, response);

			} else {
				request.getRequestDispatcher("twitter.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

}
