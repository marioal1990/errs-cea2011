package links;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class ServletHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<html>"+"<body>"+"HOME"+"<br>"+"<a href = './Opcion1'>Opcion1</a><br>"+
		"<a href = './Opcion2'>Opcion2</a><br>"+"<a href = './Opcion3'>Opcion3</a><br>"+"<a href = 'calculadora.html'>Calculadora</a><br>"+
		"</body>"+"</html>");
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
