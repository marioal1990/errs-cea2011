package com.enjava.web;

import java.util.Calendar;

import com.enjava.Alumno;
import com.enjava.EMF;

public class DAOSaludoJPA implements DAOSaludo {

	EMF emf;//new EMF()
	//necesario para la inyección del EMF (dependencia)
	
	public void setEmf(EMF emf) {
		this.emf = emf;
	}

	@Override
	public String daLosBuenosDias() {
		Alumno alumno1 = emf.getEM().find(Alumno.class, new Long(1));
		return "buenos dias: " +alumno1.getNombre();
	}

}
