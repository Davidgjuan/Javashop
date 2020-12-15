package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Combination;

@JacksonXmlRootElement(localName = "combinations")
public class Combinations {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Combination> combination;

	public List<Combination> getCombination() {
		return combination;
	}

	public void setCombination(List<Combination> combination) {
		this.combination = combination;
	}

	@Override
	public String toString() {
		return "Combinations [combination=" + combination + "]";
	}

}
