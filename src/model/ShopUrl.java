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

@JacksonXmlRootElement(localName = "shop_url")
public class ShopUrl implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private String id_shop;
	private byte active;
	private byte main;
	private String domain;
	private String domain_ssl;
	private String physical_uri;
	private String virtual_uri;
	 
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

	public String getId_shop() {
		return id_shop;
	}

	public void setId_shop(String id_shop) {
		this.id_shop = id_shop;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public byte getMain() {
		return main;
	}

	public void setMain(byte main) {
		this.main = main;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDomain_ssl() {
		return domain_ssl;
	}

	public void setDomain_ssl(String domain_ssl) {
		this.domain_ssl = domain_ssl;
	}

	public String getPhysical_uri() {
		return physical_uri;
	}

	public void setPhysical_uri(String physical_uri) {
		this.physical_uri = physical_uri;
	}

	public String getVirtual_uri() {
		return virtual_uri;
	}

	public void setVirtual_uri(String virtual_uri) {
		this.virtual_uri = virtual_uri;
	}

	@Override
	public String toString() {
		return "ShopUrl [href=" + href + ", id=" + id + ", id_shop=" + id_shop + ", active=" + active + ", main=" + main
				+ ", domain=" + domain + ", domain_ssl=" + domain_ssl + ", physical_uri=" + physical_uri
				+ ", virtual_uri=" + virtual_uri + "]";
	}

	

}
