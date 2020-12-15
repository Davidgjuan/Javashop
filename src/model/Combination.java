package model;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.AssociationsCombinations;

@JacksonXmlRootElement(localName = "combination")
public class Combination implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String id_product;
	 private String location;
	 private String ean13;
	 private String isbn;
	 private String upc;
	 private String mpn;
	 private String quantity;
	 private String reference;
	 private String supplier_reference;
	 private String wholesale_price;
	 private String price;
	 private String ecotax;
	 private String weight;
	 private String unit_price_impact;
	 private String minimal_quantity;
	 private String low_stock_threshold;
	 private String low_stock_alert;
	 private String default_on;
	 private String available_date;
	 private AssociationsCombinations associations;
	 
	private static final long serialVersionUID = 7299349908202209532L;
	
	public Combination() {
		super();
	}

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

	public String getId_product() {
		return id_product;
	}

	public void setId_product(String id_product) {
		this.id_product = id_product;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
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

	public String getWholesale_price() {
		return wholesale_price;
	}

	public void setWholesale_price(String wholesale_price) {
		this.wholesale_price = wholesale_price;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEcotax() {
		return ecotax;
	}

	public void setEcotax(String ecotax) {
		this.ecotax = ecotax;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getUnit_price_impact() {
		return unit_price_impact;
	}

	public void setUnit_price_impact(String unit_price_impact) {
		this.unit_price_impact = unit_price_impact;
	}

	public String getMinimal_quantity() {
		return minimal_quantity;
	}

	public void setMinimal_quantity(String minimal_quantity) {
		this.minimal_quantity = minimal_quantity;
	}

	public String getLow_stock_threshold() {
		return low_stock_threshold;
	}

	public void setLow_stock_threshold(String low_stock_threshold) {
		this.low_stock_threshold = low_stock_threshold;
	}

	public String getLow_stock_alert() {
		return low_stock_alert;
	}

	public void setLow_stock_alert(String low_stock_alert) {
		this.low_stock_alert = low_stock_alert;
	}

	public String getDefault_on() {
		return default_on;
	}

	public void setDefault_on(String default_on) {
		this.default_on = default_on;
	}

	public String getAvailable_date() {
		return available_date;
	}

	public void setAvailable_date(String available_date) {
		this.available_date = available_date;
	}

	public AssociationsCombinations getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsCombinations associations) {
		this.associations = associations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Combination [href=" + href + ", id=" + id + ", id_product=" + id_product + ", location=" + location
				+ ", ean13=" + ean13 + ", isbn=" + isbn + ", upc=" + upc + ", mpn=" + mpn + ", quantity=" + quantity
				+ ", reference=" + reference + ", supplier_reference=" + supplier_reference + ", wholesale_price="
				+ wholesale_price + ", price=" + price + ", ecotax=" + ecotax + ", weight=" + weight
				+ ", unit_price_impact=" + unit_price_impact + ", minimal_quantity=" + minimal_quantity
				+ ", low_stock_threshold=" + low_stock_threshold + ", low_stock_alert=" + low_stock_alert
				+ ", default_on=" + default_on + ", available_date=" + available_date + ", associations=" + associations
				+ "]";
	}

	
}
