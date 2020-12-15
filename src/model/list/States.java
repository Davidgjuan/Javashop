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
import model.State;

@JacksonXmlRootElement(localName = "states")
public class States {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<State> state;

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "States [state=" + state + "]";
	}

}	
