package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.AssociationsOrderSlip;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "customization_field")
public class CustomizationField implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_product;
	private Long type;
	private byte required;
	private byte is_module;
	private byte is_deleted;
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

	public Long getId_product() {
		return id_product;
	}

	public void setId_product(Long id_product) {
		this.id_product = id_product;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public byte getRequired() {
		return required;
	}

	public void setRequired(byte required) {
		this.required = required;
	}

	public byte getIs_module() {
		return is_module;
	}

	public void setIs_module(byte is_module) {
		this.is_module = is_module;
	}

	public byte getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(byte is_deleted) {
		this.is_deleted = is_deleted;
	}

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomizationField [href=" + href + ", id=" + id + ", id_product=" + id_product + ", type=" + type
				+ ", required=" + required + ", is_module=" + is_module + ", is_deleted=" + is_deleted + ", name="
				+ name + "]";
	}

	
}
