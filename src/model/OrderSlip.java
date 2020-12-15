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

@JacksonXmlRootElement(localName = "order_slip")
public class OrderSlip implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_customer;
	private Long id_order;
	private float conversion_rate;
	private float total_products_tax_excl;
	private float total_products_tax_incl;
	private float total_shipping_tax_excl;
	private float total_shipping_tax_incl;
	private float amount;
	private float shipping_cost;
	private float shipping_cost_amount;
	private String partial;
	private String date_add;
	private String date_upd;
	private int order_slip_type;
	private AssociationsOrderSlip associations;
	 
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

	public float getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(float conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	public float getTotal_products_tax_excl() {
		return total_products_tax_excl;
	}

	public void setTotal_products_tax_excl(float total_products_tax_excl) {
		this.total_products_tax_excl = total_products_tax_excl;
	}

	public float getTotal_products_tax_incl() {
		return total_products_tax_incl;
	}

	public void setTotal_products_tax_incl(float total_products_tax_incl) {
		this.total_products_tax_incl = total_products_tax_incl;
	}

	public float getTotal_shipping_tax_excl() {
		return total_shipping_tax_excl;
	}

	public void setTotal_shipping_tax_excl(float total_shipping_tax_excl) {
		this.total_shipping_tax_excl = total_shipping_tax_excl;
	}

	public float getTotal_shipping_tax_incl() {
		return total_shipping_tax_incl;
	}

	public void setTotal_shipping_tax_incl(float total_shipping_tax_incl) {
		this.total_shipping_tax_incl = total_shipping_tax_incl;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getShipping_cost() {
		return shipping_cost;
	}

	public void setShipping_cost(float shipping_cost) {
		this.shipping_cost = shipping_cost;
	}

	public float getShipping_cost_amount() {
		return shipping_cost_amount;
	}

	public void setShipping_cost_amount(float shipping_cost_amount) {
		this.shipping_cost_amount = shipping_cost_amount;
	}

	public String getPartial() {
		return partial;
	}

	public void setPartial(String partial) {
		this.partial = partial;
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

	public int getOrder_slip_type() {
		return order_slip_type;
	}

	public void setOrder_slip_type(int order_slip_type) {
		this.order_slip_type = order_slip_type;
	}

	public AssociationsOrderSlip getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsOrderSlip associations) {
		this.associations = associations;
	}

	@Override
	public String toString() {
		return "OrderSlip [href=" + href + ", id=" + id + ", id_customer=" + id_customer + ", id_order=" + id_order
				+ ", conversion_rate=" + conversion_rate + ", total_products_tax_excl=" + total_products_tax_excl
				+ ", total_products_tax_incl=" + total_products_tax_incl + ", total_shipping_tax_excl="
				+ total_shipping_tax_excl + ", total_shipping_tax_incl=" + total_shipping_tax_incl + ", amount="
				+ amount + ", shipping_cost=" + shipping_cost + ", shipping_cost_amount=" + shipping_cost_amount
				+ ", partial=" + partial + ", date_add=" + date_add + ", date_upd=" + date_upd + ", order_slip_type="
				+ order_slip_type + ", associations=" + associations + "]";
	}

	
}
