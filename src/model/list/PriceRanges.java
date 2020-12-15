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

@JacksonXmlRootElement(localName = "price_ranges")
public class PriceRanges {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<PriceRange> price_range;

	public List<PriceRange> getPrice_range() {
		return price_range;
	}

	public void setPrice_range(List<PriceRange> price_range) {
		this.price_range = price_range;
	}

	@Override
	public String toString() {
		return "PrinceRanges [price_range=" + price_range + "]";
	}

	
		
	
	
}
