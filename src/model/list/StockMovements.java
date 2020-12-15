package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.StockMovement;
import model.StockMovementReason;

@JacksonXmlRootElement(namespace = "stock_mvts",localName = "stock_mvts")
public class StockMovements {

	@JacksonXmlElementWrapper(useWrapping = false, namespace = "stock_mvt", localName = "stock_mvt")
	private List<StockMovement> stock_mvt;

	public List<StockMovement> getStock_mvt() {
		return stock_mvt;
	}

	public void setStock_mvt(List<StockMovement> stock_mvt) {
		this.stock_mvt = stock_mvt;
	}

	@Override
	public String toString() {
		return "StockMovements [stock_mvt=" + stock_mvt + "]";
	}



}	
