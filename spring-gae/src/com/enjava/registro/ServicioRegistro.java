package com.enjava.registro;

public interface ServicioRegistro {
	
	boolean registra(int edad, String mailUsuario,String clave) throws ExceptionEdad, ExceptionYaExiste;
}
