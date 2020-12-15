package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "supply_order_state")
public class Tag implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private String id_lang;
	 private String name;
	
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public Tag() {
		super();
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_lang() {
		return id_lang;
	}

	public void setId_lang(String id_lang) {
		this.id_lang = id_lang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tag [href=" + href + ", id=" + id + ", id_lang=" + id_lang + ", name=" + name + "]";
	}

	

}
