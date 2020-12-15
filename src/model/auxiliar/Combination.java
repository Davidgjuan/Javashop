package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "combination")
public class Combination {


	private long id;

	
	public Combination() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Image [id=" + id + "]";
	}


	
	
}
