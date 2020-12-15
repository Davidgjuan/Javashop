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

@JacksonXmlRootElement(localName = "product_feature_value")
public class ProductFeatureValue implements Serializable{

	@JacksonXmlProperty(isAttribute = true, namespace = "xlink:href", localName = "href")
	private String href;
	
	private String id;
	private String id_feature;
	private byte custom;
	@XmlElementWrapper
	private List<Language> value;
	
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

	public String getId_feature() {
		return id_feature;
	}

	public void setId_feature(String id_feature) {
		this.id_feature = id_feature;
	}

	public byte getCustom() {
		return custom;
	}

	public void setCustom(byte custom) {
		this.custom = custom;
	}

	public List<Language> getValue() {
		return value;
	}

	public void setValue(List<Language> value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ProductFeatureValue [href=" + href + ", id=" + id + ", id_feature=" + id_feature + ", custom=" + custom
				+ ", value=" + value + "]";
	}

	
	
}
