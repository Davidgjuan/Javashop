package model.auxiliar;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "associations")
public class AssociationsCustomization {

	
	@JacksonXmlElementWrapper(namespace ="customized_data_text_fields", localName = "customized_data_text_fields")
	private List<CustomizedDataTextField> customized_data_text_fields;

	@JacksonXmlElementWrapper(namespace ="customized_data_images", localName = "customized_data_images")
	private List<CustomizedDataImage> customized_data_images;
	
	public AssociationsCustomization() {
		super();
	}

	public List<CustomizedDataTextField> getCustomized_data_text_fields() {
		return customized_data_text_fields;
	}

	public void setCustomized_data_text_fields(List<CustomizedDataTextField> customized_data_text_fields) {
		this.customized_data_text_fields = customized_data_text_fields;
	}

	public List<CustomizedDataImage> getCustomized_data_images() {
		return customized_data_images;
	}

	public void setCustomized_data_images(List<CustomizedDataImage> customized_data_images) {
		this.customized_data_images = customized_data_images;
	}

	@Override
	public String toString() {
		return "AssociationsCustomization [customized_data_text_fields=" + customized_data_text_fields
				+ ", customized_data_images=" + customized_data_images + "]";
	}
	
}
