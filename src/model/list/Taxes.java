package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Tax;

@JacksonXmlRootElement(localName = "taxes")
public class Taxes {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Tax> tax;

	public List<Tax> getTax() {
		return tax;
	}

	public void setTax(List<Tax> tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Taxs [tax=" + tax + "]";
	}

	
	
}	
