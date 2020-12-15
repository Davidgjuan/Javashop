package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Address;

@JacksonXmlRootElement(localName = "addresses")
public class Addresses {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Address> address;

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Addresses [address=" + address + "]";
	}

}
