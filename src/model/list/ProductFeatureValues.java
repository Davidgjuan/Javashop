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

@JacksonXmlRootElement(localName = "product_feature_values")
public class ProductFeatureValues {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ProductFeatureValue> product_feature_value;

	public List<ProductFeatureValue> getProduct_feature_value() {
		return product_feature_value;
	}

	public void setProduct_feature_value(List<ProductFeatureValue> product_feature_value) {
		this.product_feature_value = product_feature_value;
	}

	@Override
	public String toString() {
		return "ProductFeatureValues [product_feature_value=" + product_feature_value + "]";
	}

}
