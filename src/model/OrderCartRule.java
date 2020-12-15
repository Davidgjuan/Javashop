package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order_cart_rule")
public class OrderCartRule implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String id_order;
	 private String id_cart_rule;
	 private String id_order_invoice;
	 private String name;
	 private float value;
	 private float value_tax_excl;
	 private byte free_shipping;
	 private byte deleted;
	 
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

	public String getId_order() {
		return id_order;
	}

	public void setId_order(String id_order) {
		this.id_order = id_order;
	}

	public String getId_cart_rule() {
		return id_cart_rule;
	}

	public void setId_cart_rule(String id_cart_rule) {
		this.id_cart_rule = id_cart_rule;
	}

	public String getId_order_invoice() {
		return id_order_invoice;
	}

	public void setId_order_invoice(String id_order_invoice) {
		this.id_order_invoice = id_order_invoice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public float getValue_tax_excl() {
		return value_tax_excl;
	}

	public void setValue_tax_excl(float value_tax_excl) {
		this.value_tax_excl = value_tax_excl;
	}

	public byte getFree_shipping() {
		return free_shipping;
	}

	public void setFree_shipping(byte free_shipping) {
		this.free_shipping = free_shipping;
	}

	public byte getDeleted() {
		return deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "OrderCartRule [href=" + href + ", id=" + id + ", id_order=" + id_order + ", id_cart_rule="
				+ id_cart_rule + ", id_order_invoice=" + id_order_invoice + ", name=" + name + ", value=" + value
				+ ", value_tax_excl=" + value_tax_excl + ", free_shipping=" + free_shipping + ", deleted=" + deleted
				+ "]";
	}

}
