package com.enjava.aplicacioncapas;

import com.enjava.Alumno;

public class ServicioImpl implements Servicio{

	Dao dao;
	
	public Dao getDao(){
		return dao;
	}
	
	public void setDao(Dao dao){
		this.dao = dao;
	}

	@Override
	public String dameBuenosDias() {
		return dao.daLosBuenosDias();
	}
}
