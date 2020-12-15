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

@JacksonXmlRootElement(localName = "shop")
public class SpecificPriceRule implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private Long id;
	 private Long id_shop;
	 private Long id_country;
	 private Long id_currency;
	 private Long id_group;
	 private String name;
	 private Integer from_quantity;
	 private String price;
	 private String reduction;
	 private byte reduction_tax;
	 private String reduction_type;
	 private String from;
	 private String to;
	 
	private static final long serialVersionUID = 3916167748882494558L;

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

	public Long getId_shop() {
		return id_shop;
	}

	public void setId_shop(Long id_shop) {
		this.id_shop = id_shop;
	}

	public Long getId_country() {
		return id_country;
	}

	public void setId_country(Long id_country) {
		this.id_country = id_country;
	}

	public Long getId_currency() {
		return id_currency;
	}

	public void setId_currency(Long id_currency) {
		this.id_currency = id_currency;
	}

	public Long getId_group() {
		return id_group;
	}

	public void setId_group(Long id_group) {
		this.id_group = id_group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFrom_quantity() {
		return from_quantity;
	}

	public void setFrom_quantity(Integer from_quantity) {
		this.from_quantity = from_quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReduction() {
		return reduction;
	}

	public void setReduction(String reduction) {
		this.reduction = reduction;
	}

	public byte getReduction_tax() {
		return reduction_tax;
	}

	public void setReduction_tax(byte reduction_tax) {
		this.reduction_tax = reduction_tax;
	}

	public String getReduction_type() {
		return reduction_type;
	}

	public void setReduction_type(String reduction_type) {
		this.reduction_type = reduction_type;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "SpecificPriceRule [href=" + href + ", id=" + id + ", id_shop=" + id_shop + ", id_country=" + id_country
				+ ", id_currency=" + id_currency + ", id_group=" + id_group + ", name=" + name + ", from_quantity="
				+ from_quantity + ", price=" + price + ", reduction=" + reduction + ", reduction_tax=" + reduction_tax
				+ ", reduction_type=" + reduction_type + ", from=" + from + ", to=" + to + "]";
	}


}
