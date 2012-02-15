package com.enjava.registro;

public class DaoRegistroImpl implements DaoRegistro{

	String mailUsuarioExt = "rocio@hotmail.com";
	String clave = "123";
	
	@Override
	public boolean registrar(String mailUsuario, String clave) throws ExceptionYaExiste{
		
		if(mailUsuario.equals(mailUsuarioExt) && clave.equals(clave))
		{
			throw new ExceptionYaExiste();
		}
		else
		{
			return true;
		}
	}
}
