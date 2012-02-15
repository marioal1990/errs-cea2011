package com.enjava.registro;

public interface DaoRegistro {

	boolean registrar(String mailUsuario, String clave) throws ExceptionYaExiste;

}
