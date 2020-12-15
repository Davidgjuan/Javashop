package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "language")
public class Language {

	@JacksonXmlProperty(isAttribute = true,namespace ="id", localName = "id")
	private long id;
	
	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	@JacksonXmlText
	private String text;
	
	public Language() {
		super();
	}

	public Language(long id, String href, String text) {
		super();
		this.id = id;
		this.href = href;
		this.text = text;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", href=" + href + ", text=" + text + "]";
	}
	
	
	
	
	
}
