package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "tag")
public class SupplyOrderDetail {


	 private Long id;
	 private Long id_product;
	 private Long id_product_attribute;
	 private String supplier_reference;
	 private String product_name;
	
	public SupplyOrderDetail() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public String getSupplier_reference() {
		return supplier_reference;
	}


	public void setSupplier_reference(String supplier_reference) {
		this.supplier_reference = supplier_reference;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "SupplyOrderDetail [id=" + id + ", id_product=" + id_product + ", id_product_attribute="
				+ id_product_attribute + ", supplier_reference=" + supplier_reference + ", product_name=" + product_name
				+ "]";
	}


	
}
