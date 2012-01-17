package libro;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Stats")
public class StatsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		
  		PrintWriter writer = response.getWriter();
		writer.println("<html>" + "<body>" + "<h1>SERVLET ESTADISTICAS</h1>");
		
		List<Stat> stadisticasSes=(List<Stat>) request.getSession().getAttribute("estadisticas");
		response.getWriter().print("<br>de session: </br>"+stadisticasSes);
		
		List<Stat> stadisticasCon= (List<Stat>) request.getServletContext().getAttribute("estadisticas");
		response.getWriter().print("<br>de contexto: </br>"+stadisticasCon);
		
		writer.println("</body>" + "</html>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
