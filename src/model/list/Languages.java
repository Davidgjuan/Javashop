package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;
import model.Currency;
import model.Group;
import model.ImageType;
import model.Language;

@JacksonXmlRootElement(localName = "languages")
public class Languages {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Language> language;

	public List<Language> getLanguage() {
		return language;
	}

	public void setLanguage(List<Language> language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Languages [language=" + language + "]";
	}

		

}
