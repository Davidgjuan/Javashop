package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Configuration;

@JacksonXmlRootElement(localName = "configurations")
public class Configurations {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Configuration> configuration;

	public List<Configuration> getConfiguration() {
		return configuration;
	}

	public void setConfiguration(List<Configuration> configuration) {
		this.configuration = configuration;
	}

	@Override
	public String toString() {
		return "Configurations [configuration=" + configuration + "]";
	}

	

}
