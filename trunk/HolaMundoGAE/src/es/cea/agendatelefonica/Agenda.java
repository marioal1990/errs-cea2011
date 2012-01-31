package es.cea.agendatelefonica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agenda {
	Long id;
	public List<ContactoTel> contactos = new ArrayList<ContactoTel>();

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToMany(mappedBy="agenda") 
	public List<ContactoTel> getContactos() {
		return contactos;
	}

	public void setContactos(List<ContactoTel> contactos) {
		this.contactos = contactos;
	}
}
