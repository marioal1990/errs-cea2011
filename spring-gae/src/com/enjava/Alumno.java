package com.enjava;

public class Alumno {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Nombre seteado por Spring::: "+nombre);
	}
	
}
