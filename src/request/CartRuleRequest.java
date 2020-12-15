package request;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import calls.CartRuleCall;
import connection.HttpConnection;
import exceptions.TokenException;
import exceptions.WebserviceException;
import model.CartRule;
import model.PrestashopWrapper;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class CartRuleRequest implements InterfaceRequest<CartRule> {

	private CartRuleCall cartRuleCall;
	private static final String ENDPOINT = "cart_rules";
	
	
	public CartRuleRequest() {
		cartRuleCall = new CartRuleCall();
	}
	
	@Override
	public CartRule get(long id) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest(id).build();

			return cartRuleCall.getCallId(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public CartRule post(CartRule CartRule) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			PrestashopWrapper wrapper = new PrestashopWrapper(CartRule);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.postRequest(body).build();
			
			return cartRuleCall.post(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public CartRule put(CartRule CartRule) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			
			
			PrestashopWrapper wrapper = new PrestashopWrapper(CartRule);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.putRequest(body).build();
			
			return cartRuleCall.put(request);
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
			
			cartRuleCall.delete(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<CartRule> get() {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest().build();

			return cartRuleCall.getCall(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
	}
	
}
