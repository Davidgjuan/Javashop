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
import model.Tag;
import model.TaxRule;
import model.TaxRuleGroup;
import model.TranslatedConfiguration;
import model.Warehouse;
import model.WarehouseProductLocation;

@JacksonXmlRootElement(localName = "warehouses")
public class Warehouses {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Warehouse> warehouse;

	public List<Warehouse> getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(List<Warehouse> warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public String toString() {
		return "Warehouses [warehouse=" + warehouse + "]";
	}



}	
