package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.CustomizationField;
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
import model.PriceRange;

@JacksonXmlRootElement(localName = "customization_fields")
public class CustomizationFields {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<CustomizationField> customization_field;

	public List<CustomizationField> getCustomization_field() {
		return customization_field;
	}

	public void setCustomization_field(List<CustomizationField> customization_field) {
		this.customization_field = customization_field;
	}

	@Override
	public String toString() {
		return "CustomizationFields [customization_field=" + customization_field + "]";
	}
	
	
}
