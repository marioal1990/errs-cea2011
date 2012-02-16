package com.enjava.chat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.Key;

public class ComentarioChat {
	
	private Key id;
	private Date date;
	private String texto;
	private UsuarioChat usuarioChat;
	
	public ComentarioChat() {
		super();
	}

	public ComentarioChat(Date date, String texto, UsuarioChat usuarioChat) {
		super();
		this.date = date;
		this.texto = texto;
		this.usuarioChat = usuarioChat;
	}

	public ComentarioChat(Key id, Date date, String texto,UsuarioChat usuarioChat) {
		super();
		this.id = id;
		this.date = date;
		this.texto = texto;
		this.usuarioChat = usuarioChat;
	}
	
	
	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public UsuarioChat getUsuarioChat() {
		return usuarioChat;
	}

	public void setUsuarioChat(UsuarioChat usuarioChat) {
		this.usuarioChat = usuarioChat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ComentarioChat other = (ComentarioChat) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ComentarioChat [id=" + id + ", date=" + date + ", texto="
				+ texto + ", usuarioChat=" + usuarioChat + "]";
	}

}