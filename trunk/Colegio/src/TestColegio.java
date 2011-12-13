
import java.util.*;

import org.testng.annotations.Test;


public class TestColegio {
	
	
		@Test
		public void comprobarMetodoAddAsignaturaAlumno() {
			
		//Escenario de la prueba: preparar la informacion de los objetos antes de la invocacion
			Asignatura asignatura1 = new Asignatura();
			Asignatura asignatura2 = new Asignatura();
			Asignatura asignatura3 = new Asignatura();
			Asignatura asignatura4 = new Asignatura();
			Asignatura asignatura5 = new Asignatura();
			
			asignatura1.nombre = "Arquitectura de equipos y sistemas informáticos";
			asignatura2.nombre = "Sistemas Operativos";
			asignatura3.nombre = "Sistemas telemáticos";
			asignatura4.nombre = "Redes";
			asignatura5.nombre = "Lenguajes de Programación";
			
			ArrayList <Asignatura> listaAsignatura = new ArrayList <Asignatura>();
			 
			listaAsignatura.add(asignatura1);
			listaAsignatura.add(asignatura2);
			listaAsignatura.add(asignatura3);
			listaAsignatura.add(asignatura4);
			listaAsignatura.add(asignatura5);
			
			ServicioSecretaria servicioSecretaria = new ServicioSecretaria();
			servicioSecretaria.listaAsignatura = listaAsignatura;
			
			Map<Asignatura,Integer> matriculas = new HashMap <Asignatura, Integer>();
			matriculas.put(asignatura1, 30);
			matriculas.put(asignatura2, 1);
			matriculas.put(asignatura3, 26);
			matriculas.put(asignatura4, 1);
			matriculas.put(asignatura5, 3);
			
			CupoAsignatura cupoAsignatura = new CupoAsignatura();
			cupoAsignatura.matriculas = matriculas;
			
			//invocacion del programa
			ServicioMatricula servicioMatricula = new ServicioMatricula();
			servicioMatricula.servicioSecretaria=servicioSecretaria;
			servicioMatricula.cupoAsignatura=cupoAsignatura;
			
			//assert
			boolean resultado = servicioMatricula.matriculaAsignatura("Redes");
			
			assert(resultado == true);
			
			boolean resultado2 = cupoAsignatura.compruebaAsignatura(asignatura5);
			
			assert(resultado2 == true);
			
	}
}
