package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Manufacturer;
import model.Message;
import model.Order;
import model.OrderCarrier;
import model.OrderCartRule;
import model.OrderDetail;
import model.OrderHistory;
import model.OrderInvoice;
import model.OrderPayment;
import model.OrderSlip;
import model.OrderState;

@JacksonXmlRootElement(localName = "orders")
public class Orders {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Order> order;

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderStates [order=" + order + "]";
	}

	
	
}
