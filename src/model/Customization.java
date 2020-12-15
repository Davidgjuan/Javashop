package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.AssociationsCustomer;
import model.auxiliar.AssociationsCustomization;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "customer")
public class Customization implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private Long id_address_delivery;
	 private Long id_cart;
	 private Long id_product;
	 private Long id_product_attribute;
	 private Long quantity;
	 private Long quantity_refunded;
	 private Long quantity_returned;
	 private boolean in_cart;
	 private AssociationsCustomization association;

	private static final long serialVersionUID = 7299349908202209532L;
	
	public Customization() {
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

	public Long getId_address_delivery() {
		return id_address_delivery;
	}

	public void setId_address_delivery(Long id_address_delivery) {
		this.id_address_delivery = id_address_delivery;
	}

	public Long getId_cart() {
		return id_cart;
	}

	public void setId_cart(Long id_cart) {
		this.id_cart = id_cart;
	}

	public Long getId_product() {
		return id_product;
	}

	public void setId_product(Long id_product) {
		this.id_product = id_product;
	}

	public Long getId_product_attribute() {
		return id_product_attribute;
	}

	public void setId_product_attribute(Long id_product_attribute) {
		this.id_product_attribute = id_product_attribute;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity_refunded() {
		return quantity_refunded;
	}

	public void setQuantity_refunded(Long quantity_refunded) {
		this.quantity_refunded = quantity_refunded;
	}

	public Long getQuantity_returned() {
		return quantity_returned;
	}

	public void setQuantity_returned(Long quantity_returned) {
		this.quantity_returned = quantity_returned;
	}

	public boolean isIn_cart() {
		return in_cart;
	}

	public void setIn_cart(boolean in_cart) {
		this.in_cart = in_cart;
	}

	public AssociationsCustomization getAssociation() {
		return association;
	}

	public void setAssociation(AssociationsCustomization association) {
		this.association = association;
	}

	@Override
	public String toString() {
		return "Customization [href=" + href + ", id=" + id + ", id_address_delivery=" + id_address_delivery
				+ ", id_cart=" + id_cart + ", id_product=" + id_product + ", id_product_attribute="
				+ id_product_attribute + ", quantity=" + quantity + ", quantity_refunded=" + quantity_refunded
				+ ", quantity_returned=" + quantity_returned + ", in_cart=" + in_cart + ", association=" + association
				+ "]";
	}
	
}
