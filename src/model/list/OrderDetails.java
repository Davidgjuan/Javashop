package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Manufacturer;
import model.Message;
import model.OrderCarrier;
import model.OrderCartRule;
import model.OrderDetail;

@JacksonXmlRootElement(localName = "order_details")
public class OrderDetails {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderDetail> order_detail;

	public List<OrderDetail> getOrder_detail() {
		return order_detail;
	}

	public void setOrder_detail(List<OrderDetail> order_detail) {
		this.order_detail = order_detail;
	}

	@Override
	public String toString() {
		return "OrderDetails [order_detail=" + order_detail + "]";
	}

}
