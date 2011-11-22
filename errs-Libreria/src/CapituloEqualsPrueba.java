import org.testng.annotations.Test;


public class CapituloEqualsPrueba {

	//Comprobar que dos autores son iguales si tiene el mismo nombre
	@Test
	
	public void pruebaAutoresIguales(){

		//escenario de la prueba
		Autor autor = new Autor();
		autor.nombre ="Antonio Machado";
		
		Autor autor2 = new Autor();
		autor2.nombre ="Antonio Machado";
		
		Autor autor3 = new Autor();
		autor3.nombre ="Cervantes";
		
		//Comprueba que son iguales
		boolean sonIguales = autor.equals(autor2);
		assert(sonIguales);
		
		//Comprueba que son iguales y niega el assert para que no de error
		boolean nosonIguales = autor.equals(autor3);
		assert(!nosonIguales);
	}
	
	@Test
	
	public void pruebaCapitulosIguales(){
		
		//escenario de la prueba
		Capitulo capitulo = new Capitulo();
		capitulo.nombre = "Primero";
		
		Capitulo capitulo2 = new Capitulo();
		capitulo2.nombre = "Segundo";
		
		Capitulo capitulo3 = new Capitulo();
		capitulo3.nombre = "Primero";
			
		Libro libro = new Libro();
		Libro libro2 = new Libro();
		
		//asociar los objetos
		capitulo.libro = libro;
		capitulo2.libro = libro2;
		capitulo3.libro = libro;
		
		//Invocación del programa
		boolean noSonIguales = capitulo.equals(capitulo2);
		
		//aserción de resultado
		
		assert(!noSonIguales);
		boolean sonIguales = capitulo.equals(capitulo3);
		assert(sonIguales);
	}
		
	
@Test
public void pruebaEqualsLibro(){
        
	//escenario de la prueba
		Editorial editorial1=new Editorial();
        Editorial editorial2=new Editorial();
        
        Autor autor1=new Autor();
        Autor autor2=new Autor();
        
        Libro libro1=new Libro();
        libro1.nombre="libro1";
        libro1.autores.add(autor1);
        libro1.editorial=editorial1;

        Libro libro2=new Libro();
        libro2.nombre="libro2";
        libro2.autores.add(autor2);
        libro2.editorial=editorial2;

        Libro libro1Bis=new Libro();
        libro1Bis.nombre="libro1";
        libro1Bis.autores.add(autor1);
        libro1Bis.editorial=editorial1;
        //Invocacion
        boolean sonIgualesLibro1Libro2=libro1.equals(libro2);
        //asercion
        assert(!sonIgualesLibro1Libro2):"deberian ser diferentes ";
        
        //Invocacion
        boolean sonIgualesLibro1Libro1Bis=libro1.equals(libro1Bis);
        assert(sonIgualesLibro1Libro1Bis):"deberian ser iguales ";
	}
}
