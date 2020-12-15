package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "group")
public class Group implements Serializable {

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private float reduction;
	private float price_display_method;
	private byte show_prices;
	private String date_add;
	private String date_upd;
	@JacksonXmlElementWrapper
	private List<Language> name;
	
	private static final long serialVersionUID = -6119982128062394491L;
	
	public Group() {
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

	public float getReduction() {
		return reduction;
	}

	public void setReduction(float reduction) {
		this.reduction = reduction;
	}

	public float getPrice_display_method() {
		return price_display_method;
	}

	public void setPrice_display_method(float price_display_method) {
		this.price_display_method = price_display_method;
	}

	public byte getShow_prices() {
		return show_prices;
	}

	public void setShow_prices(byte show_prices) {
		this.show_prices = show_prices;
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

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Group [href=" + href + ", id=" + id + ", reduction=" + reduction + ", price_display_method="
				+ price_display_method + ", show_prices=" + show_prices + ", date_add=" + date_add + ", date_upd="
				+ date_upd + ", name=" + name + "]";
	}

}
