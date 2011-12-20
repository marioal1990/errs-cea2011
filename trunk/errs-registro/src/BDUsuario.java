import java.util.*;


public class BDUsuario {
	
		List<Usuario> lUsuario = new ArrayList<Usuario>();
		
		public boolean existeUsuario(String nombreUsuario) {
			for(Usuario element : lUsuario)
			{
				if(element.getUsuario().equals(nombreUsuario))
				{
					return true;
				}
			}
			return false;
		}
		
		public Usuario dameUsuario(String nombreUsuario, String string2)throws ClaveIncorrectaException {
			
			for(Usuario element : lUsuario)
			{
				if(element.usuario.equals(nombreUsuario) && element.contrasena.equals(string2))
				{
					return element;
				}
			}

			throw new ClaveIncorrectaException();
		}

}
