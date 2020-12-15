package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Stock;
import model.StockMovement;
import model.StockMovementReason;
import model.Store;
import model.Supplier;
import model.SupplyOrderDetail;
import model.SupplyOrderHistory;

@JacksonXmlRootElement(localName = "supply_order_histories")
public class SupplyOrderHistories {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<SupplyOrderHistory> supply_order_history;

	public List<SupplyOrderHistory> getSupply_order_history() {
		return supply_order_history;
	}

	public void setSupply_order_history(List<SupplyOrderHistory> supply_order_history) {
		this.supply_order_history = supply_order_history;
	}

	@Override
	public String toString() {
		return "SupplyOrderHistories [supply_order_history=" + supply_order_history + "]";
	}

}	
