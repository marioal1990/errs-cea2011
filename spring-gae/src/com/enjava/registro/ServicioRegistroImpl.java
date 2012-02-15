package com.enjava.registro;

public class ServicioRegistroImpl implements ServicioRegistro {
	
	DaoRegistro daoRegistro;

	public DaoRegistro getDaoRegistro() {
		return daoRegistro;
	}

	public void setDaoRegistro(DaoRegistro daoRegistro) {
		this.daoRegistro = daoRegistro;
	}
	
	public boolean registra(int edad, String mailUsuario, String clave) throws ExceptionEdad, ExceptionYaExiste{
		if(edad <18)
		{
			throw new ExceptionEdad();
		}
		else{
			return daoRegistro.registrar(mailUsuario, clave);
		}	
	}

}
