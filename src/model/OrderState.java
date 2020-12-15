package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.AssociationsOrderSlip;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order_state")
public class OrderState implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private byte unremovable;
	private byte delivery;
	private byte hidden;
	private byte send_email;
	private String module_name;
	private byte invoice;
	private String color;
	private byte logable;
	private byte shipped;
	private byte paid;
	private byte pdf_delivery;
	private byte pdf_invoice;
	private byte deleted;
	@XmlElementWrapper
	private List<Language> name;
	@XmlElementWrapper
	private List<Language> template;
	 
	private static final long serialVersionUID = 3916167748882494558L;

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

	public byte getUnremovable() {
		return unremovable;
	}

	public void setUnremovable(byte unremovable) {
		this.unremovable = unremovable;
	}

	public byte getDelivery() {
		return delivery;
	}

	public void setDelivery(byte delivery) {
		this.delivery = delivery;
	}

	public byte getHidden() {
		return hidden;
	}

	public void setHidden(byte hidden) {
		this.hidden = hidden;
	}

	public byte getSend_email() {
		return send_email;
	}

	public void setSend_email(byte send_email) {
		this.send_email = send_email;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public byte getInvoice() {
		return invoice;
	}

	public void setInvoice(byte invoice) {
		this.invoice = invoice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getLogable() {
		return logable;
	}

	public void setLogable(byte logable) {
		this.logable = logable;
	}

	public byte getShipped() {
		return shipped;
	}

	public void setShipped(byte shipped) {
		this.shipped = shipped;
	}

	public byte getPaid() {
		return paid;
	}

	public void setPaid(byte paid) {
		this.paid = paid;
	}

	public byte getPdf_delivery() {
		return pdf_delivery;
	}

	public void setPdf_delivery(byte pdf_delivery) {
		this.pdf_delivery = pdf_delivery;
	}

	public byte getPdf_invoice() {
		return pdf_invoice;
	}

	public void setPdf_invoice(byte pdf_invoice) {
		this.pdf_invoice = pdf_invoice;
	}

	public byte getDeleted() {
		return deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public List<Language> getName() {
		return name;
	}

	public void setName(List<Language> name) {
		this.name = name;
	}

	public List<Language> getTemplate() {
		return template;
	}

	public void setTemplate(List<Language> template) {
		this.template = template;
	}

	@Override
	public String toString() {
		return "OrderState [href=" + href + ", id=" + id + ", unremovable=" + unremovable + ", delivery=" + delivery
				+ ", hidden=" + hidden + ", send_email=" + send_email + ", module_name=" + module_name + ", invoice="
				+ invoice + ", color=" + color + ", logable=" + logable + ", shipped=" + shipped + ", paid=" + paid
				+ ", pdf_delivery=" + pdf_delivery + ", pdf_invoice=" + pdf_invoice + ", deleted=" + deleted + ", name="
				+ name + ", template=" + template + "]";
	}
	
	
	
}
