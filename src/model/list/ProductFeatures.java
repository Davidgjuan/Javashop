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

@JacksonXmlRootElement(localName = "product_features")
public class ProductFeatures {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ProductFeature> product_feature;

	public List<ProductFeature> getProduct_feature() {
		return product_feature;
	}

	public void setProduct_feature(List<ProductFeature> product_feature) {
		this.product_feature = product_feature;
	}

	@Override
	public String toString() {
		return "ProductFeatures [product_feature=" + product_feature + "]";
	}

	
}	
