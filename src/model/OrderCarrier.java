package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order_carrier")
public class OrderCarrier implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private String id_order;
	private String id_carrier;
	private String id_order_invoice;
	private float weight;
	private float shipping_cost_tax_excl;
	private float shipping_cost_tax_incl;
	private int tracking_number;
	private String date_add;
	 
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

	public String getId_carrier() {
		return id_carrier;
	}

	public void setId_carrier(String id_carrier) {
		this.id_carrier = id_carrier;
	}

	public String getId_order_invoice() {
		return id_order_invoice;
	}

	public void setId_order_invoice(String id_order_invoice) {
		this.id_order_invoice = id_order_invoice;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getShipping_cost_tax_excl() {
		return shipping_cost_tax_excl;
	}

	public void setShipping_cost_tax_excl(float shipping_cost_tax_excl) {
		this.shipping_cost_tax_excl = shipping_cost_tax_excl;
	}

	public float getShipping_cost_tax_incl() {
		return shipping_cost_tax_incl;
	}

	public void setShipping_cost_tax_incl(float shipping_cost_tax_incl) {
		this.shipping_cost_tax_incl = shipping_cost_tax_incl;
	}

	public int getTracking_number() {
		return tracking_number;
	}

	public void setTracking_number(int tracking_number) {
		this.tracking_number = tracking_number;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	@Override
	public String toString() {
		return "OrderCarrier [href=" + href + ", id=" + id + ", id_order=" + id_order + ", id_carrier=" + id_carrier
				+ ", id_order_invoice=" + id_order_invoice + ", weight=" + weight + ", shipping_cost_tax_excl="
				+ shipping_cost_tax_excl + ", shipping_cost_tax_incl=" + shipping_cost_tax_incl + ", tracking_number="
				+ tracking_number + ", date_add=" + date_add + "]";
	}

}
