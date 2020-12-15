package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsCart {

	
	@JacksonXmlElementWrapper(namespace ="cart_rows", localName = "cart_rows")
	private List<CartRow> cart_row;

	public AssociationsCart() {
		super();
	}

	public AssociationsCart(List<CartRow> cart_row) {
		super();
		this.cart_row = cart_row;
	}

	public List<CartRow> getCart_row() {
		return cart_row;
	}

	public void setCart_row(List<CartRow> cart_row) {
		this.cart_row = cart_row;
	}

	@Override
	public String toString() {
		return "Associations [cart_row=" + cart_row + "]";
	}
	
}
