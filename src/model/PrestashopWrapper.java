package model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonRootName(value = "prestashop")
public class PrestashopWrapper implements Serializable{
	
	
	@JacksonXmlProperty
	private Object object;

	private static final long serialVersionUID = -1063765529298356299L;
	
	public PrestashopWrapper(Object object) {
			super();
			this.object = object;
		}
	
	@Override
	public String toString() {
		return "PrestashopWrapper [object=" + object + "]";
	}
	
}
