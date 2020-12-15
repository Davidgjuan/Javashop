package request;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import calls.AddressCall;
import connection.HttpConnection;
import exceptions.TokenException;
import exceptions.WebserviceException;
import model.Address;
import model.PrestashopWrapper;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class AddressRequest implements InterfaceRequest<Address> {

	private AddressCall addressCall;
	private static final String ENDPOINT = "addresses";
	
	
	public AddressRequest() {
		addressCall = new AddressCall();
	}
	
	@Override
	public Address get(long id) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest(id).build();

			return addressCall.getCallId(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Address post(Address address) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			PrestashopWrapper wrapper = new PrestashopWrapper(address);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.postRequest(body).build();
			
			return addressCall.post(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Address put(Address address) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			
			
			PrestashopWrapper wrapper = new PrestashopWrapper(address);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.putRequest(body).build();
			
			return addressCall.put(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void delete(long id) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			Request request = con.deleteRequest(id).build();
			
			addressCall.delete(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<Address> get() {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest().build();

			return addressCall.getCall(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
	}
	
}
