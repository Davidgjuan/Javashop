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

@JacksonXmlRootElement(localName = "product_options")
public class ProductOptions {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ProductOption> product_option;

	public List<ProductOption> getProduct_option() {
		return product_option;
	}

	public void setProduct_option(List<ProductOption> product_option) {
		this.product_option = product_option;
	}

	@Override
	public String toString() {
		return "ProductOptions [product_option=" + product_option + "]";
	}

}	
