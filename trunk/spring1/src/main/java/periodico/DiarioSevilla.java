package periodico;

import java.util.ArrayList;
import java.util.List;

public class DiarioSevilla {

	
	List<String> noticias;
	
	public DiarioSevilla(){
		
		noticias = new ArrayList<String>();
		
		noticias.add("uno");
		noticias.add("dos");
		noticias.add("tres");
		
	}
	
	public List<String> getNoticias() {
		return noticias;
	}
	public void setNoticias(List<String> noticias) {
		this.noticias = noticias;
	}
	
}
