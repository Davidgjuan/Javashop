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

@JacksonXmlRootElement(localName = "order_histories")
public class OrderHistories {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderHistory> order_history;

	public List<OrderHistory> getOrder_history() {
		return order_history;
	}

	public void setOrder_history(List<OrderHistory> order_history) {
		this.order_history = order_history;
	}

	@Override
	public String toString() {
		return "OrderHistories [order_history=" + order_history + "]";
	}

	

}
