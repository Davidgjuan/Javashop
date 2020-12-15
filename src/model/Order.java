package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrder;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.AssociationsOrderSlip;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order")
public class Order implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private String id_address_delivery;
	private String id_address_invoice;
	private String id_cart;
	private String id_currency;
	private String id_lang;
	private String id_customer;
	private String id_carrier;
	private String current_state;
	private String module;
	private String invoice_number;
	private String invoice_date;
	private String delivery_number;
	private String delivery_date;
	private String valid;
	private String date_add;
	private String date_upd;
	private String shipping_number;
	private String id_shop_group;
	private String id_shop;
	private String secure_key;
	private String payment;
	private byte recyclable;
	private byte gift;
	private String gift_message;
	private byte mobile_theme;
	private float total_discounts;
	private float total_discounts_tax_incl;
	private float total_discounts_tax_excl;
	private float total_paid;
	private float total_paid_tax_incl;
	private float total_paid_tax_excl;
	private float total_paid_real;
	private float total_products;
	private float total_products_wt;
	private float total_shipping;
	private float total_shipping_tax_incl;
	private float total_shipping_tax_excl;
	private float carrier_tax_rate;
	private float total_wrapping;
	private float total_wrapping_tax_incl;
	private float total_wrapping_tax_excl;
	private Long round_mode;
	private Long round_type;
	private float conversion_rate;
	private String reference;
	private String unremovable;
	private AssociationsOrder associations;
	 
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

	public String getId_address_delivery() {
		return id_address_delivery;
	}

	public void setId_address_delivery(String id_address_delivery) {
		this.id_address_delivery = id_address_delivery;
	}

	public String getId_address_invoice() {
		return id_address_invoice;
	}

	public void setId_address_invoice(String id_address_invoice) {
		this.id_address_invoice = id_address_invoice;
	}

	public String getId_cart() {
		return id_cart;
	}

	public void setId_cart(String id_cart) {
		this.id_cart = id_cart;
	}

	public String getId_currency() {
		return id_currency;
	}

	public void setId_currency(String id_currency) {
		this.id_currency = id_currency;
	}

	public String getId_lang() {
		return id_lang;
	}

	public void setId_lang(String id_lang) {
		this.id_lang = id_lang;
	}

	public String getId_customer() {
		return id_customer;
	}

	public void setId_customer(String id_customer) {
		this.id_customer = id_customer;
	}

	public String getId_carrier() {
		return id_carrier;
	}

	public void setId_carrier(String id_carrier) {
		this.id_carrier = id_carrier;
	}

	public String getCurrent_state() {
		return current_state;
	}

	public void setCurrent_state(String current_state) {
		this.current_state = current_state;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}

	public String getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
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

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
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

	public String getShipping_number() {
		return shipping_number;
	}

	public void setShipping_number(String shipping_number) {
		this.shipping_number = shipping_number;
	}

	public String getId_shop_group() {
		return id_shop_group;
	}

	public void setId_shop_group(String id_shop_group) {
		this.id_shop_group = id_shop_group;
	}

	public String getId_shop() {
		return id_shop;
	}

	public void setId_shop(String id_shop) {
		this.id_shop = id_shop;
	}

	public String getSecure_key() {
		return secure_key;
	}

	public void setSecure_key(String secure_key) {
		this.secure_key = secure_key;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public byte isRecyclable() {
		return recyclable;
	}

	public void setRecyclable(byte recyclable) {
		this.recyclable = recyclable;
	}

	public byte isGift() {
		return gift;
	}

	public void setGift(byte gift) {
		this.gift = gift;
	}

	public String getGift_message() {
		return gift_message;
	}

	public void setGift_message(String gift_message) {
		this.gift_message = gift_message;
	}

	public byte isMobile_theme() {
		return mobile_theme;
	}

	public void setMobile_theme(byte mobile_theme) {
		this.mobile_theme = mobile_theme;
	}

	public float getTotal_discounts() {
		return total_discounts;
	}

	public void setTotal_discounts(float total_discounts) {
		this.total_discounts = total_discounts;
	}

	public float getTotal_discounts_tax_incl() {
		return total_discounts_tax_incl;
	}

	public void setTotal_discounts_tax_incl(float total_discounts_tax_incl) {
		this.total_discounts_tax_incl = total_discounts_tax_incl;
	}

	public float getTotal_discounts_tax_excl() {
		return total_discounts_tax_excl;
	}

	public void setTotal_discounts_tax_excl(float total_discounts_tax_excl) {
		this.total_discounts_tax_excl = total_discounts_tax_excl;
	}

	public float getTotal_paid() {
		return total_paid;
	}

	public void setTotal_paid(float total_paid) {
		this.total_paid = total_paid;
	}

	public float getTotal_paid_tax_incl() {
		return total_paid_tax_incl;
	}

	public void setTotal_paid_tax_incl(float total_paid_tax_incl) {
		this.total_paid_tax_incl = total_paid_tax_incl;
	}

	public float getTotal_paid_tax_excl() {
		return total_paid_tax_excl;
	}

	public void setTotal_paid_tax_excl(float total_paid_tax_excl) {
		this.total_paid_tax_excl = total_paid_tax_excl;
	}

	public float getTotal_paid_real() {
		return total_paid_real;
	}

	public void setTotal_paid_real(float total_paid_real) {
		this.total_paid_real = total_paid_real;
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

	public float getTotal_shipping() {
		return total_shipping;
	}

	public void setTotal_shipping(float total_shipping) {
		this.total_shipping = total_shipping;
	}

	public float getTotal_shipping_tax_incl() {
		return total_shipping_tax_incl;
	}

	public void setTotal_shipping_tax_incl(float total_shipping_tax_incl) {
		this.total_shipping_tax_incl = total_shipping_tax_incl;
	}

	public float getTotal_shipping_tax_excl() {
		return total_shipping_tax_excl;
	}

	public void setTotal_shipping_tax_excl(float total_shipping_tax_excl) {
		this.total_shipping_tax_excl = total_shipping_tax_excl;
	}

	public float getCarrier_tax_rate() {
		return carrier_tax_rate;
	}

	public void setCarrier_tax_rate(float carrier_tax_rate) {
		this.carrier_tax_rate = carrier_tax_rate;
	}

	public float getTotal_wrapping() {
		return total_wrapping;
	}

	public void setTotal_wrapping(float total_wrapping) {
		this.total_wrapping = total_wrapping;
	}

	public float getTotal_wrapping_tax_incl() {
		return total_wrapping_tax_incl;
	}

	public void setTotal_wrapping_tax_incl(float total_wrapping_tax_incl) {
		this.total_wrapping_tax_incl = total_wrapping_tax_incl;
	}

	public float getTotal_wrapping_tax_excl() {
		return total_wrapping_tax_excl;
	}

	public void setTotal_wrapping_tax_excl(float total_wrapping_tax_excl) {
		this.total_wrapping_tax_excl = total_wrapping_tax_excl;
	}

	public Long getRound_mode() {
		return round_mode;
	}

	public void setRound_mode(Long round_mode) {
		this.round_mode = round_mode;
	}

	public Long getRound_type() {
		return round_type;
	}

	public void setRound_type(Long round_type) {
		this.round_type = round_type;
	}

	public float getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(float conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public AssociationsOrder getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsOrder associations) {
		this.associations = associations;
	}

	public String getUnremovable() {
		return unremovable;
	}

	public void setUnremovable(String unremovable) {
		this.unremovable = unremovable;
	}

	@Override
	public String toString() {
		return "Order [href=" + href + ", id=" + id + ", id_address_delivery=" + id_address_delivery
				+ ", id_address_invoice=" + id_address_invoice + ", id_cart=" + id_cart + ", id_currency=" + id_currency
				+ ", id_lang=" + id_lang + ", id_customer=" + id_customer + ", id_carrier=" + id_carrier
				+ ", current_state=" + current_state + ", module=" + module + ", invoice_number=" + invoice_number
				+ ", invoice_date=" + invoice_date + ", delivery_number=" + delivery_number + ", delivery_date="
				+ delivery_date + ", valid=" + valid + ", date_add=" + date_add + ", date_upd=" + date_upd
				+ ", shipping_number=" + shipping_number + ", id_shop_group=" + id_shop_group + ", id_shop=" + id_shop
				+ ", secure_key=" + secure_key + ", payment=" + payment + ", recyclable=" + recyclable + ", gift="
				+ gift + ", gift_message=" + gift_message + ", mobile_theme=" + mobile_theme + ", total_discounts="
				+ total_discounts + ", total_discounts_tax_incl=" + total_discounts_tax_incl
				+ ", total_discounts_tax_excl=" + total_discounts_tax_excl + ", total_paid=" + total_paid
				+ ", total_paid_tax_incl=" + total_paid_tax_incl + ", total_paid_tax_excl=" + total_paid_tax_excl
				+ ", total_paid_real=" + total_paid_real + ", total_products=" + total_products + ", total_products_wt="
				+ total_products_wt + ", total_shipping=" + total_shipping + ", total_shipping_tax_incl="
				+ total_shipping_tax_incl + ", total_shipping_tax_excl=" + total_shipping_tax_excl
				+ ", carrier_tax_rate=" + carrier_tax_rate + ", total_wrapping=" + total_wrapping
				+ ", total_wrapping_tax_incl=" + total_wrapping_tax_incl + ", total_wrapping_tax_excl="
				+ total_wrapping_tax_excl + ", round_mode=" + round_mode + ", round_type=" + round_type
				+ ", conversion_rate=" + conversion_rate + ", reference=" + reference + ", unremovable=" + unremovable
				+ ", associations=" + associations + "]";
	}

	

	
}
