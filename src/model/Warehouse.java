package model;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsSupplyOrder;
import model.auxiliar.AssociationsWarehouse; 

@JacksonXmlRootElement(localName = "warehouse")
public class Warehouse implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private Long id_address;
	private Long id_employee;
	private Long id_currency;
	private String valuation;
	private byte deleted;
	private String reference;
	private String name;
	private String management_type;
	private AssociationsWarehouse associations;
	
	private static final long serialVersionUID = 3916167748882494558L;

	public Warehouse() {
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

	public Long getId_address() {
		return id_address;
	}

	public void setId_address(Long id_address) {
		this.id_address = id_address;
	}

	public Long getId_employee() {
		return id_employee;
	}

	public void setId_employee(Long id_employee) {
		this.id_employee = id_employee;
	}

	public Long getId_currency() {
		return id_currency;
	}

	public void setId_currency(Long id_currency) {
		this.id_currency = id_currency;
	}

	public String getValuation() {
		return valuation;
	}

	public void setValuation(String valuation) {
		this.valuation = valuation;
	}

	public byte getDeleted() {
		return deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagement_type() {
		return management_type;
	}

	public void setManagement_type(String management_type) {
		this.management_type = management_type;
	}

	public AssociationsWarehouse getAssociations() {
		return associations;
	}

	public void setAssociations(AssociationsWarehouse associations) {
		this.associations = associations;
	}

	@Override
	public String toString() {
		return "Warehouse [href=" + href + ", id=" + id + ", id_address=" + id_address + ", id_employee=" + id_employee
				+ ", id_currency=" + id_currency + ", valuation=" + valuation + ", deleted=" + deleted + ", reference="
				+ reference + ", name=" + name + ", management_type=" + management_type + ", associations="
				+ associations + "]";
	}

}
