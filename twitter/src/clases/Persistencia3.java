package clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public abstract class Persistencia3 {

	Statement statement;
	Connection conexion;
	
	public Persistencia3(){
	
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
		s.executeUpdate("INSERT INTO usuario SET nombre = '"+ usuario.getNombre() +"', clave = '"+ usuario.getClave() +"'");
		Persistencia.cerrarConexion(conexion);
		
	}
	
	public static boolean validarUsuario(Usuario usuario) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery ("select * from usuario");  
		List<Usuario> usuarios = new ArrayList<Usuario>();
		while (rs.next())  
		{  
			usuarios.add(new Usuario(rs.getString (2), rs.getString (3)));
		}  
		
		if (usuarios.contains(usuario)){
			System.out.println("Usuario encontrado");
			
			int indice = usuarios.indexOf(usuario);
			
			Usuario usuarioMentira = usuarios.get(indice);
			
			if(usuarioMentira.getClave().equals(usuario.getClave())){
				Persistencia.cerrarConexion(conexion);
				System.out.println("Clave correcta");
				return true;
			} 
			
		} else {
			
			System.out.println("Usuario no encontrado");
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
		ResultSet rs = s.executeQuery ("select id from usuario where nombre like '"+usuario.getNombre()+"'");  
		
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
		
		
		ResultSet rs = s.executeQuery ("select * from mensaje where id_usuario =" + id);  
		List<Mensaje> mensajes = new ArrayList<Mensaje>();
		while (rs.next())  
		{  
			mensajes.add(new Mensaje(rs.getString (3)));
		}  
		Persistencia.cerrarConexion(conexion);
		
		return mensajes;
	}
	
	public static void guardarMensaje(int idUsuario, String texto) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		s.executeUpdate("INSERT INTO mensaje SET id_usuario = '"+ idUsuario +"', texto = '"+ texto +"'");
		Persistencia.cerrarConexion(conexion);
		
	}
	
	public static List<Usuario> getUsuariosName() throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery ("SELECT * from usuario");  
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
		s.executeUpdate("INSERT INTO usuarioseguidor SET id_seguidor = '"+ idSeguidor +"', id_usuario = '"+ idSeguido +"'");
		Persistencia.cerrarConexion(conexion);
	}

public static List<Usuario> getSeguidoresById(int idSeguido) throws Exception{
		
		Connection conexion = Persistencia.abrirConexion();
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery ("select  nombre from usuarioseguidor s" +
				"inner join usuario u on id_usuario = id_seguidor where id_seguido = " + idSeguido );  

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
		
		ResultSet rs = s.executeQuery ("select  nombre from usuarioseguidor s" +
				"inner join usuario u on id_usuario = id_seguido where id_seguidor = " + idSeguidor );  

		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		while (rs.next())  
		{  
			usuarios.add(new Usuario(rs.getString(1),null));
		}  
		Persistencia.cerrarConexion(conexion);
		return usuarios;
		
	}
	
	
}
