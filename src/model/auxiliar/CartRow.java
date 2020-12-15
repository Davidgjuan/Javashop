package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "cart_row")
public class CartRow {

	private String id_product;
	private String id_product_attribute;
	private String id_address_delivery;
	private String id_customization;
	private String quantity;
	
	public CartRow() {
		super();
	}	
	
	public CartRow(String id_product, String id_product_attribute, String id_address_delivery, String id_customization,
			String quantity) {
		super();
		this.id_product = id_product;
		this.id_product_attribute = id_product_attribute;
		this.id_address_delivery = id_address_delivery;
		this.id_customization = id_customization;
		this.quantity = quantity;
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
	public String getId_address_delivery() {
		return id_address_delivery;
	}
	public void setId_address_delivery(String id_address_delivery) {
		this.id_address_delivery = id_address_delivery;
	}
	public String getId_customization() {
		return id_customization;
	}
	public void setId_customization(String id_customization) {
		this.id_customization = id_customization;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartRow [id_product=" + id_product + ", id_product_attribute=" + id_product_attribute
				+ ", id_address_delivery=" + id_address_delivery + ", id_customization=" + id_customization
				+ ", quantity=" + quantity + "]";
	}	
	
}
