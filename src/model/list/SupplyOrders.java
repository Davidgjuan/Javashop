package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Stock;
import model.StockMovement;
import model.StockMovementReason;
import model.Store;
import model.Supplier;
import model.SupplyOrder;
import model.SupplyOrderDetail;
import model.SupplyOrderHistory;
import model.SupplyOrderReceiptHistory;
import model.SupplyOrderState;

@JacksonXmlRootElement(localName = "supply_orders")
public class SupplyOrders {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<SupplyOrder> supply_order;

	public List<SupplyOrder> getSupply_order() {
		return supply_order;
	}

	public void setSupply_order(List<SupplyOrder> supply_order) {
		this.supply_order = supply_order;
	}

	@Override
	public String toString() {
		return "SupplyOrders [supply_order=" + supply_order + "]";
	}
	
}	
