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
import model.Cart;
import model.Combination;
import model.list.Carts;
import model.list.Categories;
import model.list.Combinations;
import okhttp3.Request;
import okhttp3.Response;

public class CombinationCall implements InterfaceCall<Combination> {

	private XmlMapper xmlMapper;

	public CombinationCall() {
		xmlMapper = new XmlMapper();
		xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		xmlMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
	}

	@Override
	public Combination getCallId(Request request) throws IOException, TokenException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		System.out.println(toParse);
		Combination value = xmlMapper.readValue(toParse, Combination.class);
		return value;
	}

	@Override
	public Combination post(Request request) throws TokenException, IOException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		Combination value = xmlMapper.readValue(toParse, Combination.class);
		return value;
	}

	@Override
	public Combination put(Request request) throws TokenException, IOException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		Combination value = xmlMapper.readValue(toParse, Combination.class);
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
	public List<Combination> getCall(Request request) throws TokenException, IOException, WebserviceException {
		HttpConnection con = new HttpConnection();
		Response res = con.getInstance().newCall(request).execute();
		checkResponse(res);

		String toParse = res.body().string();
		System.out.println(toParse);
		Combinations value = xmlMapper.readValue(toParse, Combinations.class);

		return value.getCombination();
	}

	private void checkResponse(Response response) throws IOException, WebserviceException {
		if (!response.isSuccessful()) {
			ErrorWrapper message = xmlMapper.readValue(response.body().string(), ErrorWrapper.class);
			ErrorMessage error = message.getErrorMessage();

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
						"This call to PrestaShop Web Services returned an unexpected HTTP status of: "
								+ error.getCode() + ", with message: " + error.getMessage());
			}
		}
	}
}
