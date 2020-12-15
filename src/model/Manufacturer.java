package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "manufacturer")
public class Manufacturer implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private String active;
	private String name;
	private String date_add;
	private String date_upd;
	@XmlElementWrapper
	private List<Language> description;
	@XmlElementWrapper
	private List<Language> short_description;
	@XmlElementWrapper
	private List<Language> meta_title;
	@XmlElementWrapper
	private List<Language> meta_description;
	@XmlElementWrapper
	private List<Language> meta_keywords;
	
	private AssociationsManufacturer associations;
	
	private static final long serialVersionUID = 3916167748882494558L;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate_add() {
		return date_add;
	}
	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}
	public String getDate_upd() {
		return date_upd;
	}
	public void setDate_upd(String date_upd) {
		this.date_upd = date_upd;
	}
	public List<Language> getDescription() {
		return description;
	}
	public void setDescription(List<Language> description) {
		this.description = description;
	}
	public List<Language> getShort_description() {
		return short_description;
	}
	public void setShort_description(List<Language> short_description) {
		this.short_description = short_description;
	}
	public List<Language> getMeta_title() {
		return meta_title;
	}
	public void setMeta_title(List<Language> meta_title) {
		this.meta_title = meta_title;
	}
	public List<Language> getMeta_description() {
		return meta_description;
	}
	public void setMeta_description(List<Language> meta_description) {
		this.meta_description = meta_description;
	}
	public List<Language> getMeta_keywords() {
		return meta_keywords;
	}
	public void setMeta_keywords(List<Language> meta_keywords) {
		this.meta_keywords = meta_keywords;
	}
	public AssociationsManufacturer getAssociations() {
		return associations;
	}
	public void setAssociations(AssociationsManufacturer associations) {
		this.associations = associations;
	}
	@Override
	public String toString() {
		return "Manufacturer [href=" + href + ", id=" + id + ", active=" + active + ", name=" + name + ", date_add="
				+ date_add + ", date_upd=" + date_upd + ", description=" + description + ", short_description="
				+ short_description + ", meta_title=" + meta_title + ", meta_description=" + meta_description
				+ ", meta_keywords=" + meta_keywords + ", associations=" + associations + "]";
	}

}
