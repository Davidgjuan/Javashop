package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "supply_order_state")
public class SupplyOrderState implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private byte delivery_note;
	 private byte editable;
	 private byte receipt_state;
	 private byte pending_receipt;
	 private byte enclosed;
	 private String color;
	 @XmlElementWrapper
	 private List<Language> name;
	 
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public SupplyOrderState() {
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

	public byte getDelivery_note() {
		return delivery_note;
	}

	public void setDelivery_note(byte delivery_note) {
		this.delivery_note = delivery_note;
	}

	public byte getEditable() {
		return editable;
	}

	public void setEditable(byte editable) {
		this.editable = editable;
	}

	public byte getReceipt_state() {
		return receipt_state;
	}

	public void setReceipt_state(byte receipt_state) {
		this.receipt_state = receipt_state;
	}

	public byte getPending_receipt() {
		return pending_receipt;
	}

	public void setPending_receipt(byte pending_receipt) {
		this.pending_receipt = pending_receipt;
	}

	public byte getEnclosed() {
		return enclosed;
	}

	public void setEnclosed(byte enclosed) {
		this.enclosed = enclosed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SupplyOrderState [href=" + href + ", id=" + id + ", delivery_note=" + delivery_note + ", editable="
				+ editable + ", receipt_state=" + receipt_state + ", pending_receipt=" + pending_receipt + ", enclosed="
				+ enclosed + ", color=" + color + ", name=" + name + "]";
	}

}
