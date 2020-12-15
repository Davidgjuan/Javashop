package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "product_option_value")
public class ProductOptionValue implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private String id_attribute_group;
	private int color;
	private String position;
	@XmlElementWrapper
	private List<Language> name;
	
	private static final long serialVersionUID = 3916167748882494558L;

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

	public String getId_attribute_group() {
		return id_attribute_group;
	}

	public void setId_attribute_group(String id_attribute_group) {
		this.id_attribute_group = id_attribute_group;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductOptionValue [href=" + href + ", id=" + id + ", id_attribute_group=" + id_attribute_group
				+ ", color=" + color + ", position=" + position + ", name=" + name + "]";
	}

	
}
