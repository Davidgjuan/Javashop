package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Category;
import model.Product;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsCategory {

	
	@JacksonXmlElementWrapper(namespace ="categories", localName = "categories")
	private List<Category> category;
	
	@JacksonXmlElementWrapper(namespace ="products", localName = "products")
	private List<Product> product;

	public AssociationsCategory() {
		super();
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "AssociationsCategory [category=" + category + ", product=" + product + "]";
	}

}
