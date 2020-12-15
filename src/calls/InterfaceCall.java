package calls;

import java.io.IOException;
import java.util.List;

import exceptions.TokenException;
import exceptions.WebserviceException;
import okhttp3.Request;

public interface InterfaceCall<E> {

	public E getCallId(Request request) throws IOException, TokenException, WebserviceException;
	public List<E> getCall(Request request) throws TokenException, IOException, WebserviceException;
	public E post(Request request) throws IOException, TokenException, WebserviceException;
	public E put(Request request) throws TokenException, IOException, WebserviceException;
	public void delete(Request request) throws TokenException, IOException, WebserviceException;
	
}