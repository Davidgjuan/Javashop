package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;
import model.Currency;
import model.CustomerMessage;

@JacksonXmlRootElement(localName = "customer_messages")
public class CustomerMessages {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<CustomerMessage> customer_message;

	public List<CustomerMessage> getCustomer_message() {
		return customer_message;
	}

	public void setCustomer_message(List<CustomerMessage> customer_message) {
		this.customer_message = customer_message;
	}

	@Override
	public String toString() {
		return "CustomerMessages [customer_message=" + customer_message + "]";
	}

}
