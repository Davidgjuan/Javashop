package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "image_type")
public class ImageType implements Serializable {

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String name;
	 private int width;
	 private int height;
	 private byte categories;
	 private byte products;
	 private byte manufacturers;
	 private byte suppliers;
	 private byte stores;
	private static final long serialVersionUID = -6119982128062394491L;
	
	public ImageType() {
		super();
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public byte getCategories() {
		return categories;
	}

	public void setCategories(byte categories) {
		this.categories = categories;
	}

	public byte getProducts() {
		return products;
	}

	public void setProducts(byte products) {
		this.products = products;
	}

	public byte getManufacturers() {
		return manufacturers;
	}

	public void setManufacturers(byte manufacturers) {
		this.manufacturers = manufacturers;
	}

	public byte getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(byte suppliers) {
		this.suppliers = suppliers;
	}

	public byte getStores() {
		return stores;
	}

	public void setStores(byte stores) {
		this.stores = stores;
	}

	@Override
	public String toString() {
		return "ImageType [href=" + href + ", id=" + id + ", name=" + name + ", width=" + width + ", height=" + height
				+ ", categories=" + categories + ", products=" + products + ", manufacturers=" + manufacturers
				+ ", suppliers=" + suppliers + ", stores=" + stores + "]";
	}
	
	
	
}
