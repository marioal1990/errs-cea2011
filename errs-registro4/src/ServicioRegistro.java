import es.cea.core.scopes.Sesion;

public class ServicioRegistro {

	BdUsuario bdUsuario;
	Sesion sesion;
	Usuario usuario;
	public Usuario registra(String nombre, String clave) throws UsuarioNoExiste, ClaveIncorrecta {
		boolean existe = bdUsuario.existeUsuario(nombre);

		if(!existe)
			throw new UsuarioNoExiste();
		
		usuario = bdUsuario.dameUsuario(nombre, clave);
		
		sesion.addAtributo(usuario.getNombre(), usuario);
		
		return usuario;
	}

}
