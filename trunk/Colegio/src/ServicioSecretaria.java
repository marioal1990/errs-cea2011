import java.util.ArrayList;

public class ServicioSecretaria {
	ArrayList<Asignatura> listaAsignatura = new ArrayList<Asignatura>();

	public Asignatura compruebaExiste(String nombreBuscado) {

		for (Asignatura asignatura : listaAsignatura) {
			if (asignatura.nombre.equalsIgnoreCase(nombreBuscado))
				return asignatura;
		}

		throw new RuntimeException();
	}
}
