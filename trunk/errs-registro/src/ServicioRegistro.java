import java.util.ArrayList;
import java.util.List;

import es.cea.core.scopes.Sesion;


public class ServicioRegistro {
	
	BDUsuario bDUsuario;
	Sesion sesion;
	public Usuario registra(String nombreUsuario, String string2) throws ClaveIncorrectaException,UsuarioNoExisteException{
		boolean existe = bDUsuario.existeUsuario(nombreUsuario);
		if(!existe){
			throw new UsuarioNoExisteException();
			
		}else{
				Usuario  usuario = bDUsuario.dameUsuario(nombreUsuario, string2);
			
				sesion.addAtributo("usuario", usuario);
				
				return usuario;
		}
	}

}
