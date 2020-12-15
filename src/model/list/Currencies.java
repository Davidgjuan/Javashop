package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;
import model.Currency;

@JacksonXmlRootElement(localName = "currencies")
public class Currencies {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Currency> currency;

	public List<Currency> getCurrency() {
		return currency;
	}

	public void setCurrency(List<Currency> currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Currencies [currency=" + currency + "]";
	}

	

}
