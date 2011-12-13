import java.util.*;


public class CupoAsignatura {
	Map <Asignatura, Integer> matriculas = new HashMap<Asignatura, Integer>();

	public boolean compruebaAsignatura(Asignatura asignaturap) {
		int cantidad=1;
		Integer integer = matriculas.get(asignaturap);
		return integer.intValue() >=  cantidad;
	}
}
