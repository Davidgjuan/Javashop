package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "store")
public class SupplyOrderDetail implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	
	private Long id;
	private Long id_supply_order;
	private Long id_product;
	private Long id_product_attribute;
	private String reference;
	private String supplier_reference;
	private String name;
	private String ean13;
	private String isbn;
	private String upc;
	private String mpn;
	private float exchange_rate;
	private float unit_price_te;
	private Integer quantity_expected;
	private Integer quantity_received;
	private float price_te;
	private float discount_rate;
	private float discount_value_te;
	private float price_with_discount_te;
	private float tax_rate;
	private float tax_value;
	private float price_ti;
	private float tax_value_with_order_discount;
	private float price_with_order_discount_te;

	 
	private static final long serialVersionUID = 3916167748882494558L;

	public SupplyOrderDetail() {
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

	public Long getId_supply_order() {
		return id_supply_order;
	}

	public void setId_supply_order(Long id_supply_order) {
		this.id_supply_order = id_supply_order;
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

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSupplier_reference() {
		return supplier_reference;
	}

	public void setSupplier_reference(String supplier_reference) {
		this.supplier_reference = supplier_reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEan13() {
		return ean13;
	}

	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public float getExchange_rate() {
		return exchange_rate;
	}

	public void setExchange_rate(float exchange_rate) {
		this.exchange_rate = exchange_rate;
	}

	public float getUnit_price_te() {
		return unit_price_te;
	}

	public void setUnit_price_te(float unit_price_te) {
		this.unit_price_te = unit_price_te;
	}

	public Integer getQuantity_expected() {
		return quantity_expected;
	}

	public void setQuantity_expected(Integer quantity_expected) {
		this.quantity_expected = quantity_expected;
	}

	public Integer getQuantity_received() {
		return quantity_received;
	}

	public void setQuantity_received(Integer quantity_received) {
		this.quantity_received = quantity_received;
	}

	public float getPrice_te() {
		return price_te;
	}

	public void setPrice_te(float price_te) {
		this.price_te = price_te;
	}

	public float getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(float discount_rate) {
		this.discount_rate = discount_rate;
	}

	public float getDiscount_value_te() {
		return discount_value_te;
	}

	public void setDiscount_value_te(float discount_value_te) {
		this.discount_value_te = discount_value_te;
	}

	public float getPrice_with_discount_te() {
		return price_with_discount_te;
	}

	public void setPrice_with_discount_te(float price_with_discount_te) {
		this.price_with_discount_te = price_with_discount_te;
	}

	public float getTax_rate() {
		return tax_rate;
	}

	public void setTax_rate(float tax_rate) {
		this.tax_rate = tax_rate;
	}

	public float getTax_value() {
		return tax_value;
	}

	public void setTax_value(float tax_value) {
		this.tax_value = tax_value;
	}

	public float getPrice_ti() {
		return price_ti;
	}

	public void setPrice_ti(float price_ti) {
		this.price_ti = price_ti;
	}

	public float getTax_value_with_order_discount() {
		return tax_value_with_order_discount;
	}

	public void setTax_value_with_order_discount(float tax_value_with_order_discount) {
		this.tax_value_with_order_discount = tax_value_with_order_discount;
	}

	public float getPrice_with_order_discount_te() {
		return price_with_order_discount_te;
	}

	public void setPrice_with_order_discount_te(float price_with_order_discount_te) {
		this.price_with_order_discount_te = price_with_order_discount_te;
	}

	@Override
	public String toString() {
		return "SupplyOrderDetail [href=" + href + ", id=" + id + ", id_supply_order=" + id_supply_order
				+ ", id_product=" + id_product + ", id_product_attribute=" + id_product_attribute + ", reference="
				+ reference + ", supplier_reference=" + supplier_reference + ", name=" + name + ", ean13=" + ean13
				+ ", isbn=" + isbn + ", upc=" + upc + ", mpn=" + mpn + ", exchange_rate=" + exchange_rate
				+ ", unit_price_te=" + unit_price_te + ", quantity_expected=" + quantity_expected
				+ ", quantity_received=" + quantity_received + ", price_te=" + price_te + ", discount_rate="
				+ discount_rate + ", discount_value_te=" + discount_value_te + ", price_with_discount_te="
				+ price_with_discount_te + ", tax_rate=" + tax_rate + ", tax_value=" + tax_value + ", price_ti="
				+ price_ti + ", tax_value_with_order_discount=" + tax_value_with_order_discount
				+ ", price_with_order_discount_te=" + price_with_order_discount_te + "]";
	}

}
