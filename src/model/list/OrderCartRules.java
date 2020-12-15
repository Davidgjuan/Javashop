package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Manufacturer;
import model.Message;
import model.OrderCarrier;
import model.OrderCartRule;

@JacksonXmlRootElement(localName = "order_cart_rules")
public class OrderCartRules {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderCartRule> order_cart_rule;

	public List<OrderCartRule> getOrder_cart_rule() {
		return order_cart_rule;
	}

	public void setOrder_cart_rule(List<OrderCartRule> order_cart_rule) {
		this.order_cart_rule = order_cart_rule;
	}

	@Override
	public String toString() {
		return "OrderCartRules [order_cart_rule=" + order_cart_rule + "]";
	}

	

}
