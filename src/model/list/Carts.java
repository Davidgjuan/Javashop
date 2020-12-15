package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;

@JacksonXmlRootElement(localName = "carts")
public class Carts {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Cart> cart;

	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Carts [cart=" + cart + "]";
	}

}
