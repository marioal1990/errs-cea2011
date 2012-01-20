package com.enjava.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PrePersist;
import javax.transaction.Transaction;

import libreria.Libro;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.enjava.tutorial.hibernate.Alumno;

import es.cea.chat.Chat;
import es.cea.chat.Color;
import es.cea.chat.Mensaje;
import es.cea.chat.Usuario;
import es.cea.inmobiliaria.Barrio;
import es.cea.inmobiliaria.Casa;
import es.cea.inmobiliaria.Ciudad;
import es.cea.inmobiliaria.Habitacion;
import es.cea.inmobiliaria.Inmobiliaria;

public class PruebaArraque {
	EntityManagerFactory emf;
	@BeforeTest
	public void arranca(){
		
		emf = Persistence.createEntityManagerFactory("manager1");
	}
	
	@Test
	public void pruebaArranque(){
		
		// *********EJERCICIO  INMOBILIARIA **********
		 EntityManager em = emf.createEntityManager(); // Retrieve an application managed entity manager
		
		 Barrio b1 = em.find(Barrio.class, new Long(1));//El find sirve para encontrar en mi BD y me lo guarda en una variable barrio
		 System.out.println("Mi barrio 1: "+b1.getNombre());
		 
		 Ciudad ciudad = b1.getCiudad();
		 System.out.println(ciudad.getCodigo());
		 
		 Inmobiliaria inmob1 = b1.getInmobiliaria();
		 System.out.println("Inmobiliaria: "+ inmob1.getNombre()+" " + inmob1.getCif());
		 
		 Barrio b2 = em.find(Barrio.class, new Long(2));
		 System.out.println("Mi barrio 2: "+ b2.getNombre());
		 
		 Ciudad ciudad2 = b2.getCiudad();
		 System.out.println(ciudad2.getCodigo());
		 
		 Inmobiliaria inmob2 = b2.getInmobiliaria();
		 System.out.println("Inmobiliaria: "+ inmob2.getNombre()+" " + inmob2.getCif());
		 
		 
		 Casa casa1 = em.find(Casa.class, new Long(3));
		 System.out.println("Mi casa 3 esta en el barrio: "+ casa1.getBarrio().getNombre()+ " en la dirección: "+ casa1.getDireccion());
		
		 //Añadir una nueva ciudad a la BD
		 Ciudad ciudadNueva = new Ciudad();
		 ciudadNueva.setCodigo("Málaga");
		 
		 EntityTransaction tx = em.getTransaction();//creas transación
		 tx.begin(); // Comienza la transación
		 em.persist(ciudadNueva); // Lo añades
		 tx.commit(); // y commiteas las modificaciones
		 
		// *********EJERCICIO  CHAT **********
		
		 
		 //Insertar un mensaje nuevo
		 Chat chat = em.find(Chat.class, new Long(1));
		 System.out.println("Mi chat es: "+ chat.getTema());
		 
		 
		 Usuario usuario = em.find(Usuario.class, new Long(3));
		 System.out.println("Mi usuario 3 es: "+ usuario.getMail());
				 
		 Mensaje mensaje = new Mensaje();
		 mensaje.setChat(chat);
		 mensaje.setUsuario(usuario);
		 mensaje.setTexto("JPA");
		 
		 EntityTransaction tx2 = em.getTransaction();//creas transación
		 tx2.begin(); // Comienza la transación
		 em.persist(mensaje); // Lo añades
		 tx2.commit(); // y commiteas las modificaciones
		 
		 //Eliminar mensaje
		 
		 Mensaje mensaje2 = em.find(Mensaje.class, new Long(7));
		
		 		
		 EntityTransaction tx3 = em.getTransaction();//creas transación
		 tx3.begin(); // Comienza la transación
		 em.remove(mensaje); // Lo añades
		 tx3.commit(); // y commiteas las modificaciones
		 
		//Crear usuario nuevo
		 Color color1 = em.find(Color.class, new Long(1));		 
		 Usuario usuario2 = new Usuario();
		 usuario2.setColor(color1);
		 usuario2.setNombre("Pablo");
		 usuario2.setNick("juanpa");
		 usuario2.setMail("jp@hotmail.com");
		 usuario2.setClave("pppp");
		 
		 EntityTransaction tx4 = em.getTransaction();//creas transación
		 tx4.begin(); // Comienza la transación
		 em.persist(usuario2);
		 tx4.commit();
		 
		 //*******Libreria*********
		 List<Libro> resultList = em.createQuery("from Libro").getResultList();
		 int tamanyo = resultList.size();
		 assert(tamanyo == 3):tamanyo +"----";
		 Libro libro = new Libro();
		 libro.setNombre("jee con jpa!");
		 EntityTransaction transaction = em.getTransaction();
		 transaction.begin();
		 em.persist(libro);
		 transaction.commit();
		 
		 List<Libro> resultList2 = em.createQuery("from Libro").getResultList();
		 assert(resultList2.size()==4);
		 
		 
		
		em.close();
		emf.close(); //close at application end
	}
}
