package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsManufacturer {

	
	@JacksonXmlElementWrapper(namespace ="addresses", localName = "addresses")
	private List<Address> address;

	public AssociationsManufacturer() {
		super();
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AssociationsManufacturer [address=" + address + "]";
	}

}
