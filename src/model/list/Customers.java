package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Content;
import model.Customer;

@JacksonXmlRootElement(localName = "customers")
public class Customers {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Customer> customer;

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Customers [customer=" + customer + "]";
	}

}
