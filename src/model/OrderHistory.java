package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order_history")
public class OrderHistory implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	 private Long id;
	 private String id_employee;
	 private String id_order_state;
	 private String id_order;
	 private String date_add;
	 
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

	public String getId_employee() {
		return id_employee;
	}

	public void setId_employee(String id_employee) {
		this.id_employee = id_employee;
	}

	public String getId_order_state() {
		return id_order_state;
	}

	public void setId_order_state(String id_order_state) {
		this.id_order_state = id_order_state;
	}

	public String getId_order() {
		return id_order;
	}

	public void setId_order(String id_order) {
		this.id_order = id_order;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	@Override
	public String toString() {
		return "OrderHistory [href=" + href + ", id=" + id + ", id_employee=" + id_employee + ", id_order_state="
				+ id_order_state + ", id_order=" + id_order + ", date_add=" + date_add + "]";
	}

	
}
