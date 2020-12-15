package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.AssociationsOrderSlip;
import model.auxiliar.AssociationsProductOption;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "shop_group")
public class ShopGroup implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private String name;
	private byte share_customer;
	private byte share_order;
	private byte share_stock;
	private byte active;
	private byte deleted;
	 
	private static final long serialVersionUID = 3916167748882494558L;

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

	public byte getShare_customer() {
		return share_customer;
	}

	public void setShare_customer(byte share_customer) {
		this.share_customer = share_customer;
	}

	public byte getShare_order() {
		return share_order;
	}

	public void setShare_order(byte share_order) {
		this.share_order = share_order;
	}

	public byte getShare_stock() {
		return share_stock;
	}

	public void setShare_stock(byte share_stock) {
		this.share_stock = share_stock;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public byte getDeleted() {
		return deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "ShopGroup [href=" + href + ", id=" + id + ", name=" + name + ", share_customer=" + share_customer
				+ ", share_order=" + share_order + ", share_stock=" + share_stock + ", active=" + active + ", deleted="
				+ deleted + "]";
	}

}
