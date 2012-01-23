package es.cea;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/CalculadoraMVC")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//EL MODELO
		ResultadoCalculadora res = new ResultadoCalculadora();
		
		//LA FORMA EN LA QUE SE CARGA EL MODELO
		String sumando1 = request.getParameter("sumando1");
		String sumando2 = request.getParameter("sumando2");
		ServicioCalculadora servicio = new ServicioCalculadora();
		int resultado = servicio.suma(sumando1, sumando2);
		
		//generar el modelo
		res.setResultado(resultado);
		res.setSumando1(sumando1);
		res.setSumando2(sumando2);
		
		//publicando el modelo...
		//se elige el lugar y el identificativo del atributo
		request.setAttribute("resultado", res);
		//se selecciona la vista
		request.getRequestDispatcher("calculadora.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
