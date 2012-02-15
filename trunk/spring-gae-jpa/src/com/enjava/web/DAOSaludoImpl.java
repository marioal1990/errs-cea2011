package com.enjava.web;

import java.util.Calendar;

import com.enjava.Alumno;
import com.enjava.EMF;

public class DAOSaludoImpl implements DAOSaludo {

	@Override
	public String daLosBuenosDias() {
		return "buenos dias desde el DAO ... y con Spring!!";
	}

}
