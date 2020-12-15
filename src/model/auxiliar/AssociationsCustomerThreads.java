package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Category;
import model.CustomerMessage;
import model.Product;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsCustomerThreads {

	
	@JacksonXmlElementWrapper(namespace ="customer_messages", localName = "customer_messages")
	private List<CustomerMessage> customerMessage;
	
	
	public AssociationsCustomerThreads() {
		super();
	}


	public List<CustomerMessage> getCustomerMessage() {
		return customerMessage;
	}


	public void setCustomerMessage(List<CustomerMessage> customerMessage) {
		this.customerMessage = customerMessage;
	}


	@Override
	public String toString() {
		return "AssociationsCustomerThreads [customerMessage=" + customerMessage + "]";
	}

	

}
