package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.AssociationsOrderSlip;
import model.auxiliar.AssociationsProductOption;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "product_option")
public class ProductOption implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private byte is_color_group;
	private String group_type;
	private int position;
	@XmlElementWrapper
	private List<Language> name;
	@XmlElementWrapper
	private List<Language> public_name;
	private AssociationsProductOption associations;
	
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getIs_color_group() {
		return is_color_group;
	}

	public void setIs_color_group(byte is_color_group) {
		this.is_color_group = is_color_group;
	}

	public String getGroup_type() {
		return group_type;
	}

	public void setGroup_type(String group_type) {
		this.group_type = group_type;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	public List<Language> getPublic_name() {
		return public_name;
	}

	public void setPublic_name(List<Language> public_name) {
		this.public_name = public_name;
	}

	public AssociationsProductOption getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsProductOption associations) {
		this.associations = associations;
	}

	@Override
	public String toString() {
		return "ProductOption [href=" + href + ", id=" + id + ", is_color_group=" + is_color_group + ", group_type="
				+ group_type + ", position=" + position + ", name=" + name + ", public_name=" + public_name
				+ ", associations=" + associations + "]";
	}
	
}
