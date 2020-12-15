package exceptions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "errors")
public class ErrorWrapper {

	@JacksonXmlProperty(localName = "error")
	private ErrorMessage errorMessage;
	
	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorWrapper [errorMessage=" + errorMessage + "]";
	}
	
}
