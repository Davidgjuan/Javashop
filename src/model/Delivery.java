package model;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;

@JacksonXmlRootElement(localName = "delivery")
public class Delivery implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private String id_carrier;
	 private String id_range_price;
	 private String id_range_weight;
	 private String id_zone;
	 private String id_shop;
	 private String id_shop_group;
	 private float price;

	private static final long serialVersionUID = 7299349908202209532L;
	
	public Delivery() {
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

	public String getId_carrier() {
		return id_carrier;
	}

	public void setId_carrier(String id_carrier) {
		this.id_carrier = id_carrier;
	}

	public String getId_range_price() {
		return id_range_price;
	}

	public void setId_range_price(String id_range_price) {
		this.id_range_price = id_range_price;
	}

	public String getId_range_weight() {
		return id_range_weight;
	}

	public void setId_range_weight(String id_range_weight) {
		this.id_range_weight = id_range_weight;
	}

	public String getId_zone() {
		return id_zone;
	}

	public void setId_zone(String id_zone) {
		this.id_zone = id_zone;
	}

	public String getId_shop() {
		return id_shop;
	}

	public void setId_shop(String id_shop) {
		this.id_shop = id_shop;
	}

	public String getId_shop_group() {
		return id_shop_group;
	}

	public void setId_shop_group(String id_shop_group) {
		this.id_shop_group = id_shop_group;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Delivery [href=" + href + ", id=" + id + ", id_carrier=" + id_carrier + ", id_range_price="
				+ id_range_price + ", id_range_weight=" + id_range_weight + ", id_zone=" + id_zone + ", id_shop="
				+ id_shop + ", id_shop_group=" + id_shop_group + ", price=" + price + "]";
	}

}
