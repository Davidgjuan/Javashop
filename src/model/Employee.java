package model;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;

@JacksonXmlRootElement(localName = "employee")
public class Employee implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String id_lang;
	 private String last_passwd_gen;
	 private String stats_date_from;
	 private String stats_date_to;
	 private String stats_compare_from;
	 private String stats_compare_to;
	 private String passwd;
	 private String lastname;
	 private String firstname;
	 private String email;
	 private byte active;
	 private String optin;
	 private String id_profile;
	 private String bo_color;
	 private int default_tab;
	 private String bo_theme;
	 private String bo_css;
	 private int bo_width;
	 private byte bo_menu;
	 private String stats_compare_option;
	 private String preselect_date_range;
	 private int id_last_order;
	 private int id_last_customer_message;
	 private int id_last_customer;
	 private String reset_password_token;
	 private String reset_password_validity;
	 private byte has_enabled_gravatar;

	private static final long serialVersionUID = 7299349908202209532L;
	
	public Employee() {
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

	public String getId_lang() {
		return id_lang;
	}

	public void setId_lang(String id_lang) {
		this.id_lang = id_lang;
	}

	public String getLast_passwd_gen() {
		return last_passwd_gen;
	}

	public void setLast_passwd_gen(String last_passwd_gen) {
		this.last_passwd_gen = last_passwd_gen;
	}

	public String getStats_date_from() {
		return stats_date_from;
	}

	public void setStats_date_from(String stats_date_from) {
		this.stats_date_from = stats_date_from;
	}

	public String getStats_date_to() {
		return stats_date_to;
	}

	public void setStats_date_to(String stats_date_to) {
		this.stats_date_to = stats_date_to;
	}

	public String getStats_compare_from() {
		return stats_compare_from;
	}

	public void setStats_compare_from(String stats_compare_from) {
		this.stats_compare_from = stats_compare_from;
	}

	public String getStats_compare_to() {
		return stats_compare_to;
	}

	public void setStats_compare_to(String stats_compare_to) {
		this.stats_compare_to = stats_compare_to;
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

	public byte getActive() {
		return active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getId_profile() {
		return id_profile;
	}

	public void setId_profile(String id_profile) {
		this.id_profile = id_profile;
	}

	public String getBo_color() {
		return bo_color;
	}

	public void setBo_color(String bo_color) {
		this.bo_color = bo_color;
	}

	public int getDefault_tab() {
		return default_tab;
	}

	public void setDefault_tab(int default_tab) {
		this.default_tab = default_tab;
	}

	public String getBo_theme() {
		return bo_theme;
	}

	public void setBo_theme(String bo_theme) {
		this.bo_theme = bo_theme;
	}

	public String getBo_css() {
		return bo_css;
	}

	public void setBo_css(String bo_css) {
		this.bo_css = bo_css;
	}

	public int getBo_width() {
		return bo_width;
	}

	public void setBo_width(int bo_width) {
		this.bo_width = bo_width;
	}

	public byte getBo_menu() {
		return bo_menu;
	}

	public void setBo_menu(byte bo_menu) {
		this.bo_menu = bo_menu;
	}

	public String getStats_compare_option() {
		return stats_compare_option;
	}

	public void setStats_compare_option(String stats_compare_option) {
		this.stats_compare_option = stats_compare_option;
	}

	public String getPreselect_date_range() {
		return preselect_date_range;
	}

	public void setPreselect_date_range(String preselect_date_range) {
		this.preselect_date_range = preselect_date_range;
	}

	public int getId_last_order() {
		return id_last_order;
	}

	public void setId_last_order(int id_last_order) {
		this.id_last_order = id_last_order;
	}

	public int getId_last_customer_message() {
		return id_last_customer_message;
	}

	public void setId_last_customer_message(int id_last_customer_message) {
		this.id_last_customer_message = id_last_customer_message;
	}

	public int getId_last_customer() {
		return id_last_customer;
	}

	public void setId_last_customer(int id_last_customer) {
		this.id_last_customer = id_last_customer;
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

	public byte getHas_enabled_gravatar() {
		return has_enabled_gravatar;
	}

	public void setHas_enabled_gravatar(byte has_enabled_gravatar) {
		this.has_enabled_gravatar = has_enabled_gravatar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public String getOptin() {
		return optin;
	}

	public void setOptin(String optin) {
		this.optin = optin;
	}

	@Override
	public String toString() {
		return "Employee [href=" + href + ", id=" + id + ", id_lang=" + id_lang + ", last_passwd_gen=" + last_passwd_gen
				+ ", stats_date_from=" + stats_date_from + ", stats_date_to=" + stats_date_to + ", stats_compare_from="
				+ stats_compare_from + ", stats_compare_to=" + stats_compare_to + ", passwd=" + passwd + ", lastname="
				+ lastname + ", firstname=" + firstname + ", email=" + email + ", active=" + active + ", id_profile="
				+ id_profile + ", bo_color=" + bo_color + ", default_tab=" + default_tab + ", bo_theme=" + bo_theme
				+ ", bo_css=" + bo_css + ", bo_width=" + bo_width + ", bo_menu=" + bo_menu + ", stats_compare_option="
				+ stats_compare_option + ", preselect_date_range=" + preselect_date_range + ", id_last_order="
				+ id_last_order + ", id_last_customer_message=" + id_last_customer_message + ", id_last_customer="
				+ id_last_customer + ", reset_password_token=" + reset_password_token + ", reset_password_validity="
				+ reset_password_validity + ", has_enabled_gravatar=" + has_enabled_gravatar + "]";
	}
	
}
