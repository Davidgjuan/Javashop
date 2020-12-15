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

@JacksonXmlRootElement(localName = "product_supplier")
public class ProductSupplier implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private Long id_product;
	 private Long id_product_attribute;
	 private Long id_supplier;
	 private Long id_currency;
	 private String product_supplier_reference;
	 private float product_supplier_price_te;
	
	 
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

	public Long getId_supplier() {
		return id_supplier;
	}

	public void setId_supplier(Long id_supplier) {
		this.id_supplier = id_supplier;
	}

	public Long getId_currency() {
		return id_currency;
	}

	public void setId_currency(Long id_currency) {
		this.id_currency = id_currency;
	}

	public String getProduct_supplier_reference() {
		return product_supplier_reference;
	}

	public void setProduct_supplier_reference(String product_supplier_reference) {
		this.product_supplier_reference = product_supplier_reference;
	}

	public float getProduct_supplier_price_te() {
		return product_supplier_price_te;
	}

	public void setProduct_supplier_price_te(float product_supplier_price_te) {
		this.product_supplier_price_te = product_supplier_price_te;
	}

	@Override
	public String toString() {
		return "ProductSupplier [href=" + href + ", id=" + id + ", id_product=" + id_product + ", id_product_attribute="
				+ id_product_attribute + ", id_supplier=" + id_supplier + ", id_currency=" + id_currency
				+ ", product_supplier_reference=" + product_supplier_reference + ", product_supplier_price_te="
				+ product_supplier_price_te + "]";
	}

	
}
