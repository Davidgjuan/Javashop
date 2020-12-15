package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Stock;
import model.StockMovement;
import model.StockMovementReason;
import model.Store;
import model.Supplier;
import model.SupplyOrderDetail;
import model.SupplyOrderHistory;
import model.SupplyOrderReceiptHistory;
import model.SupplyOrderState;
import model.Tag;

@JacksonXmlRootElement(localName = "tags")
public class Tags {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Tag> tag;

	public List<Tag> getTag() {
		return tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Tags [tag=" + tag + "]";
	}

	
	
}	
