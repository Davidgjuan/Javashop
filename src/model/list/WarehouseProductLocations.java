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
import model.WarehouseProductLocation;

@JacksonXmlRootElement(localName = "warehouse_product_locations")
public class WarehouseProductLocations {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<WarehouseProductLocation> warehouse_product_location;

	public List<WarehouseProductLocation> getWarehouse_product_location() {
		return warehouse_product_location;
	}

	public void setWarehouse_product_location(List<WarehouseProductLocation> warehouse_product_location) {
		this.warehouse_product_location = warehouse_product_location;
	}

	@Override
	public String toString() {
		return "WarehouseProductLocations [warehouse_product_location=" + warehouse_product_location + "]";
	}

}	
