package libro;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LibroEdit")
public class LibroEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/libreria","root", "root");
		Statement s = conexion.createStatement();
		
		Autor a= new Autor();
		ResultSet rs= s.executeQuery("select * from autores");
		List<Autor> listaAutor = new ArrayList<Autor>(); 
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>\n" +"<html>\n" +"<head>\n" +"<meta charset=\"ISO-8859-1\">\n" +"<title>Insert title here</title>\n" +
					"</head>\n" +"<body><h2>LISTA DE LIBROS</h2>\n");
		while (rs.next()) 
			listaAutor.add(new Autor(rs.getInt(1), rs.getString(2), rs.getDate(3)));
			 
		rs = s.executeQuery("select * from libros where id="+ Integer.parseInt(request.getParameter("id")));
		List<Libros> listaLibro = new ArrayList<Libros>();
		
		while (rs.next())
			listaLibro.add(new Libros(rs.getInt(1), rs.getString(2), rs.getDate(3), a.buscarAutor(rs.getInt(4))));
		
		writer.println("`Detalle del libro seleccionado´<br />");
		writer.println("" + "<form method=\"get\" action=\"LibroEditProcess\">" +"<ul>");
		for (Libros element:listaLibro)
		{
			writer.println("<input type=\"hidden\" name=\"id\" value=\"+ element.getId() +\">"+
					"<li>Autor: "+ element.getTitulo()+"</li>");
			writer.println("<input type=\"hidden\" name=\"titulo\" value=\"+ element.getTitulo() +\">"+
					"<li><input type=\"text\" name=\"nombre\" value=\""+element.getFecha()+"\" /></li>");
			writer.println("<input type=\"hidden\" name=\"titulo\" value=\"+ element.getNombre() +\">"+
					"<li><input type=\"text\" name=\"nombre\" value=\""+element.getAutor()+"\" /></li>");
		}
		writer.println("" +"</ul>" +"</form>" +"<br /><a href=\"./Libros\">[Volver]</a> ");
		writer.println("</body>\n" +"</html>\n");	
		writer.close();
		conexion.close();
	} catch (Exception e){
	   e.printStackTrace();
	} 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}