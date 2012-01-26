package es.cea.agendatelefonica;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
	public List <ContactoTel>contactos=new ArrayList<ContactoTel>();

	public List<ContactoTel> getContactos() {
		return contactos;
	}

	public void setContactos(List<ContactoTel> contactos) {
		this.contactos = contactos;
	}
}
