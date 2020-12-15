package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "message")
public class Message implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private String id_cart;
	 private String id_order;
	 private String id_customer;
	 private Long id_employee;
	 private String message;
	 @JacksonXmlProperty(namespace = "private", localName = "privateProp")
	 private String privateProp;
	 private String date_add;
	
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

	public String getId_cart() {
		return id_cart;
	}

	public void setId_cart(String id_cart) {
		this.id_cart = id_cart;
	}

	public String getId_order() {
		return id_order;
	}

	public void setId_order(String id_order) {
		this.id_order = id_order;
	}

	public String getId_customer() {
		return id_customer;
	}

	public void setId_customer(String id_customer) {
		this.id_customer = id_customer;
	}

	public Long getId_employee() {
		return id_employee;
	}

	public void setId_employee(Long id_employee) {
		this.id_employee = id_employee;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPrivate() {
		return privateProp;
	}

	public void setPrivate(String privateProp) {
		this.privateProp = privateProp;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	@Override
	public String toString() {
		return "Message [href=" + href + ", id=" + id + ", id_cart=" + id_cart + ", id_order=" + id_order
				+ ", id_customer=" + id_customer + ", id_employee=" + id_employee + ", message=" + message
				+ ", privateProp=" + privateProp + ", date_add=" + date_add + "]";
	}

}
