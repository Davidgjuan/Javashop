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

@JacksonXmlRootElement(localName = "product_suppliers")
public class ProductSuppliers {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ProductSupplier> product_supplier;

	public List<ProductSupplier> getProduct_supplier() {
		return product_supplier;
	}

	public void setProduct_supplier(List<ProductSupplier> product_supplier) {
		this.product_supplier = product_supplier;
	}

	@Override
	public String toString() {
		return "ProductSuppliers [product_supplier=" + product_supplier + "]";
	}

	

}	
