package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Stock;
import model.StockMovement;
import model.StockMovementReason;
import model.Store;
import model.Supplier;

@JacksonXmlRootElement(localName = "suppliers")
public class Suppliers {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Supplier> supplier;

	public List<Supplier> getSupplier() {
		return supplier;
	}

	public void setSupplier(List<Supplier> supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Suppliers [supplier=" + supplier + "]";
	}

	

}	
