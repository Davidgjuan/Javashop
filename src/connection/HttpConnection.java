package connection;


import java.net.URI;
import java.net.URISyntaxException;

import exceptions.TokenException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class HttpConnection {

	 private static OkHttpClient client;
	 private static String domain;
	 private static String schema;
	 private static String token;
	 private HttpUrl.Builder endpoint;
	 
	 public HttpConnection() throws TokenException  {
		 if(token == null) {
			throw new TokenException();
		 }		 
	 }
	 
	 public HttpConnection(String token) {
		 if(client == null) {
			HttpConnection.token = token;
			client = new OkHttpClient().newBuilder().addInterceptor(new AuthenticationInterceptor(token)).build();
		 }
	 }
	 
	 public OkHttpClient getInstance() {
		 return client;
	 }
	
	 public Request.Builder getRequest() {
		 Request.Builder request = new Request.Builder()
                 .url(endpoint.build()).get();
		 return request;
	 }
	 
	 public Request.Builder getRequest(Long id) {
		 Request.Builder request = new Request.Builder()
                 .url(endpoint.addPathSegment(String.valueOf(id)).build()).get();
		 return request;
	 }
	 public Request.Builder postRequest(RequestBody body) {
		 Request.Builder request = new Request.Builder()
                 .url(endpoint.build()).post(body);
		 return request;
	 }
	 
	 public Request.Builder putRequest( RequestBody body) {
		 Request.Builder request = new Request.Builder()
                 .url(endpoint.build()).put(body);
		 return request;
	 }
	 
	 public Request.Builder deleteRequest() {
		 Request.Builder request = new Request.Builder()
                 .url(endpoint.build()).delete();
		 return request;
	 }
	 
	 public Request.Builder deleteRequest(long id) {
		 Request.Builder request = new Request.Builder()
                 .url(endpoint.addPathSegment(String.valueOf(id)).build()).delete();
		 return request;
	 }
	 
	 public void setDomain(String domain) throws Exception {
		 try {
			URI uri = new URI(domain);
			System.out.println(domain +"   " + uri.getHost() + "  "+ uri.getScheme());
			HttpConnection.domain = uri.getHost();
			HttpConnection.schema = (uri.getScheme()!=null?uri.getScheme():"https");
		} catch (URISyntaxException e) {
			throw new Exception("Error parsing domain");
		}
		 
		 
	 }
	
	 public String getDomain() {
		 return domain;
	 }
	 
	 public void setToken(String token) {
		 HttpConnection.token = token;
	 }
	 
	 public String getToken() {
		 return token;
	 }
	 
	 public void setEndpoint(String endpoint) {
		 HttpUrl.Builder url = new HttpUrl.Builder()
				 	.scheme(schema)
				    .host(domain)
				    .addPathSegment("api")
				    .addPathSegments(endpoint);

		 this.endpoint = url; 
	 }
	 
}
