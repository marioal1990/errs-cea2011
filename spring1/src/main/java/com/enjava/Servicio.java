package com.enjava;

public class Servicio {

	Dependencia dependencia;

	
	public void setDependencia(Dependencia dep) {
		this.dependencia = dep;
	}


	public String trabaja(){
		return dependencia.trabaja();
	}
	
	
}
