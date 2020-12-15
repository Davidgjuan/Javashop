package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Manufacturer;

@JacksonXmlRootElement(localName = "manufacturers")
public class Manufacturers {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Manufacturer> manufacturer;

	public List<Manufacturer> getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(List<Manufacturer> manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Manufacturers [manufacturer=" + manufacturer + "]";
	}

}
