package com.enjava.web;

public class ServicioSaludoImpl implements ServicioSaludo {

	DAOSaludo DAOSaludo;//=new DAOSaludoImpl()
	
	@Override
	public String dameBuenosDias() {
		
		return DAOSaludo.daLosBuenosDias();
	}

	public DAOSaludo getDAOSaludo() {
		return DAOSaludo;
	}

	public void setDAOSaludo(DAOSaludo dAOSaludo) {
		DAOSaludo = dAOSaludo;
	}

}
