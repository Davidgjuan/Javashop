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

@JacksonXmlRootElement(localName = "shop_urls")
public class ShopUrls {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ShopUrl> shop_url;

	public List<ShopUrl> getShop_url() {
		return shop_url;
	}

	public void setShop_url(List<ShopUrl> shop_url) {
		this.shop_url = shop_url;
	}

	@Override
	public String toString() {
		return "ShopUrls [shop_url=" + shop_url + "]";
	}

}	
