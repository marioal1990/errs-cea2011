package es.cea;

public class ServicioCalculadora {
	
	public int suma(String sumando1, String sumando2) {
		
		if(sumando1==null || sumando2 == null)return 0;
		return Integer.parseInt(sumando1)+Integer.parseInt(sumando2);
	}
}
