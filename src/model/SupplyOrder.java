package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsSupplyOrder;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "supply_order")
public class SupplyOrder implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private Long id_supplier;
	 private Long id_lang;
	 private Long id_warehouse;
	 private Long id_supply_order_state;
	 private Long id_currency;
	 private String supplier_name;
	 private String reference;
	 private String date_delivery_expected;
	 private float total_te;
	 private float total_with_discount_te;
	 private float total_ti;
	 private float total_tax;
	 private float discount_rate;
	 private float discount_value_te;
	 private float is_template;
	 private float date_add;
	 private float date_upd;
	 private AssociationsSupplyOrder associations;
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public SupplyOrder() {
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

	public Long getId_supplier() {
		return id_supplier;
	}

	public void setId_supplier(Long id_supplier) {
		this.id_supplier = id_supplier;
	}

	public Long getId_lang() {
		return id_lang;
	}

	public void setId_lang(Long id_lang) {
		this.id_lang = id_lang;
	}

	public Long getId_warehouse() {
		return id_warehouse;
	}

	public void setId_warehouse(Long id_warehouse) {
		this.id_warehouse = id_warehouse;
	}

	public Long getId_supply_order_state() {
		return id_supply_order_state;
	}

	public void setId_supply_order_state(Long id_supply_order_state) {
		this.id_supply_order_state = id_supply_order_state;
	}

	public Long getId_currency() {
		return id_currency;
	}

	public void setId_currency(Long id_currency) {
		this.id_currency = id_currency;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDate_delivery_expected() {
		return date_delivery_expected;
	}

	public void setDate_delivery_expected(String date_delivery_expected) {
		this.date_delivery_expected = date_delivery_expected;
	}

	public float getTotal_te() {
		return total_te;
	}

	public void setTotal_te(float total_te) {
		this.total_te = total_te;
	}

	public float getTotal_with_discount_te() {
		return total_with_discount_te;
	}

	public void setTotal_with_discount_te(float total_with_discount_te) {
		this.total_with_discount_te = total_with_discount_te;
	}

	public float getTotal_ti() {
		return total_ti;
	}

	public void setTotal_ti(float total_ti) {
		this.total_ti = total_ti;
	}

	public float getTotal_tax() {
		return total_tax;
	}

	public void setTotal_tax(float total_tax) {
		this.total_tax = total_tax;
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

	public float getIs_template() {
		return is_template;
	}

	public void setIs_template(float is_template) {
		this.is_template = is_template;
	}

	public float getDate_add() {
		return date_add;
	}

	public void setDate_add(float date_add) {
		this.date_add = date_add;
	}

	public float getDate_upd() {
		return date_upd;
	}

	public void setDate_upd(float date_upd) {
		this.date_upd = date_upd;
	}

	
	public AssociationsSupplyOrder getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsSupplyOrder associations) {
		this.associations = associations;
	}

	@Override
	public String toString() {
		return "SupplyOrder [href=" + href + ", id=" + id + ", id_supplier=" + id_supplier + ", id_lang=" + id_lang
				+ ", id_warehouse=" + id_warehouse + ", id_supply_order_state=" + id_supply_order_state
				+ ", id_currency=" + id_currency + ", supplier_name=" + supplier_name + ", reference=" + reference
				+ ", date_delivery_expected=" + date_delivery_expected + ", total_te=" + total_te
				+ ", total_with_discount_te=" + total_with_discount_te + ", total_ti=" + total_ti + ", total_tax="
				+ total_tax + ", discount_rate=" + discount_rate + ", discount_value_te=" + discount_value_te
				+ ", is_template=" + is_template + ", date_add=" + date_add + ", date_upd=" + date_upd + "]";
	}

}
