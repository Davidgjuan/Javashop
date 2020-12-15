package calls;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import connection.HttpConnection;
import exceptions.ErrorMessage;
import exceptions.ErrorWrapper;
import exceptions.TokenException;
import exceptions.WebserviceException;
import model.Zone;
import model.list.Deliveries;
import model.list.Zones;
import okhttp3.Request;
import okhttp3.Response;

public class GenericCall implements InterfaceCall<Zone> {

	private XmlMapper xmlMapper;

	public GenericCall() {
		xmlMapper = new XmlMapper();
		xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		xmlMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
	}

	@Override
	public Zone getCallId(Request request) throws IOException, TokenException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		System.out.println(toParse);
		Zone value = xmlMapper.readValue(toParse, Zone.class);
		return value;
	}

	@Override
	public Zone post(Request request) throws TokenException, IOException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		Zone value = xmlMapper.readValue(toParse, Zone.class);
		return value;
	}

	@Override
	public Zone put(Request request) throws TokenException, IOException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		Zone value = xmlMapper.readValue(toParse, Zone.class);
		return value;
	}

	@Override
	public void delete(Request request) throws TokenException, IOException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		System.out.println(res);
	}

	@Override
	public List<Zone> getCall(Request request) throws TokenException, IOException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		System.out.println(toParse);
		Zones value = xmlMapper.readValue(toParse, Zones.class);

		return value.getZone();
	}

	private void checkResponse(Response response) throws IOException, WebserviceException {
		if (!response.isSuccessful()) {
			ErrorWrapper Zones = xmlMapper.readValue(response.body().string(), ErrorWrapper.class);
			ErrorMessage error = Zones.getErrorMessage();

			switch (error.getCode()) {
			case 200:
			case 201:
				break;
			case 204:
				throw new WebserviceException("No Content");
			case 400:
				throw new WebserviceException("Bad Request");
			case 401:
				throw new WebserviceException("Unauthorized");
			case 404:
				throw new WebserviceException("Not Found");
			case 405:
				throw new WebserviceException("Method Not Allowed");
			case 500:
				throw new WebserviceException("Internal Server Error");
			default:
				throw new WebserviceException(
						"This call to PrestaZone Web Services returned an unexpected HTTP status of: "
								+ error.getCode() + ", with Zones: " + error.getMessage());
			}
		}
	}
}
