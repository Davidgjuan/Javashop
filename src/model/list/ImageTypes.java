package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Country;
import model.Currency;
import model.Group;
import model.ImageType;

@JacksonXmlRootElement(localName = "image_types")
public class ImageTypes {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<ImageType> image_type;

	public List<ImageType> getImage_type() {
		return image_type;
	}

	public void setImage_type(List<ImageType> image_type) {
		this.image_type = image_type;
	}

	@Override
	public String toString() {
		return "ImageTypes [image_type=" + image_type + "]";
	}

}
