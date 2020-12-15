package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Manufacturer;
import model.Message;
import model.OrderCarrier;

@JacksonXmlRootElement(localName = "order_carriers")
public class OrderCarriers {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderCarrier> order_carrier;

	public List<OrderCarrier> getOrder_carrier() {
		return order_carrier;
	}

	public void setOrder_carrier(List<OrderCarrier> order_carrier) {
		this.order_carrier = order_carrier;
	}

	@Override
	public String toString() {
		return "OrderCarriers [order_carrier=" + order_carrier + "]";
	}

}
