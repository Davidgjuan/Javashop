package model;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;

@JacksonXmlRootElement(localName = "cart")
public class Cart implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private String id_address_delivery;
	private String id_address_invoice;
	private String id_currency;
	private String id_customer;
	private Long id_guest;
	private String id_lang;
	private Long id_shop_group;
	private Long id_shop;
	private Long id_carrier;
	private byte recyclable;
	private byte gift;
	private String gift_message;
	private byte mobile_theme;
	private String delivery_option;
	private String secure_key;
	private byte allow_seperated_package;
	private String date_add;
	private String date_upd;
	private AssociationsCart associations;

	private static final long serialVersionUID = 7299349908202209532L;
	
	public Cart() {
		super();
	}

	public Cart(String href, Long id, String id_address_delivery, String id_address_invoice, String id_currency,
			String id_customer, Long id_guest, String id_lang, Long id_shop_group, Long id_shop, Long id_carrier,
			byte recyclable, byte gift, String gift_message, byte mobile_theme,String delivery_option,  String secure_key,
			byte allow_seperated_package, String date_add, String date_upd, AssociationsCart associations) {
		super();
		this.href = href;
		this.id = id;
		this.id_address_delivery = id_address_delivery;
		this.id_address_invoice = id_address_invoice;
		this.id_currency = id_currency;
		this.id_customer = id_customer;
		this.id_guest = id_guest;
		this.id_lang = id_lang;
		this.id_shop_group = id_shop_group;
		this.id_shop = id_shop;
		this.id_carrier = id_carrier;
		this.recyclable = recyclable;
		this.gift = gift;
		this.gift_message = gift_message;
		this.mobile_theme = mobile_theme;
		this.delivery_option = delivery_option;
		this.secure_key = secure_key;
		this.allow_seperated_package = allow_seperated_package;
		this.date_add = date_add;
		this.date_upd = date_upd;
		this.associations = associations;
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
	public String getId_currency() {
		return id_currency;
	}
	public void setId_currency(String id_currency) {
		this.id_currency = id_currency;
	}
	public String getId_customer() {
		return id_customer;
	}
	public void setId_customer(String id_customer) {
		this.id_customer = id_customer;
	}
	public Long getId_guest() {
		return id_guest;
	}
	public void setId_guest(Long id_guest) {
		this.id_guest = id_guest;
	}
	public String getId_lang() {
		return id_lang;
	}
	public void setId_lang(String id_lang) {
		this.id_lang = id_lang;
	}
	public Long getId_shop_group() {
		return id_shop_group;
	}
	public void setId_shop_group(Long id_shop_group) {
		this.id_shop_group = id_shop_group;
	}
	public Long getId_shop() {
		return id_shop;
	}
	public void setId_shop(Long id_shop) {
		this.id_shop = id_shop;
	}
	public Long getId_carrier() {
		return id_carrier;
	}
	public void setId_carrier(Long id_carrier) {
		this.id_carrier = id_carrier;
	}
	public byte getRecyclable() {
		return recyclable;
	}
	public void setRecyclable(byte recyclable) {
		this.recyclable = recyclable;
	}
	public byte getGift() {
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
	public byte getMobile_theme() {
		return mobile_theme;
	}
	public void setMobile_theme(byte mobile_theme) {
		this.mobile_theme = mobile_theme;
	}
	public String getDelivery_option() {
		return delivery_option;
	}
	public void setDelivery_option(String delivery_option) {
		this.delivery_option = delivery_option;
	}
	public String getSecure_key() {
		return secure_key;
	}
	public void setSecure_key(String secure_key) {
		this.secure_key = secure_key;
	}
	public byte getAllow_seperated_package() {
		return allow_seperated_package;
	}
	public void setAllow_seperated_package(byte allow_seperated_package) {
		this.allow_seperated_package = allow_seperated_package;
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
	public void setDate_upd(String dat_upd) {
		this.date_upd = dat_upd;
	}
	public AssociationsCart getAssociations() {
		return associations;
	}
	public void setAssociations(AssociationsCart associations) {
		this.associations = associations;
	}
	@Override
	public String toString() {
		return "Carts [href=" + href + ", id=" + id + ", id_address_delivery=" + id_address_delivery
				+ ", id_address_invoice=" + id_address_invoice + ", id_currency=" + id_currency + ", id_customer="
				+ id_customer + ", id_guest=" + id_guest + ", id_lang=" + id_lang + ", id_shop_group=" + id_shop_group
				+ ", id_shop=" + id_shop + ", id_carrier=" + id_carrier + ", recyclable=" + recyclable + ", gift="
				+ gift + ", gift_message=" + gift_message + ", mobile_theme=" + mobile_theme + ", secure_key="
				+ secure_key + ", allow_seperated_package=" + allow_seperated_package + ", date_add=" + date_add
				+ ", dat_upd=" + date_upd + ", associations=" + associations + "]";
	}

}
