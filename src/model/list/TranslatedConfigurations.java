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

@JacksonXmlRootElement(localName = "translated_configurations")
public class TranslatedConfigurations {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<TranslatedConfiguration> translated_configuration;

	public List<TranslatedConfiguration> getTranslated_configuration() {
		return translated_configuration;
	}

	public void setTranslated_configuration(List<TranslatedConfiguration> translated_configuration) {
		this.translated_configuration = translated_configuration;
	}

	@Override
	public String toString() {
		return "TranslatedConfigurations [translated_configuration=" + translated_configuration + "]";
	}

}	
