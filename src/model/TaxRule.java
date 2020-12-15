package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "tax_rule")
public class TaxRule implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	 
	 private Long id;
	 private String id_tax_rules_group;
	 private Long id_state;
	 private String id_country;
	 private String zipcode_from;
	 private String zipcode_to;
	 private Long id_tax;
	 private Integer behavior;
	 private String description;
	
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public TaxRule() {
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

	public String getId_tax_rules_group() {
		return id_tax_rules_group;
	}

	public void setId_tax_rules_group(String id_tax_rules_group) {
		this.id_tax_rules_group = id_tax_rules_group;
	}

	public Long getId_state() {
		return id_state;
	}

	public void setId_state(Long id_state) {
		this.id_state = id_state;
	}

	public String getId_country() {
		return id_country;
	}

	public void setId_country(String id_country) {
		this.id_country = id_country;
	}

	public String getZipcode_from() {
		return zipcode_from;
	}

	public void setZipcode_from(String zipcode_from) {
		this.zipcode_from = zipcode_from;
	}

	public String getZipcode_to() {
		return zipcode_to;
	}

	public void setZipcode_to(String zipcode_to) {
		this.zipcode_to = zipcode_to;
	}

	public Long getId_tax() {
		return id_tax;
	}

	public void setId_tax(Long id_tax) {
		this.id_tax = id_tax;
	}

	public Integer getBehavior() {
		return behavior;
	}

	public void setBehavior(Integer behavior) {
		this.behavior = behavior;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TaxRule [href=" + href + ", id=" + id + ", id_tax_rules_group=" + id_tax_rules_group + ", id_state="
				+ id_state + ", id_country=" + id_country + ", zipcode_from=" + zipcode_from + ", zipcode_to="
				+ zipcode_to + ", id_tax=" + id_tax + ", behavior=" + behavior + ", description=" + description + "]";
	}

}
