package request;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import calls.CategoryCall;
import connection.HttpConnection;
import exceptions.TokenException;
import exceptions.WebserviceException;
import model.Category;
import model.PrestashopWrapper;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class CategoryRequest implements InterfaceRequest<Category> {

	private CategoryCall categoryCall;
	private static final String ENDPOINT = "categories";
	
	
	public CategoryRequest() {
		categoryCall = new CategoryCall();
	}
	
	@Override
	public Category get(long id) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest(id).build();

			return categoryCall.getCallId(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Category post(Category CartRule) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			PrestashopWrapper wrapper = new PrestashopWrapper(CartRule);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.postRequest(body).build();
			
			return categoryCall.post(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Category put(Category CartRule) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			
			
			PrestashopWrapper wrapper = new PrestashopWrapper(CartRule);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.putRequest(body).build();
			
			return categoryCall.put(request);
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
			
			categoryCall.delete(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<Category> get() {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest().build();

			return categoryCall.getCall(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
	}
	
}
