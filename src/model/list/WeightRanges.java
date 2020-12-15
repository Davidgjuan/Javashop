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

@JacksonXmlRootElement(localName = "weight_ranges")
public class WeightRanges {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<WeightRange> weight_range;

	public List<WeightRange> getWeight_range() {
		return weight_range;
	}

	public void setWeight_range(List<WeightRange> weight_range) {
		this.weight_range = weight_range;
	}

	@Override
	public String toString() {
		return "WeightRanges [weight_range=" + weight_range + "]";
	}

	

}	
