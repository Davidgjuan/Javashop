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

@JacksonXmlRootElement(localName = "order_payments")
public class OrderPayments {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderPayment> order_payment;

	public List<OrderPayment> getOrder_payment() {
		return order_payment;
	}

	public void setOrder_payment(List<OrderPayment> order_payment) {
		this.order_payment = order_payment;
	}

	@Override
	public String toString() {
		return "OrderPayments [order_payment=" + order_payment + "]";
	}

	
	

}
