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
import model.WeightRange;
import model.Zone;

@JacksonXmlRootElement(localName = "zones")
public class Zones {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Zone> zone;

	public List<Zone> getZone() {
		return zone;
	}

	public void setZone(List<Zone> zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Zones [zone=" + zone + "]";
	}

}	
