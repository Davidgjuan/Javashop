package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "translated_configuration")
public class TranslatedConfiguration implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	 
	private Long id;
	@XmlElementWrapper
	private List<Language> value;
	private String date_add;
	private String date_upd;
	private String name;
	private Long id_shop_group;
	private Long id_shop;
	
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public TranslatedConfiguration() {
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

	public List<Language> getValue() {
		return value;
	}

	public void setValue(List<Language> value) {
		this.value = value;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId_shop_group() {
		return id_shop_group;
	}

	public void setId_shop_group(Long id_shop_group) {
		this.id_shop_group = id_shop_group;
	}

	public Long getId_shop() {
		return id_shop;
	}

	public void setId_shop(Long id_shop) {
		this.id_shop = id_shop;
	}

	@Override
	public String toString() {
		return "TranslatedConfiguration [href=" + href + ", id=" + id + ", value=" + value + ", date_add=" + date_add
				+ ", date_upd=" + date_upd + ", name=" + name + ", id_shop_group=" + id_shop_group + ", id_shop="
				+ id_shop + "]";
	}

}
