package periodico;

import java.util.List;

public class PeriodicoInternacional {

	EuroNews euroNews;

	public EuroNews getEuroNews() {
		return euroNews;
	}

	public void setEuroNews(EuroNews euroNews) {
		this.euroNews = euroNews;
	}
	
	public List<String> dameNoticias(){
		return euroNews.getNoticias();
	}
}
