package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.AssociationsCustomer;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "customer")
public class Customer implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String id_default_group;
	 private String id_lang;
	 private String newsletter_date_add;
	 private String ip_registration_newsletter;
	 private String last_passwd_gen;
	 private String secure_key;
	 private String deleted;
	 private String passwd;
	 private String lastname;
	 private String firstname;
	 private String email;
	 private String id_gender;
	 private String birthday;
	 private String newsletter;
	 private String optin;
	 private String website;
	 private String company;
	 private String siret;
	 private String ape;
	 private String outstanding_allow_amount;
	 private String show_public_prices;
	 private String id_risk;
	 private String max_payment_days;
	 private String active;
	 private String note;
	 private String is_guest;
	 private String id_shop;
	 private String id_shop_group;
	 private String date_add;
	 private String date_upd;
	 private String reset_password_token;
	 private String reset_password_validity;
	 private AssociationsCustomer associations;

	private static final long serialVersionUID = 7299349908202209532L;
	
	public Customer() {
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

	public String getId_default_group() {
		return id_default_group;
	}

	public void setId_default_group(String id_default_group) {
		this.id_default_group = id_default_group;
	}

	public String getId_lang() {
		return id_lang;
	}

	public void setId_lang(String id_lang) {
		this.id_lang = id_lang;
	}

	public String getNewsletter_date_add() {
		return newsletter_date_add;
	}

	public void setNewsletter_date_add(String newsletter_date_add) {
		this.newsletter_date_add = newsletter_date_add;
	}

	public String getIp_registration_newsletter() {
		return ip_registration_newsletter;
	}

	public void setIp_registration_newsletter(String ip_registration_newsletter) {
		this.ip_registration_newsletter = ip_registration_newsletter;
	}

	public String getLast_passwd_gen() {
		return last_passwd_gen;
	}

	public void setLast_passwd_gen(String last_passwd_gen) {
		this.last_passwd_gen = last_passwd_gen;
	}

	public String getSecure_key() {
		return secure_key;
	}

	public void setSecure_key(String secure_key) {
		this.secure_key = secure_key;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId_gender() {
		return id_gender;
	}

	public void setId_gender(String id_gender) {
		this.id_gender = id_gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(String newsletter) {
		this.newsletter = newsletter;
	}

	public String getOptin() {
		return optin;
	}

	public void setOptin(String optin) {
		this.optin = optin;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getOutstanding_allow_amount() {
		return outstanding_allow_amount;
	}

	public void setOutstanding_allow_amount(String outstanding_allow_amount) {
		this.outstanding_allow_amount = outstanding_allow_amount;
	}

	public String getShow_public_prices() {
		return show_public_prices;
	}

	public void setShow_public_prices(String show_public_prices) {
		this.show_public_prices = show_public_prices;
	}

	public String getId_risk() {
		return id_risk;
	}

	public void setId_risk(String id_risk) {
		this.id_risk = id_risk;
	}

	public String getMax_payment_days() {
		return max_payment_days;
	}

	public void setMax_payment_days(String max_payment_days) {
		this.max_payment_days = max_payment_days;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getIs_guest() {
		return is_guest;
	}

	public void setIs_guest(String is_guest) {
		this.is_guest = is_guest;
	}

	public String getId_shop() {
		return id_shop;
	}

	public void setId_shop(String id_shop) {
		this.id_shop = id_shop;
	}

	public String getId_shop_group() {
		return id_shop_group;
	}

	public void setId_shop_group(String id_shop_group) {
		this.id_shop_group = id_shop_group;
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

	public String getReset_password_token() {
		return reset_password_token;
	}

	public void setReset_password_token(String reset_password_token) {
		this.reset_password_token = reset_password_token;
	}

	public String getReset_password_validity() {
		return reset_password_validity;
	}

	public void setReset_password_validity(String reset_password_validity) {
		this.reset_password_validity = reset_password_validity;
	}

	public AssociationsCustomer getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsCustomer associations) {
		this.associations = associations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [href=" + href + ", id=" + id + ", id_default_group=" + id_default_group + ", id_lang="
				+ id_lang + ", newsletter_date_add=" + newsletter_date_add + ", ip_registration_newsletter="
				+ ip_registration_newsletter + ", last_passwd_gen=" + last_passwd_gen + ", secure_key=" + secure_key
				+ ", deleted=" + deleted + ", passwd=" + passwd + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", email=" + email + ", id_gender=" + id_gender + ", birthday=" + birthday + ", newsletter="
				+ newsletter + ", optin=" + optin + ", website=" + website + ", company=" + company + ", siret=" + siret
				+ ", ape=" + ape + ", outstanding_allow_amount=" + outstanding_allow_amount + ", show_public_prices="
				+ show_public_prices + ", id_risk=" + id_risk + ", max_payment_days=" + max_payment_days + ", active="
				+ active + ", note=" + note + ", is_guest=" + is_guest + ", id_shop=" + id_shop + ", id_shop_group="
				+ id_shop_group + ", date_add=" + date_add + ", date_upd=" + date_upd + ", reset_password_token="
				+ reset_password_token + ", reset_password_validity=" + reset_password_validity + ", associations="
				+ associations + "]";
	}
	
}
