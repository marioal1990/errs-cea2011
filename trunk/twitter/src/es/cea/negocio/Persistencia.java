package es.cea.negocio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public abstract class Persistencia {

	Statement statement;
	Connection conexion;
	
	public Persistencia(){
	
	}
	
	public static Connection abrirConexion(){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/twitter","root", "root"); 
			return conexion;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
		
	public static void cerrarConexion(Connection conexion){
		
		try {
			conexion.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}  
	}
	
	public static void guardarNuevoUsuario(Usuario usuario) throws Exception{
		 
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		s.executeUpdate("INSERT INTO usuarios SET nombre = '"+ usuario.getNombre() +"', clave = '"+ usuario.getClave() +"'");//Atualiza BD
		Persistencia.cerrarConexion(conexion);
		
	}
	
	public static boolean validarUsuario(Usuario usuario) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery ("select * from usuarios");  
		List<Usuario> usuarios = new ArrayList<Usuario>();
		while (rs.next())  
		{  
			usuarios.add(new Usuario(rs.getString (2), rs.getString (3)));
		}  
		
		if (usuarios.contains(usuario)){
			
			int indice = usuarios.indexOf(usuario);
			
			Usuario usuarioMentira = usuarios.get(indice);
			
			if(usuarioMentira.getClave().equals(usuario.getClave())){
				Persistencia.cerrarConexion(conexion);
			
				return true;
			} 
			
		} else {
			
		
			Persistencia.cerrarConexion(conexion);
			return false;
		}
		
		Persistencia.cerrarConexion(conexion);
		return false;
		
	}
	
	public static int getUsuarioDbId(Usuario usuario) throws Exception{
		
		int indice = 0;
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery ("select id_usuario from usuarios where nombre like '"+usuario.getNombre()+"'");  
		
		while (rs.next())  
		{  
			indice = rs.getInt(1);
		}
		
		
		Persistencia.cerrarConexion(conexion);
		
		return indice;
	}
	
	public static List<Mensaje> getMensajesById(int id) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		
		ResultSet rs = s.executeQuery ("select * from mensajes where id_usuario =" + id);  
		List<Mensaje> mensajes = new ArrayList<Mensaje>();
		while (rs.next())  
		{  
			mensajes.add(new Mensaje(rs.getString (2)));
		}  
		Persistencia.cerrarConexion(conexion);
		
		
		int indice = mensajes.size()-1;
		List<Mensaje> mensajesOrdenados = new ArrayList<Mensaje>();;
		
		while (indice >= 0){
			mensajesOrdenados.add(mensajes.get(indice));
			indice--;
		}
		
		
		return mensajesOrdenados;
	}
	
	public static void guardarMensaje(int idUsuario, String texto) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		s.executeUpdate("INSERT INTO mensajes SET id_usuario = '"+ idUsuario +"', texto = '"+ texto +"'");
		Persistencia.cerrarConexion(conexion);
		
	}
	
	public static List<Usuario> getUsuariosName() throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery ("SELECT * from usuarios");  
		List<Usuario> usuarios = new ArrayList<Usuario>();
		while (rs.next())  
		{  
			usuarios.add(new Usuario(rs.getString(2),null));
		}  
		Persistencia.cerrarConexion(conexion);
		return usuarios;
		
	}
	
	public static void guardarFollower(int idSeguidor, int idSeguido) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		s.executeUpdate("INSERT INTO seguidores SET id_seguidor = '"+ idSeguidor +"', id_seguido = '"+ idSeguido +"'");
		Persistencia.cerrarConexion(conexion);
	}
	
	public static List<Usuario> getSeguidoresById(int idSeguido) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery ("select  nombre from seguidores s" +
				"inner join usuarios u on id_usuario = id_seguidor where id_seguido = " + idSeguido );  

		List<Usuario> usuarios = new ArrayList<Usuario>();
		while (rs.next())  
		{  
			usuarios.add(new Usuario(rs.getString(1),null));
		}  
		Persistencia.cerrarConexion(conexion);
		return usuarios;
		
	}
	
	public static List<Usuario> getSeguidosById(int idSeguidor) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery ("select  nombre from seguidores s" +
				"inner join usuarios u on id_usuario = id_seguido where id_seguidor = " + idSeguidor );  

		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		while (rs.next())  
		{  
			usuarios.add(new Usuario(rs.getString(1),null));
		}  
		Persistencia.cerrarConexion(conexion);
		return usuarios;
		
	}
	
	
}
