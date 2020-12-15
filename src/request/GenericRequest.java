package request;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import calls.GenericCall;
import connection.HttpConnection;
import exceptions.TokenException;
import exceptions.WebserviceException;
import model.Zone;
import model.PrestashopWrapper;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class GenericRequest implements InterfaceRequest<Zone> {

	private GenericCall ZoneCall;
	private static final String ENDPOINT = "zones";
	
	
	public GenericRequest() {
		ZoneCall = new GenericCall();
	}
	
	@Override
	public Zone get(long id) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest(id).build();

			return ZoneCall.getCallId(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Zone post(Zone ZoneRule) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			PrestashopWrapper wrapper = new PrestashopWrapper(ZoneRule);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.postRequest(body).build();
			
			return ZoneCall.post(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Zone put(Zone ZoneRule) {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			
			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
			
			
			
			PrestashopWrapper wrapper = new PrestashopWrapper(ZoneRule);
			RequestBody body =RequestBody.create(xmlMapper.writeValueAsString(wrapper), 
					MediaType.get("application/json; charset=utf-8"));
			Request request = con.putRequest(body).build();
			
			return ZoneCall.put(request);
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
			
			ZoneCall.delete(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<Zone> get() {
		try {
			HttpConnection con = new HttpConnection();
			con.setEndpoint(ENDPOINT);
			Request request = con.getRequest().build();

			return ZoneCall.getCall(request);
		} catch (TokenException | IOException | WebserviceException e ) {
			
			e.printStackTrace();
		}
		return null;
	}
	
}
