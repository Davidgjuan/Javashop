package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Stock;
import model.StockMovement;
import model.StockMovementReason;
import model.Store;

@JacksonXmlRootElement(localName = "stores")
public class Stores {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Store> store;

	public List<Store> getStore() {
		return store;
	}

	public void setStore(List<Store> store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "Stores [store=" + store + "]";
	}

}	
