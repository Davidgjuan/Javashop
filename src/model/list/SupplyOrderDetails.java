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

@JacksonXmlRootElement(localName = "supply_order_details")
public class SupplyOrderDetails {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<SupplyOrderDetail> supply_order_detail;

	public List<SupplyOrderDetail> getSupply_order_detail() {
		return supply_order_detail;
	}

	public void setSupply_order_detail(List<SupplyOrderDetail> supply_order_detail) {
		this.supply_order_detail = supply_order_detail;
	}

	@Override
	public String toString() {
		return "SupplyOrderDetails [supply_order_detail=" + supply_order_detail + "]";
	}

}	
