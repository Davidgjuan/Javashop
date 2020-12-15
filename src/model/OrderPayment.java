package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "order_payment")
public class OrderPayment implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String order_reference;
	 private Long id_currency;
	 private float amount;
	 private String payment_method;
	 private float conversion_rate;
	 private String transaction_id;
	 private String card_number;
	 private String card_brand;
	 private String card_expiration;
	 private String card_holder;
	 private String date_add;
	 
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

	public String getOrder_reference() {
		return order_reference;
	}

	public void setOrder_reference(String order_reference) {
		this.order_reference = order_reference;
	}

	public Long getId_currency() {
		return id_currency;
	}

	public void setId_currency(Long id_currency) {
		this.id_currency = id_currency;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public float getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(float conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getCard_brand() {
		return card_brand;
	}

	public void setCard_brand(String card_brand) {
		this.card_brand = card_brand;
	}

	public String getCard_expiration() {
		return card_expiration;
	}

	public void setCard_expiration(String card_expiration) {
		this.card_expiration = card_expiration;
	}

	public String getCard_holder() {
		return card_holder;
	}

	public void setCard_holder(String card_holder) {
		this.card_holder = card_holder;
	}

	public String getDate_add() {
		return date_add;
	}

	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	@Override
	public String toString() {
		return "OrderPayment [href=" + href + ", id=" + id + ", order_reference=" + order_reference + ", id_currency="
				+ id_currency + ", amount=" + amount + ", payment_method=" + payment_method + ", conversion_rate="
				+ conversion_rate + ", transaction_id=" + transaction_id + ", card_number=" + card_number
				+ ", card_brand=" + card_brand + ", card_expiration=" + card_expiration + ", card_holder=" + card_holder
				+ ", date_add=" + date_add + "]";
	}

	
	
}
