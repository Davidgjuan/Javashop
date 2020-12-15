package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Manufacturer;
import model.Message;
import model.OrderCarrier;
import model.OrderCartRule;
import model.OrderDetail;
import model.OrderHistory;
import model.OrderInvoice;
import model.OrderPayment;
import model.OrderSlip;
import model.OrderState;
import model.PriceRange;
import model.ProductFeature;
import model.ProductFeatureValue;
import model.ProductOption;
import model.ProductSupplier;
import model.ShopGroup;
import model.ShopUrl;
import model.SpecificPriceRule;

@JacksonXmlRootElement(localName = "specific_price_rules")
public class SpecificPriceRules {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<SpecificPriceRule> specific_price_rule;

	public List<SpecificPriceRule> getSpecific_price_rule() {
		return specific_price_rule;
	}

	public void setSpecific_price_rule(List<SpecificPriceRule> specific_price_rule) {
		this.specific_price_rule = specific_price_rule;
	}

	@Override
	public String toString() {
		return "SpecificPriceRules [specific_price_rule=" + specific_price_rule + "]";
	}

	

}	
