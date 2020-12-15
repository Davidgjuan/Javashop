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

@JacksonXmlRootElement(localName = "order_invoices")
public class OrderInvoices {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<OrderInvoice> order_invoice;

	public List<OrderInvoice> getOrder_invoice() {
		return order_invoice;
	}

	public void setOrder_invoice(List<OrderInvoice> order_invoice) {
		this.order_invoice = order_invoice;
	}

	@Override
	public String toString() {
		return "OrderInvoices [order_invoice=" + order_invoice + "]";
	}

	

}
