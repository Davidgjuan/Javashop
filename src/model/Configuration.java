package model;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.AssociationsCombinations;

@JacksonXmlRootElement(localName = "configuration")
public class Configuration implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String value;
	 private String name;
	 private String id_shop_group;
	 private String id_shop;
	 private String date_add;
	 private String date_upd;
	 
	private static final long serialVersionUID = 7299349908202209532L;
	
	public Configuration() {
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId_shop_group() {
		return id_shop_group;
	}

	public void setId_shop_group(String id_shop_group) {
		this.id_shop_group = id_shop_group;
	}

	public String getId_shop() {
		return id_shop;
	}

	public void setId_shop(String id_shop) {
		this.id_shop = id_shop;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	public String getDate_upd() {
		return date_upd;
	}

	public void setDate_upd(String date_upd) {
		this.date_upd = date_upd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Configuration [href=" + href + ", id=" + id + ", value=" + value + ", name=" + name + ", id_shop_group="
				+ id_shop_group + ", id_shop=" + id_shop + ", date_add=" + date_add + ", date_upd=" + date_upd + "]";
	}

	
}
