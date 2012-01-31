package periodico;

import java.util.ArrayList;
import java.util.List;

public class EuroNews {
	
	List<String> noticias;
	
	public EuroNews(){
		
		noticias = new ArrayList<String>();
		
		noticias.add("one");
		noticias.add("two");
		noticias.add("three");
		
	}
	
	public List<String> getNoticias() {
		return noticias;
	}
	public void setNoticias(List<String> noticias) {
		this.noticias = noticias;
	}
	
	
	
}
