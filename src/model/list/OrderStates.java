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

@JacksonXmlRootElement(localName = "order_states")
public class OrderStates {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderState> order_state;

	public List<OrderState> getOrder_state() {
		return order_state;
	}

	public void setOrder_state(List<OrderState> order_state) {
		this.order_state = order_state;
	}

	@Override
	public String toString() {
		return "OrderStates [order_state=" + order_state + "]";
	}

	
	
}
