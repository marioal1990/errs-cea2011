package periodico;

import java.util.List;

public class PeriodicoNacional {

	DiarioSevilla diarioSevilla;

	public void setDiarioSevilla(DiarioSevilla diarioSevilla) {
		this.diarioSevilla = diarioSevilla;
	}
	
	public List<String> dameNoticias(){
		return diarioSevilla.getNoticias();
	}
}
