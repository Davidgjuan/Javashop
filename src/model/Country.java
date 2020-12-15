package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "country")
public class Country implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private String id_zone;
	private Long id_currency;
	private Long call_prefix;
	private String iso_code;
	private byte active;
	private byte contains_states;
	private byte need_identification_number;
	private byte need_zip_code;
	private String zip_code_format;
	private byte display_tax_label;
	@XmlElementWrapper
	private List<Language> name;
	
	
	private static final long serialVersionUID = 7299349908202209532L;
	
	public Country() {
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

	public String getId_zone() {
		return id_zone;
	}

	public void setId_zone(String id_zone) {
		this.id_zone = id_zone;
	}

	public Long getId_currency() {
		return id_currency;
	}

	public void setId_currency(Long id_currency) {
		this.id_currency = id_currency;
	}

	public Long getCall_prefix() {
		return call_prefix;
	}

	public void setCall_prefix(Long call_prefix) {
		this.call_prefix = call_prefix;
	}

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public byte getContains_states() {
		return contains_states;
	}

	public void setContains_states(byte contains_states) {
		this.contains_states = contains_states;
	}

	public byte getNeed_identification_number() {
		return need_identification_number;
	}

	public void setNeed_identification_number(byte need_identification_number) {
		this.need_identification_number = need_identification_number;
	}

	public byte getNeed_zip_code() {
		return need_zip_code;
	}

	public void setNeed_zip_code(byte need_zip_code) {
		this.need_zip_code = need_zip_code;
	}

	public String getZip_code_format() {
		return zip_code_format;
	}

	public void setZip_code_format(String zip_code_format) {
		this.zip_code_format = zip_code_format;
	}

	public byte getDisplay_tax_label() {
		return display_tax_label;
	}

	public void setDisplay_tax_label(byte display_tax_label) {
		this.display_tax_label = display_tax_label;
	}

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Country [href=" + href + ", id=" + id + ", id_zone=" + id_zone + ", id_currency=" + id_currency
				+ ", call_prefix=" + call_prefix + ", iso_code=" + iso_code + ", active=" + active
				+ ", contains_states=" + contains_states + ", need_identification_number=" + need_identification_number
				+ ", need_zip_code=" + need_zip_code + ", zip_code_format=" + zip_code_format + ", display_tax_label="
				+ display_tax_label + ", name=" + name + "]";
	}

}
