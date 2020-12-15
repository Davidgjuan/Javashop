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
import model.SpecificPrice;
import model.SpecificPriceRule;

@JacksonXmlRootElement(localName = "specific_prices")
public class SpecificPrices {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<SpecificPrice> specific_price;

	public List<SpecificPrice> getSpecific_price() {
		return specific_price;
	}

	public void setSpecific_price(List<SpecificPrice> specific_price) {
		this.specific_price = specific_price;
	}

	@Override
	public String toString() {
		return "SpecificPrices [specific_price=" + specific_price + "]";
	}

	

}	
