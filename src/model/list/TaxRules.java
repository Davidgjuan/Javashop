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

@JacksonXmlRootElement(localName = "tax_rules")
public class TaxRules {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<TaxRule> tax_rule;

	public List<TaxRule> getTax_rule() {
		return tax_rule;
	}

	public void setTax_rule(List<TaxRule> tax_rule) {
		this.tax_rule = tax_rule;
	}

	@Override
	public String toString() {
		return "TaxRules [tax_rule=" + tax_rule + "]";
	}

	
	
}	
