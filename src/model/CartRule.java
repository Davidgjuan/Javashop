package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "cart_rule")
public class CartRule implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_customer;
	private String date_from; //TODO: formato fecha
	private String date_to;
	private String description;
	private Integer quantity;
	private Integer quantity_per_user;
	private Integer priority;
	private byte partial_use;
	private String code;
	private float minimum_amount;
	private byte minimum_amount_tax;
	private int minimum_amount_currency;
	private byte minimum_amount_shipping;
	private byte country_restriction;
	private byte carrier_restriction;
	private byte group_restriction;
	private byte cart_rule_restriction; 
	private byte product_restriction;
	private byte shop_restriction;
	private byte free_shipping;
	private String reduction_percent;
	private float reduction_amount;
	private byte reduction_tax;
	private Long reduction_currency;
	private int reduction_product;
	private byte reduction_exclude_special;
	private Long gift_product;
	private Long gift_product_attribute;
	private byte highlight;
	private byte active;
	private String date_add;
	private String date_upd;
	@JacksonXmlElementWrapper
	private List<Language> name;
	
	private static final long serialVersionUID = 3916167748882494558L;
	
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
	public String getDate_from() {
		return date_from;
	}
	public void setDate_from(String date_from) {
		this.date_from = date_from;
	}
	public String getDate_to() {
		return date_to;
	}
	public void setDate_to(String date_to) {
		this.date_to = date_to;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getQuantity_per_user() {
		return quantity_per_user;
	}
	public void setQuantity_per_user(Integer quantity_per_user) {
		this.quantity_per_user = quantity_per_user;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public byte getPartial_use() {
		return partial_use;
	}
	public void setPartial_use(byte partial_use) {
		this.partial_use = partial_use;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getMinimum_amount() {
		return minimum_amount;
	}
	public void setMinimum_amount(float minimum_amount) {
		this.minimum_amount = minimum_amount;
	}
	public byte getMinimum_amount_tax() {
		return minimum_amount_tax;
	}
	public void setMinimum_amount_tax(byte minimum_amount_tax) {
		this.minimum_amount_tax = minimum_amount_tax;
	}
	public int getMinimum_amount_currency() {
		return minimum_amount_currency;
	}
	public void setMinimum_amount_currency(int minimum_amount_currency) {
		this.minimum_amount_currency = minimum_amount_currency;
	}
	public byte getMinimum_amount_shipping() {
		return minimum_amount_shipping;
	}
	public void setMinimum_amount_shipping(byte minimum_amount_shipping) {
		this.minimum_amount_shipping = minimum_amount_shipping;
	}
	public byte getCountry_restriction() {
		return country_restriction;
	}
	public void setCountry_restriction(byte country_restriction) {
		this.country_restriction = country_restriction;
	}
	public byte getCarrier_restriction() {
		return carrier_restriction;
	}
	public void setCarrier_restriction(byte carrier_restriction) {
		this.carrier_restriction = carrier_restriction;
	}
	public byte getGroup_restriction() {
		return group_restriction;
	}
	public void setGroup_restriction(byte group_restriction) {
		this.group_restriction = group_restriction;
	}
	public byte getCart_rule_restriction() {
		return cart_rule_restriction;
	}
	public void setCart_rule_restriction(byte cart_rule_restriction) {
		this.cart_rule_restriction = cart_rule_restriction;
	}
	public byte getProduct_restriction() {
		return product_restriction;
	}
	public void setProduct_restriction(byte product_restriction) {
		this.product_restriction = product_restriction;
	}
	public byte getShop_restriction() {
		return shop_restriction;
	}
	public void setShop_restriction(byte shop_restriction) {
		this.shop_restriction = shop_restriction;
	}
	public byte getFree_shipping() {
		return free_shipping;
	}
	public void setFree_shipping(byte free_shipping) {
		this.free_shipping = free_shipping;
	}
	public String getReduction_percent() {
		return reduction_percent;
	}
	public void setReduction_percent(String reduction_percent) {
		this.reduction_percent = reduction_percent;
	}
	public float getReduction_amount() {
		return reduction_amount;
	}
	public void setReduction_amount(float reduction_amount) {
		this.reduction_amount = reduction_amount;
	}
	public byte getReduction_tax() {
		return reduction_tax;
	}
	public void setReduction_tax(byte reduction_tax) {
		this.reduction_tax = reduction_tax;
	}
	public Long getReduction_currency() {
		return reduction_currency;
	}
	public void setReduction_currency(Long reduction_currency) {
		this.reduction_currency = reduction_currency;
	}
	public int getReduction_product() {
		return reduction_product;
	}
	public void setReduction_product(int reduction_product) {
		this.reduction_product = reduction_product;
	}
	public byte getReduction_exclude_special() {
		return reduction_exclude_special;
	}
	public void setReduction_exclude_special(byte reduction_exclude_special) {
		this.reduction_exclude_special = reduction_exclude_special;
	}
	public Long getGift_product() {
		return gift_product;
	}
	public void setGift_product(Long gift_product) {
		this.gift_product = gift_product;
	}
	public Long getGift_product_attribute() {
		return gift_product_attribute;
	}
	public void setGift_product_attribute(Long gift_product_attribute) {
		this.gift_product_attribute = gift_product_attribute;
	}
	public byte getHighlight() {
		return highlight;
	}
	public void setHighlight(byte highlight) {
		this.highlight = highlight;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
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
	public List<Language> getName() {
		return name;
	}
	public void setName(List<Language> name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CartRule [id=" + id + ", id_customer=" + id_customer + ", date_from=" + date_from + ", date_to="
				+ date_to + ", description=" + description + ", quantity=" + quantity + ", quantity_per_user="
				+ quantity_per_user + ", priority=" + priority + ", partial_use=" + partial_use + ", code=" + code
				+ ", minimum_amount=" + minimum_amount + ", minimum_amount_tax=" + minimum_amount_tax
				+ ", minimum_amount_currency=" + minimum_amount_currency + ", minimum_amount_shipping="
				+ minimum_amount_shipping + ", country_restriction=" + country_restriction + ", carrier_restriction="
				+ carrier_restriction + ", group_restriction=" + group_restriction + ", cart_rule_restriction="
				+ cart_rule_restriction + ", product_restriction=" + product_restriction + ", shop_restriction="
				+ shop_restriction + ", free_shipping=" + free_shipping + ", reduction_percent=" + reduction_percent
				+ ", reduction_amount=" + reduction_amount + ", reduction_tax=" + reduction_tax
				+ ", reduction_currency=" + reduction_currency + ", reduction_product=" + reduction_product
				+ ", reduction_exclude_special=" + reduction_exclude_special + ", gift_product=" + gift_product
				+ ", gift_product_attribute=" + gift_product_attribute + ", highlight=" + highlight + ", active="
				+ active + ", date_add=" + date_add + ", date_upd=" + date_upd + ", name=" + name + "]";
	}

	
	
}
