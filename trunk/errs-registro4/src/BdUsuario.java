
import java.util.List;

public class BdUsuario {

	public List<Usuario> listaUsuario;

	public boolean existeUsuario(String nombre) {
		for (Usuario element : listaUsuario)
			if (element.getNombre().equals(nombre))
				return true;

		return false;
	}

	public Usuario dameUsuario(String nombre, String clave) throws ClaveIncorrecta {

		for (Usuario element : listaUsuario)
			if (element.getClave().equals(clave)
					&& element.getNombre().equals(nombre))
				return element;
		
		throw new ClaveIncorrecta();
	}

}
