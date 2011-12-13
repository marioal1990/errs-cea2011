
public class ServicioMatricula {
	
	ServicioSecretaria servicioSecretaria;
	CupoAsignatura cupoAsignatura;
	
	public boolean matriculaAsignatura(String nombre) {
		Asignatura asignatura = servicioSecretaria.compruebaExiste(nombre);
		boolean resultadoCupoAsignatura = cupoAsignatura.compruebaAsignatura(asignatura);
		return  resultadoCupoAsignatura;
	}
}
