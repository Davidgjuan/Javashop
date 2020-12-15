package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Stock;
import model.StockMovement;
import model.StockMovementReason;

@JacksonXmlRootElement(localName = "stocks")
public class Stocks {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Stock> stock;

	public List<Stock> getStock() {
		return stock;
	}

	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Stocks [stock=" + stock + "]";
	}

}	
