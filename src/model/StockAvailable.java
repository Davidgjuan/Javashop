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

@JacksonXmlRootElement(localName = "stock_available")
public class StockAvailable implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private String id_product;
	private String id_product_attribute;
	private String id_shop;
	private String id_shop_group;
	private int quantity;
	private byte depends_on_stock;
	private int out_of_stock;
	private String location;

	 
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

	public String getId_product() {
		return id_product;
	}

	public void setId_product(String id_product) {
		this.id_product = id_product;
	}

	public String getId_product_attribute() {
		return id_product_attribute;
	}

	public void setId_product_attribute(String id_product_attribute) {
		this.id_product_attribute = id_product_attribute;
	}

	public String getId_shop() {
		return id_shop;
	}

	public void setId_shop(String id_shop) {
		this.id_shop = id_shop;
	}

	public String getId_shop_group() {
		return id_shop_group;
	}

	public void setId_shop_group(String id_shop_group) {
		this.id_shop_group = id_shop_group;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public byte getDepends_on_stock() {
		return depends_on_stock;
	}

	public void setDepends_on_stock(byte depends_on_stock) {
		this.depends_on_stock = depends_on_stock;
	}

	public int getOut_of_stock() {
		return out_of_stock;
	}

	public void setOut_of_stock(int out_of_stock) {
		this.out_of_stock = out_of_stock;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "StockAvailable [href=" + href + ", id=" + id + ", id_product=" + id_product + ", id_product_attribute="
				+ id_product_attribute + ", id_shop=" + id_shop + ", id_shop_group=" + id_shop_group + ", quantity="
				+ quantity + ", depends_on_stock=" + depends_on_stock + ", out_of_stock=" + out_of_stock + ", location="
				+ location + "]";
	}

	
	

}
