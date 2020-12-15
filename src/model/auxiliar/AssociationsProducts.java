package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Category;
import model.Product;
import model.ProductOptionValue;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsProducts {

	
	@JacksonXmlElementWrapper(namespace ="categories", localName = "categories")
	private List<Category> category;

	@JacksonXmlElementWrapper(namespace ="images", localName = "images")
	private List<Image> image;
	
	
	@JacksonXmlElementWrapper(namespace ="combinations", localName = "combinations")
	private List<Combination> combination;

	@JacksonXmlElementWrapper(namespace ="product_option_values", localName = "product_option_values")
	private List<ProductOptionValue> product_option_value;

	@JacksonXmlElementWrapper(namespace ="product_features", localName = "product_features")
	private List<ProductFeature> product_feature;

	@JacksonXmlElementWrapper(namespace ="tags", localName = "tags")
	private List<Tag> tag;

	@JacksonXmlElementWrapper(namespace ="stock_availables", localName = "stock_availables")
	private List<StockAvailable> stock_available;
	
	@JacksonXmlElementWrapper(namespace ="accessories", localName = "accessories")
	private List<Product> product;
	
	@JacksonXmlElementWrapper(namespace ="product_bundle", localName = "product_bundle")
	private List<ProductBundle> product_bundle;
	
	public AssociationsProducts() {
		super();
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public List<Combination> getCombination() {
		return combination;
	}

	public void setCombination(List<Combination> combination) {
		this.combination = combination;
	}

	public List<ProductOptionValue> getProduct_option_value() {
		return product_option_value;
	}

	public void setProduct_option_value(List<ProductOptionValue> product_option_value) {
		this.product_option_value = product_option_value;
	}

	public List<ProductFeature> getProduct_feature() {
		return product_feature;
	}

	public void setProduct_feature(List<ProductFeature> product_feature) {
		this.product_feature = product_feature;
	}

	public List<Tag> getTag() {
		return tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}

	public List<StockAvailable> getStock_available() {
		return stock_available;
	}

	public void setStock_available(List<StockAvailable> stock_available) {
		this.stock_available = stock_available;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public List<ProductBundle> getProduct_bundle() {
		return product_bundle;
	}

	public void setProduct_bundle(List<ProductBundle> product_bundle) {
		this.product_bundle = product_bundle;
	}

	@Override
	public String toString() {
		return "AssociationsProducts [category=" + category + ", image=" + image + ", combination=" + combination
				+ ", product_option_value=" + product_option_value + ", product_feature=" + product_feature + ", tag="
				+ tag + ", stock_available=" + stock_available + ", product=" + product + ", product_bundle="
				+ product_bundle + "]";
	}

}
