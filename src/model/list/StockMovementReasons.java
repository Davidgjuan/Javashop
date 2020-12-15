package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.StockMovementReason;

@JacksonXmlRootElement(localName = "stock_movement_reasons")
public class StockMovementReasons {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<StockMovementReason> stock_movement_reason;

	public List<StockMovementReason> getStock_movement_reason() {
		return stock_movement_reason;
	}

	public void setStock_movement_reason(List<StockMovementReason> stock_movement_reason) {
		this.stock_movement_reason = stock_movement_reason;
	}

	@Override
	public String toString() {
		return "StockMovementReasons [stock_movement_reason=" + stock_movement_reason + "]";
	}

	
	
}	
