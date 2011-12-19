package es.cea.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class SuperServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SuperServletCalculadora() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operador1 = request.getParameter("operador1");
		String operador2 = request.getParameter("operador2");
		String operador = request.getParameter("operacion");
		
		PrintWriter writer = response.getWriter();
		
		if (operador.equals("suma")) {

			int res = Integer.parseInt(operador1) + Integer.parseInt(operador2);

			writer.println("El resultado es: " + res);
		} else if (operador.equals("resta")) {

			int res = Integer.parseInt(operador1) - Integer.parseInt(operador2);

			writer.println("El resultado es: " + res);
		} else if (operador.equals("multiplicacion")) {

			int res = Integer.parseInt(operador1) * Integer.parseInt(operador2);

			writer.println("El resultado es: " + res);
		} else if (operador.equals("division")) {

			int res = Integer.parseInt(operador1) / Integer.parseInt(operador2);

			writer.println("El resultado es: " + res);
		}

		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
