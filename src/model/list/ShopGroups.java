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

@JacksonXmlRootElement(localName = "shop_groups")
public class ShopGroups {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ShopGroup> shop_group;

	public List<ShopGroup> getShop_group() {
		return shop_group;
	}

	public void setShop_group(List<ShopGroup> shop_group) {
		this.shop_group = shop_group;
	}

	@Override
	public String toString() {
		return "ShopGroups [shop_group=" + shop_group + "]";
	}



}	
