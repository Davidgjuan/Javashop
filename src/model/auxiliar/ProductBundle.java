package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "product")
public class ProductBundle {


	private long id;
	private String id_product_attribute;
	private Integer quantity;
		
	public ProductBundle() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_product_attribute() {
		return id_product_attribute;
	}

	public void setId_product_attribute(String id_product_attribute) {
		this.id_product_attribute = id_product_attribute;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductBundle [id=" + id + ", id_product_attribute=" + id_product_attribute + ", quantity=" + quantity
				+ "]";
	}

}
