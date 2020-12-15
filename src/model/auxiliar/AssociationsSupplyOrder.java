package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsSupplyOrder {

	
	@JacksonXmlElementWrapper(namespace ="supply_order_details", localName = "supply_order_details")
	private List<SupplyOrderDetail> supply_order_detail;

	public AssociationsSupplyOrder() {
		super();
	}

	public List<SupplyOrderDetail> getSupply_order_detail() {
		return supply_order_detail;
	}

	public void setSupply_order_detail(List<SupplyOrderDetail> supply_order_detail) {
		this.supply_order_detail = supply_order_detail;
	}

	@Override
	public String toString() {
		return "AssociationsSupplyOrder [supply_order_detail=" + supply_order_detail + "]";
	}	

}
