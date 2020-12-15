package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;

@JacksonXmlRootElement(localName = "countries")
public class Countries {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Country> country;

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Countries [country=" + country + "]";
	}

	

}
