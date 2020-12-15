package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.AssociationsOrderSlip;
import model.auxiliar.AssociationsProductOption;
import model.auxiliar.Language; 

@JacksonXmlRootElement(namespace = "stock_mvt", localName = "stock_mvt")
public class StockMovement implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private Long id_product;
	private Long id_product_attribute;
	private Long id_warehouse;
	private Long id_currency;
	private String management_type;
	private String id_employee;
	private String id_stock;
	private String id_stock_mvt_reason;
	private Long id_order;
	private Long id_supply_order;
	@XmlElementWrapper
	private List<Language> product_name;
	private String ean13;
	private String upc;
	private String reference;
	private String mpn;
	private String physical_quantity;
	private int sign;
	private float last_wa;
	private float current_wa;
	private float price_te;
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

	public Long getId_warehouse() {
		return id_warehouse;
	}

	public void setId_warehouse(Long id_warehouse) {
		this.id_warehouse = id_warehouse;
	}

	public Long getId_currency() {
		return id_currency;
	}

	public void setId_currency(Long id_currency) {
		this.id_currency = id_currency;
	}

	public String getManagement_type() {
		return management_type;
	}

	public void setManagement_type(String management_type) {
		this.management_type = management_type;
	}

	public String getId_employee() {
		return id_employee;
	}

	public void setId_employee(String id_employee) {
		this.id_employee = id_employee;
	}

	public String getId_stock() {
		return id_stock;
	}

	public void setId_stock(String id_stock) {
		this.id_stock = id_stock;
	}

	public String getId_stock_mvt_reason() {
		return id_stock_mvt_reason;
	}

	public void setId_stock_mvt_reason(String id_stock_mvt_reason) {
		this.id_stock_mvt_reason = id_stock_mvt_reason;
	}

	public Long getId_order() {
		return id_order;
	}

	public void setId_order(Long id_order) {
		this.id_order = id_order;
	}

	public Long getId_supply_order() {
		return id_supply_order;
	}

	public void setId_supply_order(Long id_supply_order) {
		this.id_supply_order = id_supply_order;
	}

	public List<Language> getProduct_name() {
		return product_name;
	}

	public void setProduct_name(List<Language> product_name) {
		this.product_name = product_name;
	}

	public String getEan13() {
		return ean13;
	}

	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String getPhysical_quantity() {
		return physical_quantity;
	}

	public void setPhysical_quantity(String physical_quantity) {
		this.physical_quantity = physical_quantity;
	}

	public int getSign() {
		return sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
	}

	public float getLast_wa() {
		return last_wa;
	}

	public void setLast_wa(float last_wa) {
		this.last_wa = last_wa;
	}

	public float getCurrent_wa() {
		return current_wa;
	}

	public void setCurrent_wa(float current_wa) {
		this.current_wa = current_wa;
	}

	public float getPrice_te() {
		return price_te;
	}

	public void setPrice_te(float price_te) {
		this.price_te = price_te;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	@Override
	public String toString() {
		return "StockMovement [href=" + href + ", id=" + id + ", id_product=" + id_product + ", id_product_attribute="
				+ id_product_attribute + ", id_warehouse=" + id_warehouse + ", id_currency=" + id_currency
				+ ", management_type=" + management_type + ", id_employee=" + id_employee + ", id_stock=" + id_stock
				+ ", id_stock_mvt_reason=" + id_stock_mvt_reason + ", id_order=" + id_order + ", id_supply_order="
				+ id_supply_order + ", product_name=" + product_name + ", ean13=" + ean13 + ", upc=" + upc
				+ ", reference=" + reference + ", mpn=" + mpn + ", physical_quantity=" + physical_quantity + ", sign="
				+ sign + ", last_wa=" + last_wa + ", current_wa=" + current_wa + ", price_te=" + price_te
				+ ", date_add=" + date_add + "]";
	}

	
}
