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

@JacksonXmlRootElement(localName = "supply_order_receipt_histories")
public class SupplyOrderReceiptHistories {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<SupplyOrderReceiptHistory> supply_order_receipt_history;

	public List<SupplyOrderReceiptHistory> getSupply_order_receipt_history() {
		return supply_order_receipt_history;
	}

	public void setSupply_order_receipt_history(List<SupplyOrderReceiptHistory> supply_order_receipt_history) {
		this.supply_order_receipt_history = supply_order_receipt_history;
	}

	@Override
	public String toString() {
		return "SupplyOrderReceiptHistories [supply_order_receipt_history=" + supply_order_receipt_history + "]";
	}

}	
