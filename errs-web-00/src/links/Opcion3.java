package links;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Opcion3")
public class Opcion3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<html>"+"<body>"+"<h2>"+"HAS ELEGIDO LA OPCION 3"+"<h2>"+"<br>"+"<a href = './home'>HOME</a>"+"</body>"+"</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
