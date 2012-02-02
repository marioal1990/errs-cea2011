package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Persistencia;
import clases.Usuario;


@WebServlet("/seguirUsuario")
public class AccionSeguirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AccionSeguirUsuarioServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario(request.getParameter("nombre"), null);
		
		
		try {
				
			Persistencia.guardarFollower((Integer)request.getSession().getAttribute("idDb"), Persistencia.getUsuarioDbId(usuario));
		
			PrintWriter writer = response.getWriter();
			writer.println("<html> <head> </head><body>");
			writer.println("<font size='5'>Seguimiento correcto</font> <br>");
			writer.println("<a href = './mensajesUsuario'> Volver al inicio </a><br>");
			writer.println("</body> </html>");
			writer.close();
			
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
