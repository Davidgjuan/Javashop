package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.AssociationsCustomerThreads;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "customer_message")
public class CustomerThread implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private Long id_lang;
	 private Long id_shop;
	 private Long id_customer;
	 private Long id_order;
	 private Long id_product;
	 private Long id_contact;
	 private String email;
	 private String token;
	 private String status;
	 private String date_add;
	 private String date_upd;
	 private AssociationsCustomerThreads associations;
	

	private static final long serialVersionUID = 7299349908202209532L;
	
	public CustomerThread() {
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

	public Long getId_lang() {
		return id_lang;
	}

	public void setId_lang(Long id_lang) {
		this.id_lang = id_lang;
	}

	public Long getId_shop() {
		return id_shop;
	}

	public void setId_shop(Long id_shop) {
		this.id_shop = id_shop;
	}

	public Long getId_customer() {
		return id_customer;
	}

	public void setId_customer(Long id_customer) {
		this.id_customer = id_customer;
	}

	public Long getId_order() {
		return id_order;
	}

	public void setId_order(Long id_order) {
		this.id_order = id_order;
	}

	public Long getId_product() {
		return id_product;
	}

	public void setId_product(Long id_product) {
		this.id_product = id_product;
	}

	public Long getId_contact() {
		return id_contact;
	}

	public void setId_contact(Long id_contact) {
		this.id_contact = id_contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public AssociationsCustomerThreads getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsCustomerThreads associations) {
		this.associations = associations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CustomerThread [href=" + href + ", id=" + id + ", id_lang=" + id_lang + ", id_shop=" + id_shop
				+ ", id_customer=" + id_customer + ", id_order=" + id_order + ", id_product=" + id_product
				+ ", id_contact=" + id_contact + ", email=" + email + ", token=" + token + ", status=" + status
				+ ", date_add=" + date_add + ", date_upd=" + date_upd + ", associations=" + associations + "]";
	}

	

}
