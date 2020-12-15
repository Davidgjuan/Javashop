package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Carrier;

@JacksonXmlRootElement(localName = "carriers")
public class Carriers {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Carrier> carrier;

	public List<Carrier> getCarrier() {
		return carrier;
	}

	public void setCarrier(List<Carrier> address) {
		this.carrier = address;
	}

	@Override
	public String toString() {
		return "Carriers [carrier=" + carrier + "]";
	}

}
