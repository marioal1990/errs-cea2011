

import java.util.List;
import java.util.Set;

import es.cea.core.scopes.Contexto;
import es.cea.core.scopes.Sesion;

public class ServicioForo {

	public List<Foro> listaForo;

	Sesion sesion;
	Contexto contexto;
	
	public Foro dameForo(String nombre) throws UsuarioNoExiste, UsuarioSinPermisos {
		
		Usuario usuario = (Usuario) sesion.getAtributo("Rocio");		
		if(usuario==null)
			throw new UsuarioNoExiste();
		
		if(!usuario.getForos().contains(new Foro(nombre)))
			throw new UsuarioSinPermisos();
		
			for(Foro element:listaForo)
				if(element.getNombre().equals(nombre))
					return element;
			
		return null;
		
	}
	public void addFavorito(Mensaje mensaje) {
		Set<Mensaje> favoritos = (Set<Mensaje>) sesion.getAtributo("favorito");
		addMensaje(mensaje);
		favoritos= (Set<Mensaje>) contexto.getAtributo("favorito");
		
	}
	private void addMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		
	}
	

}
