package model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "language")
public class Language implements Serializable {

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;

	 private String id;
	 private String name;
	 private String iso_code;
	 private String locale;
	 private String language_code;
	 private byte active;
	 private byte is_rtl;
	 private String date_format_lite;
	 private String date_format_full;
	
	private static final long serialVersionUID = -6119982128062394491L;
	
	public Language() {
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

	public String getIso_code() {
		return iso_code;
	}

	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getLanguage_code() {
		return language_code;
	}

	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public byte getIs_rtl() {
		return is_rtl;
	}

	public void setIs_rtl(byte is_rtl) {
		this.is_rtl = is_rtl;
	}

	public String getDate_format_lite() {
		return date_format_lite;
	}

	public void setDate_format_lite(String date_format_lite) {
		this.date_format_lite = date_format_lite;
	}

	public String getDate_format_full() {
		return date_format_full;
	}

	public void setDate_format_full(String date_format_full) {
		this.date_format_full = date_format_full;
	}

	@Override
	public String toString() {
		return "Language [href=" + href + ", id=" + id + ", name=" + name + ", iso_code=" + iso_code + ", locale="
				+ locale + ", language_code=" + language_code + ", active=" + active + ", is_rtl=" + is_rtl
				+ ", date_format_lite=" + date_format_lite + ", date_format_full=" + date_format_full + "]";
	}
	
}
