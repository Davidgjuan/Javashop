package model;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement; 

@JacksonXmlRootElement(localName = "weight_range")
public class WeightRange implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private Long id;
	private String id_carrier;
	private Float delimiter1;
	private Float delimiter2;
	
	private static final long serialVersionUID = 3916167748882494558L;

	public WeightRange() {
		super();
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_carrier() {
		return id_carrier;
	}

	public void setId_carrier(String id_carrier) {
		this.id_carrier = id_carrier;
	}

	public Float getDelimiter1() {
		return delimiter1;
	}

	public void setDelimiter1(Float delimiter1) {
		this.delimiter1 = delimiter1;
	}

	public Float getDelimiter2() {
		return delimiter2;
	}

	public void setDelimiter2(Float delimiter2) {
		this.delimiter2 = delimiter2;
	}

	@Override
	public String toString() {
		return "WeightRange [href=" + href + ", id=" + id + ", id_carrier=" + id_carrier + ", delimiter1=" + delimiter1
				+ ", delimiter2=" + delimiter2 + "]";
	}

}
