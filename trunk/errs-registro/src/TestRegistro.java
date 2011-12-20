import java.util.*;

import org.testng.annotations.Test;

import es.cea.core.scopes.Sesion;

public class TestRegistro {
	
	@Test
	public void metodo()
	{
		
		//Escenario de la prueba: preparar la informacion de los objetos antes de la invocacion
		//preparar la sesion
		Sesion sesion=new Sesion();
		
		
		//preparar la bd de usuarios
		Usuario usuario1 = new Usuario("roi","YYY");
		Usuario usuario2 = new Usuario("juan","JJJ");
		
		List <Usuario> listaUsuario = new ArrayList<Usuario>();
		
		listaUsuario.add(usuario1);
		listaUsuario.add(usuario2);
		
		
		
		BDUsuario bdUsuario=new BDUsuario();
		bdUsuario.lUsuario=listaUsuario;
		
		//el objeto (programa) a invocar
		ServicioRegistro servicioRegistro=new ServicioRegistro();
		servicioRegistro.bDUsuario=bdUsuario;
		servicioRegistro.sesion=sesion;
		
		
		//invocacion del programa
		try{
		
		Usuario usuario=servicioRegistro.registra("juan", "JJJ");
		
		//asertar los resultados
		assert(usuario!=null);

		
		}catch (UsuarioNoExisteException e) {
			System.err.println("Usuario no existe");
		}catch (ClaveIncorrectaException e) {
			System.err.println("Clave Incorrecta");
		}
		
		
		
	}	
}
	
	
	


