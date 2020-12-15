package request;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import calls.CarrierCall;
import connection.HttpConnection;
import exceptions.TokenException;
import exceptions.WebserviceException;
import model.Carrier;
import model.PrestashopWrapper;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class CarrierRequest implements InterfaceRequest<Carrier> {

	private CarrierCall carrierCall;
	private static final String ENDPOINT = "carriers";
	
	
	public CarrierRequest() {
		carrierCall = new CarrierCall();
	}
	
	@Override
	public Carrier get(long id) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest(id).build();

			return carrierCall.getCallId(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Carrier post(Carrier Carrier) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			PrestashopWrapper wrapper = new PrestashopWrapper(Carrier);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.postRequest(body).build();
			
			return carrierCall.post(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Carrier put(Carrier Carrier) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		
			PrestashopWrapper wrapper = new PrestashopWrapper(Carrier);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.putRequest(body).build();
			
			return carrierCall.put(request);
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
			
			carrierCall.delete(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<Carrier> get() {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest().build();

			return carrierCall.getCall(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
	}
	
}
