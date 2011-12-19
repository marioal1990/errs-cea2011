package es.cea;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class TestServicioPeriodico {

	
	@Test
	public void pruebaDameNoticiasOK(){
//		String tituloPocoyo="pocoyo";
//		Programa programa=new Programa();
//		programa.titulo=tituloPocoyo;
		
		//escenario de prueba--> creacion y setter de objetos
	ServicioPeriodico servicioPeriodico=new ServicioPeriodico();
	ServicioSuscripciones servicioSuscripciones=new ServicioSuscripciones();
	ServicioNoticias servicioNoticias=new ServicioNoticias();
	
	Lector lector=new Lector("12345");
	
	List<Lector> lectoresSuscritos=new ArrayList<Lector>();
	lectoresSuscritos.add(new Lector("12345"));
	lectoresSuscritos.add(new Lector("23456"));
	servicioSuscripciones.lectores=lectoresSuscritos;

	//setter de propiedades /inyeccion de dependencias
	servicioPeriodico.servicioSuscripciones=servicioSuscripciones;
	servicioPeriodico.servicioNoticias=servicioNoticias;
		//invocacion del programa
	List<Noticia> noticias=servicioPeriodico.dameNoticias(lector);
		
		//asercion de resultados
		assert(noticias!=null):"ups objeto nulo como resultado!";
		assert(noticias.size()>0):"al menos tendria una noticia";

	}
	
	@Test
	public void pruebaDameNoticiasFALSO(){
//		String tituloPocoyo="pocoyo";
//		Programa programa=new Programa();
//		programa.titulo=tituloPocoyo;
		
		//escenario de prueba--> creacion y setter de objetos
		ServicioPeriodico servicioPeriodico=new ServicioPeriodico();
		ServicioSuscripciones servicioSuscripciones=new ServicioSuscripciones();
		ServicioNoticias servicioNoticias=new ServicioNoticias();
		
		List<Lector> lectoresSuscritos=new ArrayList<Lector>();
		lectoresSuscritos.add(new Lector("12345"));
		lectoresSuscritos.add(new Lector("23456"));
		servicioSuscripciones.lectores=lectoresSuscritos;
		
		Lector lectorActual=new Lector("67890");
		
		//setter de propiedades /inyeccion de dependencias
		servicioPeriodico.servicioSuscripciones=servicioSuscripciones;
		servicioPeriodico.servicioNoticias=servicioNoticias;
		//invocacion del programa
		List<Noticia> noticias=servicioPeriodico.dameNoticias(lectorActual);
		
		//asercion de resultados
		assert(noticias==null):"ups deberia ser nulo como resultado!";
		
	}
	
}






