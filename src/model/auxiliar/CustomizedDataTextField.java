package model.auxiliar;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "customized_data_text_field")
public class CustomizedDataTextField {

	private String id_customization_field;
	private String value;

	
	public CustomizedDataTextField() {
		super();
	}


	public String getId_customization_field() {
		return id_customization_field;
	}


	public void setId_customization_field(String id_customization_field) {
		this.id_customization_field = id_customization_field;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "CustomizedDataTextField [id_customization_field=" + id_customization_field + ", value=" + value + "]";
	}	
	
	
}
