package com.enjava.chat;

import java.util.ArrayList;
import java.util.List;

public class UsuarioChat {
	
	private Long id;
	private String nombre;
	private List <ComentarioChat> listaComentarios = new ArrayList<ComentarioChat>();
	
	public UsuarioChat(){
		
	}

	
	public UsuarioChat(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public UsuarioChat(Long id, String nombre, List<ComentarioChat> listaComentarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.listaComentarios = listaComentarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ComentarioChat> getListaComentarios() {
		return listaComentarios;
	}

	public void setListaComentarios(List<ComentarioChat> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}

	@Override
	public String toString() {
		return "UsuarioChat [id=" + id + ", nombre=" + nombre
				+ ", listaComentarios=" + listaComentarios + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((listaComentarios == null) ? 0 : listaComentarios.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioChat other = (UsuarioChat) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaComentarios == null) {
			if (other.listaComentarios != null)
				return false;
		} else if (!listaComentarios.equals(other.listaComentarios))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
