package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsCustomer {

	
	@JacksonXmlElementWrapper(namespace ="groups", localName = "groups")
	private List<Group> group;

	public AssociationsCustomer() {
		super();
	}

	public List<Group> getGroup() {
		return group;
	}

	public void setGroup(List<Group> group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "AssociationsCustomer [group=" + group + "]";
	}
	
}
