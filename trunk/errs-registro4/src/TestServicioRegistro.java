

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import es.cea.core.scopes.Sesion;

public class TestServicioRegistro {

	@Test
	public void TestServicioPrueba() throws UsuarioNoExiste, ClaveIncorrecta {
		try {
			ServicioRegistro servicioRegistro = new ServicioRegistro();
			BdUsuario bdUsuario = new BdUsuario();
			Sesion sesion = new Sesion();

			List<Usuario> listaUsuario = new ArrayList<Usuario>();

			listaUsuario.add(new Usuario("Usuario 1", "clave1", "Direccion"));
			listaUsuario.add(new Usuario("Usuario 2", "clave2", "Direccion2"));
			listaUsuario.add(new Usuario("Usuario 3", "clave3", "Direccion3"));
			listaUsuario.add(new Usuario("Usuario 4", "clave4", "Direccion4"));
			bdUsuario.listaUsuario = listaUsuario;
			servicioRegistro.bdUsuario = bdUsuario;
			servicioRegistro.sesion=sesion;
			
			//Prueba de todo OK
			Usuario usuario = servicioRegistro.registra("Usuario 1", "clave1");
			System.out.println("Bienvenido " + usuario.getNombre());
			assert (usuario != null) : "Esperando al usuario";

			//Prueba de usuario no existe
			Usuario usuario1 = servicioRegistro.registra("Usuario11", "clave1");
			assert (usuario1 == null) : "No existe el usuario";
			
			//Prueba de clave no coincide
			Usuario usuario2 = servicioRegistro.registra("Usuario 1", "cl3ave1");
			assert (usuario2 == null) : "La clave es incorrecta";
		} catch (UsuarioNoExiste e) {
			System.err.println("Usuario No Existe");
		} catch (ClaveIncorrecta e) {
			System.err.println("Clave Incorrecta");
		}

	}
}
