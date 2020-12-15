package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "cart_row")
public class OrderRow {

	 private Long id;
	 private String product_id;
	 private Long product_attribute_id;
	 private int product_quantity;
	 private String product_name;
	 private String product_reference;
	 private String product_ean13;
	 private String product_isbn;
	 private String product_upc;
	 private float product_price;
	 private String id_customization;
	 private float unit_price_tax_incl;
	 private float unit_price_tax_excl;
	
	public OrderRow() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public Long getProduct_attribute_id() {
		return product_attribute_id;
	}

	public void setProduct_attribute_id(Long product_attribute_id) {
		this.product_attribute_id = product_attribute_id;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_reference() {
		return product_reference;
	}

	public void setProduct_reference(String product_reference) {
		this.product_reference = product_reference;
	}

	public String getProduct_ean13() {
		return product_ean13;
	}

	public void setProduct_ean13(String product_ean13) {
		this.product_ean13 = product_ean13;
	}

	public String getProduct_isbn() {
		return product_isbn;
	}

	public void setProduct_isbn(String product_isbn) {
		this.product_isbn = product_isbn;
	}

	public String getProduct_upc() {
		return product_upc;
	}

	public void setProduct_upc(String product_upc) {
		this.product_upc = product_upc;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public String getId_customization() {
		return id_customization;
	}

	public void setId_customization(String id_customization) {
		this.id_customization = id_customization;
	}

	public float getUnit_price_tax_incl() {
		return unit_price_tax_incl;
	}

	public void setUnit_price_tax_incl(float unit_price_tax_incl) {
		this.unit_price_tax_incl = unit_price_tax_incl;
	}

	public float getUnit_price_tax_excl() {
		return unit_price_tax_excl;
	}

	public void setUnit_price_tax_excl(float unit_price_tax_excl) {
		this.unit_price_tax_excl = unit_price_tax_excl;
	}

	@Override
	public String toString() {
		return "OrderRow [id=" + id + ", product_id=" + product_id + ", product_attribute_id=" + product_attribute_id
				+ ", product_quantity=" + product_quantity + ", product_name=" + product_name + ", product_reference="
				+ product_reference + ", product_ean13=" + product_ean13 + ", product_isbn=" + product_isbn
				+ ", product_upc=" + product_upc + ", product_price=" + product_price + ", id_customization="
				+ id_customization + ", unit_price_tax_incl=" + unit_price_tax_incl + ", unit_price_tax_excl="
				+ unit_price_tax_excl + "]";
	}	
	
	
}
