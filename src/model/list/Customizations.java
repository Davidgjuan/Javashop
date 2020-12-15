package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Customization;

@JacksonXmlRootElement(localName = "customizations")
public class Customizations {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Customization> customization;

	public List<Customization> getCustomization() {
		return customization;
	}

	public void setCustomization(List<Customization> customization) {
		this.customization = customization;
	}

	@Override
	public String toString() {
		return "Customizations [customization=" + customization + "]";
	}

	

}
