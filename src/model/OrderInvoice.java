package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order_invoice")
public class OrderInvoice implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_order;
	private Long number;
	private String delivery_number;
	private String delivery_date;
	private float total_discount_tax_excl;
	private float total_discount_tax_incl;
	private float total_paid_tax_excl;
	private float total_paid_tax_incl;
	private float total_products;
	private float total_products_wt;
	private float total_shipping_tax_excl;
	private float total_shipping_tax_incl;
	private String shipping_tax_computation_method;
	private String total_wrapping_tax_excl;
	private String total_wrapping_tax_incl;
	private String shop_address;
	private String note;
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

	public Long getId_order() {
		return id_order;
	}

	public void setId_order(Long id_order) {
		this.id_order = id_order;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getDelivery_number() {
		return delivery_number;
	}

	public void setDelivery_number(String delivery_number) {
		this.delivery_number = delivery_number;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public float getTotal_discount_tax_excl() {
		return total_discount_tax_excl;
	}

	public void setTotal_discount_tax_excl(float total_discount_tax_excl) {
		this.total_discount_tax_excl = total_discount_tax_excl;
	}

	public float getTotal_discount_tax_incl() {
		return total_discount_tax_incl;
	}

	public void setTotal_discount_tax_incl(float total_discount_tax_incl) {
		this.total_discount_tax_incl = total_discount_tax_incl;
	}

	public float getTotal_paid_tax_excl() {
		return total_paid_tax_excl;
	}

	public void setTotal_paid_tax_excl(float total_paid_tax_excl) {
		this.total_paid_tax_excl = total_paid_tax_excl;
	}

	public float getTotal_paid_tax_incl() {
		return total_paid_tax_incl;
	}

	public void setTotal_paid_tax_incl(float total_paid_tax_incl) {
		this.total_paid_tax_incl = total_paid_tax_incl;
	}

	public float getTotal_products() {
		return total_products;
	}

	public void setTotal_products(float total_products) {
		this.total_products = total_products;
	}

	public float getTotal_products_wt() {
		return total_products_wt;
	}

	public void setTotal_products_wt(float total_products_wt) {
		this.total_products_wt = total_products_wt;
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

	public String getShipping_tax_computation_method() {
		return shipping_tax_computation_method;
	}

	public void setShipping_tax_computation_method(String shipping_tax_computation_method) {
		this.shipping_tax_computation_method = shipping_tax_computation_method;
	}

	public String getTotal_wrapping_tax_excl() {
		return total_wrapping_tax_excl;
	}

	public void setTotal_wrapping_tax_excl(String total_wrapping_tax_excl) {
		this.total_wrapping_tax_excl = total_wrapping_tax_excl;
	}

	public String getTotal_wrapping_tax_incl() {
		return total_wrapping_tax_incl;
	}

	public void setTotal_wrapping_tax_incl(String total_wrapping_tax_incl) {
		this.total_wrapping_tax_incl = total_wrapping_tax_incl;
	}

	public String getShop_address() {
		return shop_address;
	}

	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	@Override
	public String toString() {
		return "OrderInvoice [href=" + href + ", id=" + id + ", id_order=" + id_order + ", number=" + number
				+ ", delivery_number=" + delivery_number + ", delivery_date=" + delivery_date
				+ ", total_discount_tax_excl=" + total_discount_tax_excl + ", total_discount_tax_incl="
				+ total_discount_tax_incl + ", total_paid_tax_excl=" + total_paid_tax_excl + ", total_paid_tax_incl="
				+ total_paid_tax_incl + ", total_products=" + total_products + ", total_products_wt="
				+ total_products_wt + ", total_shipping_tax_excl=" + total_shipping_tax_excl
				+ ", total_shipping_tax_incl=" + total_shipping_tax_incl + ", shipping_tax_computation_method="
				+ shipping_tax_computation_method + ", total_wrapping_tax_excl=" + total_wrapping_tax_excl
				+ ", total_wrapping_tax_incl=" + total_wrapping_tax_incl + ", shop_address=" + shop_address + ", note="
				+ note + ", date_add=" + date_add + "]";
	}
	
}
