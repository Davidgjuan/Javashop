package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "supply_order_history")
public class SupplyOrderReceiptHistory implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_supply_order_detail;
	private Long id_employee;
	private Long id_supply_order_state;
	private String employee_firstname;
	private String employee_lastname;
	private Integer quantity;
	private String date_add;

	 
	private static final long serialVersionUID = 3916167748882494558L;

	public SupplyOrderReceiptHistory() {
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

	public Long getId_supply_order_detail() {
		return id_supply_order_detail;
	}

	public void setId_supply_order_detail(Long id_supply_order_detail) {
		this.id_supply_order_detail = id_supply_order_detail;
	}

	public Long getId_employee() {
		return id_employee;
	}

	public void setId_employee(Long id_employee) {
		this.id_employee = id_employee;
	}

	public Long getId_supply_order_state() {
		return id_supply_order_state;
	}

	public void setId_supply_order_state(Long id_supply_order_state) {
		this.id_supply_order_state = id_supply_order_state;
	}

	public String getEmployee_firstname() {
		return employee_firstname;
	}

	public void setEmployee_firstname(String employee_firstname) {
		this.employee_firstname = employee_firstname;
	}

	public String getEmployee_lastname() {
		return employee_lastname;
	}

	public void setEmployee_lastname(String employee_lastname) {
		this.employee_lastname = employee_lastname;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	@Override
	public String toString() {
		return "SupplyOrderReceiptHistory [href=" + href + ", id=" + id + ", id_supply_order_detail="
				+ id_supply_order_detail + ", id_employee=" + id_employee + ", id_supply_order_state="
				+ id_supply_order_state + ", employee_firstname=" + employee_firstname + ", employee_lastname="
				+ employee_lastname + ", quantity=" + quantity + ", date_add=" + date_add + "]";
	}

}
