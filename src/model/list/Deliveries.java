package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Delivery;

@JacksonXmlRootElement(localName = "deliveries")
public class Deliveries {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Delivery> delivery;

	public List<Delivery> getDelivery() {
		return delivery;
	}

	public void setDelivery(List<Delivery> delivery) {
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return "Deliveries [delivery=" + delivery + "]";
	}


}
