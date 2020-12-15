package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;
import model.Currency;
import model.CustomerMessage;
import model.CustomerThread;

@JacksonXmlRootElement(localName = "customer_threads")
public class CustomerThreads {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<CustomerThread> customer_thread;

	public List<CustomerThread> getCustomer_thread() {
		return customer_thread;
	}

	public void setCustomer_message(List<CustomerThread> customer_thread) {
		this.customer_thread = customer_thread;
	}

	@Override
	public String toString() {
		return "CustomerThreads [customer_thread=" + customer_thread + "]";
	}

}
