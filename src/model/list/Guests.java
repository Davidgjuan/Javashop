package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;
import model.Currency;
import model.Group;
import model.Guest;

@JacksonXmlRootElement(localName = "guests")
public class Guests {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Guest> guest;

	public List<Guest> getGuest() {
		return guest;
	}

	public void setGuest(List<Guest> guest) {
		this.guest = guest;
	}

	@Override
	public String toString() {
		return "Guests [guest=" + guest + "]";
	}

}
