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

@JacksonXmlRootElement(localName = "order_slips")
public class OrderSlips {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderSlip> order_slip;

	public List<OrderSlip> getOrder_slip() {
		return order_slip;
	}

	public void setOrder_slip(List<OrderSlip> order_slip) {
		this.order_slip = order_slip;
	}

	@Override
	public String toString() {
		return "OrderSlips [order_slip=" + order_slip + "]";
	}

	
}
