package model.list;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.Cart;
import model.Content;

@JacksonXmlRootElement(localName = "content_management_system")
public class Contents {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Content> content;

	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Contents [content=" + content + "]";
	}

	

}
