package es.cea;

import org.testng.annotations.Test;

public class PruebaIdentidadAlumno {



	
	@Test
	public void testEquals(){
		String nombre1 = "pepe";
		String nombre2 = "maria";
		
		Alumno alumno = creaAlumno(nombre1);
		System.out.println("syso de "+alumno);
		Alumno maria = creaAlumno(nombre2);
		
		
		boolean resultado = alumno.equals(maria);
		boolean pepeIgualMaria = resultado;
		
		assert(!pepeIgualMaria):"se espera que sea falso:"+pepeIgualMaria;
		//TODO: es verdad? pepeIgualMaria
		System.out.println("pepeIgualMaria: "+pepeIgualMaria);
		
		Alumno pepe2=new Alumno();
		
		boolean pepeIgualPepe2 = alumno.equals(pepe2);
		
		//TODO: es verdad? pepeIgualPepe2
		System.out.println("pepeIgualPepe2"+pepeIgualPepe2);
		assert(pepeIgualPepe2):"se espera que sea true:"+pepeIgualPepe2;

		
		
	}





	private Alumno creaAlumno(String nombre1) {
		Alumno alumno=new Alumno();
		alumno.nombre=nombre1;
		return alumno;
	}


	
	
	
	@Test
	public void bienvenidaTDD(){
		System.out.println("ok funciona!");
	}
	
	
}
