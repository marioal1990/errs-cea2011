package com.enjava.aplicacioncapas;

public class DaoImpl implements Dao {
	
	Dao dao;
	
	public Dao getDao(){
		return dao;
	}
	
	public void setDao(Dao dao){
		this.dao = dao;
	}

	@Override
	public String daLosBuenosDias(){
		return "buenos d�as desde el DAO... y con Spring!!";
	}

}
