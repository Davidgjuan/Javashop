package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Category;
import model.Product;
import model.ProductOptionValue;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsProductOption {

	
	@JacksonXmlElementWrapper(namespace ="product_option_values", localName = "product_option_values")
	private List<ProductOptionValue> product_option_value;

	public AssociationsProductOption() {
		super();
	}


	public List<ProductOptionValue> getProduct_option_value() {
		return product_option_value;
	}


	public void setProduct_option_value(List<ProductOptionValue> product_option_value) {
		this.product_option_value = product_option_value;
	}


	@Override
	public String toString() {
		return "AssociationsProductOption [product_option_value=" + product_option_value + "]";
	}

}
