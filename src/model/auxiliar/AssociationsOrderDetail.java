package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsOrderDetail {

	
	@JacksonXmlElementWrapper(namespace ="taxes", localName = "taxes")
	private List<Tax> tax;

	public AssociationsOrderDetail() {
		super();
	}

	public List<Tax> getTax() {
		return tax;
	}

	public void setTax(List<Tax> tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "AssociationsManufacturer [tax=" + tax + "]";
	}

}
