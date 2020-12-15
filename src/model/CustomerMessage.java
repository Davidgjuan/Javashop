package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsCart;
import model.auxiliar.Language;

@JacksonXmlRootElement(localName = "customer_message")
public class CustomerMessage implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String id_employee;
	 private String id_customer_thread;
	 private String ip_address;
	 private String message;
	 private String file_name;
	 private String user_agent;
	 @JacksonXmlProperty(namespace = "private", localName = "privateProp")
	 private String privateProp;
	 private String date_add;
	 private String date_upd;
	 private String read;
	

	private static final long serialVersionUID = 7299349908202209532L;
	
	public CustomerMessage() {
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

	public String getId_employee() {
		return id_employee;
	}

	public void setId_employee(String id_employee) {
		this.id_employee = id_employee;
	}

	public String getId_customer_thread() {
		return id_customer_thread;
	}

	public void setId_customer_thread(String id_customer_thread) {
		this.id_customer_thread = id_customer_thread;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getUser_agent() {
		return user_agent;
	}

	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}

	public String getPrivateProp() {
		return privateProp;
	}

	public void setPrivateProp(String privateProp) {
		this.privateProp = privateProp;
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

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CustomerMessage [href=" + href + ", id=" + id + ", id_employee=" + id_employee + ", id_customer_thread="
				+ id_customer_thread + ", ip_address=" + ip_address + ", message=" + message + ", file_name="
				+ file_name + ", user_agent=" + user_agent + ", privateProp=" + privateProp + ", date_add=" + date_add
				+ ", date_upd=" + date_upd + ", read=" + read + "]";
	}

}
