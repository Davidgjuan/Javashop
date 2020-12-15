package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.CartRule;

@JacksonXmlRootElement(namespace = "cart_rules",localName = "cart_rules")
public class CartRules {

	@JacksonXmlElementWrapper(useWrapping = false, namespace = "cart_rule", localName = "cartRule")
	private List<CartRule> cart_rule;

	public List<CartRule> getCart_rule() {
		return cart_rule;
	}

	public void setCartRule(List<CartRule> cartRule) {
		this.cart_rule = cartRule;
	}

	@Override
	public String toString() {
		return "CartRules [cart_rule=" + cart_rule + "]";
	}

}
