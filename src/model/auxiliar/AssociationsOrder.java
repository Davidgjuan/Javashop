package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsOrder {

	
	@JacksonXmlElementWrapper(namespace ="order_rows", localName = "order_rows")
	private List<OrderRow> order_row;

	public AssociationsOrder() {
		super();
	}

	public List<OrderRow> getOrder_row() {
		return order_row;
	}

	public void setOrder_row(List<OrderRow> order_row) {
		this.order_row = order_row;
	}

	@Override
	public String toString() {
		return "AssociationsOrder [order_row=" + order_row + "]";
	}

}
