package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "store")
public class Store implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	
	private Long id;
	private String id_country;
	private String id_state;
	@XmlElementWrapper
	private List<Language> hours;
	private String postcode;
	private String city;
	private String latitude;
	private String longitude;
	private String phone;
	private String fax;
	private String email;
	private byte active;
	private String date_add;
	private String date_upd;
	@XmlElementWrapper
	private List<Language> name;
	@XmlElementWrapper
	private List<Language> address1;
	@XmlElementWrapper
	private List<Language> address2;
	@XmlElementWrapper
	private List<Language> note;

	 
	private static final long serialVersionUID = 3916167748882494558L;

	public Store() {
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

	public String getId_country() {
		return id_country;
	}

	public void setId_country(String id_country) {
		this.id_country = id_country;
	}

	public String getId_state() {
		return id_state;
	}

	public void setId_state(String id_state) {
		this.id_state = id_state;
	}

	public List<Language> getHours() {
		return hours;
	}

	public void setHours(List<Language> hours) {
		this.hours = hours;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
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

	public List<Language> getAddress1() {
		return address1;
	}

	public void setAddress1(List<Language> address1) {
		this.address1 = address1;
	}

	public List<Language> getAddress2() {
		return address2;
	}

	public void setAddress2(List<Language> address2) {
		this.address2 = address2;
	}

	public List<Language> getNote() {
		return note;
	}

	public void setNote(List<Language> note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Store [href=" + href + ", id=" + id + ", id_country=" + id_country + ", id_state=" + id_state
				+ ", hours=" + hours + ", postcode=" + postcode + ", city=" + city + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", phone=" + phone + ", fax=" + fax + ", email=" + email + ", active="
				+ active + ", date_add=" + date_add + ", date_upd=" + date_upd + ", name=" + name + ", address1="
				+ address1 + ", address2=" + address2 + ", note=" + note + "]";
	}

}
