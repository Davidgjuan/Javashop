package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "product_feature")
public class ProductFeature {


	private long id;
	private String id_feature_value;
	
	public ProductFeature() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_feature_value() {
		return id_feature_value;
	}

	public void setId_feature_value(String id_feature_value) {
		this.id_feature_value = id_feature_value;
	}

	@Override
	public String toString() {
		return "ProductFeature [id=" + id + ", id_feature_value=" + id_feature_value + "]";
	}

	

	
	
}
