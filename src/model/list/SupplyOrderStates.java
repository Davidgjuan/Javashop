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
import model.SupplyOrderReceiptHistory;
import model.SupplyOrderState;

@JacksonXmlRootElement(localName = "supply_order_states")
public class SupplyOrderStates {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<SupplyOrderState> supply_order_state;

	public List<SupplyOrderState> getSupply_order_state() {
		return supply_order_state;
	}

	public void setSupply_order_state(List<SupplyOrderState> supply_order_state) {
		this.supply_order_state = supply_order_state;
	}

	@Override
	public String toString() {
		return "SupplyOrderStates [supply_order_state=" + supply_order_state + "]";
	}
	
}	
