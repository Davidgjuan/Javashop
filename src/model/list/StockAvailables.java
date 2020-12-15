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
import model.StockAvailable;

@JacksonXmlRootElement(localName = "stock_availables")
public class StockAvailables {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<StockAvailable> stock_available;

	public List<StockAvailable> getStock_available() {
		return stock_available;
	}

	public void setStock_available(List<StockAvailable> stock_available) {
		this.stock_available = stock_available;
	}

	@Override
	public String toString() {
		return "StockAvailables [stock_available=" + stock_available + "]";
	}

	
}	
