package libro;

public class UsuarioNoRegistrado extends Exception {
		public UsuarioNoRegistrado ()
		{
			super();
		}
		
		public UsuarioNoRegistrado (String s)
		{
			super(s);
		}
}


