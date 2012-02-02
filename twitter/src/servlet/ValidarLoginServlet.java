package servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Persistencia;
import clases.Usuario;


@WebServlet("/entrar")
public class ValidarLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ValidarLoginServlet() {
        super();
        
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
				System.out.println("como si el usuario no estuviera registrado");
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
