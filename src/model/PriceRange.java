package model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.auxiliar.AssociationsManufacturer;
import model.auxiliar.AssociationsOrderDetail;
import model.auxiliar.AssociationsOrderSlip;
import model.auxiliar.Language; 

@JacksonXmlRootElement(localName = "price_range")
public class PriceRange implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	 private String id;
	 private String id_carrier;
	 private String delimiter1;
	 private String delimiter2;
	 
	private static final long serialVersionUID = 3916167748882494558L;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId_carrier() {
		return id_carrier;
	}

	public void setId_carrier(String id_carrier) {
		this.id_carrier = id_carrier;
	}

	public String getDelimiter1() {
		return delimiter1;
	}

	public void setDelimiter1(String delimiter1) {
		this.delimiter1 = delimiter1;
	}

	public String getDelimiter2() {
		return delimiter2;
	}

	public void setDelimiter2(String delimiter2) {
		this.delimiter2 = delimiter2;
	}

	@Override
	public String toString() {
		return "PriceRange [href=" + href + ", id=" + id + ", id_carrier=" + id_carrier + ", delimiter1=" + delimiter1
				+ ", delimiter2=" + delimiter2 + "]";
	}

	
}
