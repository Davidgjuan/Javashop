package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "contact")
public class Contact implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	
	private Long id;
	private String email;
	private String customer_service;
	@JacksonXmlElementWrapper
	private List<Language>name;
	@JacksonXmlElementWrapper
	private List<Language>description;
	private static final long serialVersionUID = -3324162434578551375L;
	
	public Contact() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomer_service() {
		return customer_service;
	}
	public void setCustomer_service(String customer_service) {
		this.customer_service = customer_service;
	}
	public List<Language> getName() {
		return name;
	}
	public void setName(List<Language> name) {
		this.name = name;
	}
	public List<Language> getDescription() {
		return description;
	}
	public void setDescription(List<Language> description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Contact [href=" + href + ", id=" + id + ", email=" + email + ", customer_service=" + customer_service
				+ ", name=" + name + ", description=" + description + "]";
	}

}
