package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "group")
public class Group {

	@JacksonXmlProperty(isAttribute = true,namespace ="id", localName = "id")
	private long id;
	
	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	@JacksonXmlText
	private String text;
	
	public Group() {
		super();
	}

	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Language [text=" + text + "]";
	}
	
	
	
	
	
}
