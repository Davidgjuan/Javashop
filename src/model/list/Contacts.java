package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.CartRule;
import model.Contact;

@JacksonXmlRootElement(localName = "contacts")
public class Contacts {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Contact> contact;

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Contacts [contact=" + contact + "]";
	}

}
