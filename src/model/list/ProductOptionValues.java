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
import model.ProductFeatureValue;
import model.ProductOptionValue;

@JacksonXmlRootElement(localName = "product_option_values")
public class ProductOptionValues {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ProductOptionValue> product_option_value;

	public List<ProductOptionValue> getProduct_option_value() {
		return product_option_value;
	}

	public void setProduct_option_value(List<ProductOptionValue> product_option_value) {
		this.product_option_value = product_option_value;
	}

	@Override
	public String toString() {
		return "ProductOptionValues [product_option_value=" + product_option_value + "]";
	}

	

}
