package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsOrderSlip {

	
	@JacksonXmlElementWrapper(namespace ="order_slip_details", localName = "order_slip_details")
	private List<OrderSlipDetail> order_slip_detail;

	public AssociationsOrderSlip() {
		super();
	}

	public List<OrderSlipDetail> getOrder_slip_detail() {
		return order_slip_detail;
	}

	public void setOrder_slip_detail(List<OrderSlipDetail> order_slip_detail) {
		this.order_slip_detail = order_slip_detail;
	}

	@Override
	public String toString() {
		return "AssociationsOrderSlip [order_slip_detail=" + order_slip_detail + "]";
	}

	

}
