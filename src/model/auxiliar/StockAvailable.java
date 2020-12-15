package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "stock_available")
public class StockAvailable {

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_product_attribute;
	
	public StockAvailable() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Long getId_product_attribute() {
		return id_product_attribute;
	}


	public void setId_product_attribute(Long id_product_attribute) {
		this.id_product_attribute = id_product_attribute;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "StockAvailable [id=" + id + ", id_product_attribute=" + id_product_attribute + "]";
	}

	
	
	
}
