package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;
import model.Currency;
import model.Group;

@JacksonXmlRootElement(localName = "groups")
public class Groups {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Group> group;

	public List<Group> getGroup() {
		return group;
	}

	public void setGroup(List<Group> group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Groups [group=" + group + "]";
	}

	

}
