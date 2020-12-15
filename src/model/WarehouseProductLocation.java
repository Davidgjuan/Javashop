package model;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement; 

@JacksonXmlRootElement(localName = "warehouse_product_location")
public class WarehouseProductLocation implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_product;
	private Long id_product_attribute;
	private Long id_warehouse;
	private String location;
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public WarehouseProductLocation() {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "WarehouseProductLocation [href=" + href + ", id=" + id + ", id_product=" + id_product
				+ ", id_product_attribute=" + id_product_attribute + ", id_warehouse=" + id_warehouse + ", location="
				+ location + "]";
	}

}
