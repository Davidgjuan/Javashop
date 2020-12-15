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

@JacksonXmlRootElement(localName = "stock")
public class Stock implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private Long id_warehouse;
	 private Long id_product;
	 private Long id_product_attribute;
	 private String reference;
	 private String ean13;
	 private String isbn;
	 private String upc;
	 private String mpn;
	 private Integer physical_quantity;
	 private int usable_quantity;
	 private float price_te;

	 
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

	public Long getId_warehouse() {
		return id_warehouse;
	}

	public void setId_warehouse(Long id_warehouse) {
		this.id_warehouse = id_warehouse;
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

	public Integer getPhysical_quantity() {
		return physical_quantity;
	}

	public void setPhysical_quantity(Integer physical_quantity) {
		this.physical_quantity = physical_quantity;
	}

	public int getUsable_quantity() {
		return usable_quantity;
	}

	public void setUsable_quantity(int usable_quantity) {
		this.usable_quantity = usable_quantity;
	}

	public float getPrice_te() {
		return price_te;
	}

	public void setPrice_te(float price_te) {
		this.price_te = price_te;
	}

	@Override
	public String toString() {
		return "Stock [href=" + href + ", id=" + id + ", id_warehouse=" + id_warehouse + ", id_product=" + id_product
				+ ", id_product_attribute=" + id_product_attribute + ", reference=" + reference + ", ean13=" + ean13
				+ ", isbn=" + isbn + ", upc=" + upc + ", mpn=" + mpn + ", physical_quantity=" + physical_quantity
				+ ", usable_quantity=" + usable_quantity + ", price_te=" + price_te + "]";
	}


}
