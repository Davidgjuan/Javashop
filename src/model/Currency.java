package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "currency")
public class Currency implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	@XmlElementWrapper
	private List<Language> names;
	private String name;
	@XmlElementWrapper
	private List<Language> symbol;
	private String iso_code;
	private Long numeric_iso_code;
	private int precision;
	private Float conversion_rate;
	private byte deleted;
	private byte active;
	private byte unofficial;
	private byte modified;
	@XmlElementWrapper
	private List<Language> pattern;
	

	private static final long serialVersionUID = 7299349908202209532L;
	
	public Currency() {
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

	public List<Language> getNames() {
		return names;
	}

	public void setNames(List<Language> names) {
		this.names = names;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Language> getSymbol() {
		return symbol;
	}

	public void setSymbol(List<Language> symbol) {
		this.symbol = symbol;
	}

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}

	public Long getNumeric_iso_code() {
		return numeric_iso_code;
	}

	public void setNumeric_iso_code(Long numeric_iso_code) {
		this.numeric_iso_code = numeric_iso_code;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public Float getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(Float conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	public byte getDeleted() {
		return deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public byte getUnofficial() {
		return unofficial;
	}

	public void setUnofficial(byte unofficial) {
		this.unofficial = unofficial;
	}

	public byte getModified() {
		return modified;
	}

	public void setModified(byte modified) {
		this.modified = modified;
	}

	public List<Language> getPattern() {
		return pattern;
	}

	public void setPattern(List<Language> pattern) {
		this.pattern = pattern;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Currency [href=" + href + ", id=" + id + ", names=" + names + ", name=" + name + ", symbol=" + symbol
				+ ", iso_code=" + iso_code + ", numeric_iso_code=" + numeric_iso_code + ", precision=" + precision
				+ ", conversion_rate=" + conversion_rate + ", deleted=" + deleted + ", active=" + active
				+ ", unofficial=" + unofficial + ", modified=" + modified + ", pattern=" + pattern + "]";
	}
}
