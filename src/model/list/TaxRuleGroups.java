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
import model.TaxRuleGroup;

@JacksonXmlRootElement(localName = "tax_rule_groups")
public class TaxRuleGroups {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<TaxRuleGroup> tax_rule_group;

	public List<TaxRuleGroup> getTax_rule_group() {
		return tax_rule_group;
	}

	public void setTax_rule_group(List<TaxRuleGroup> tax_rule_group) {
		this.tax_rule_group = tax_rule_group;
	}

	@Override
	public String toString() {
		return "TaxRuleGroups [tax_rule_group=" + tax_rule_group + "]";
	}
	
}	
