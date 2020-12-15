package connection;

import java.io.IOException;
import java.util.Base64;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthenticationInterceptor implements Interceptor{

	private static String TOKEN;
	
	public AuthenticationInterceptor(String token) {
		super();
		TOKEN = token;
	}
	
	@Override
	public Response intercept(Chain chain) throws IOException {
        
		/*Request request = chain.request();
		request.newBuilder().addHeader("Authorization","Basic "+getAuthHeader()).build();

		System.out.println("Executed " + getAuthHeader());
		System.out.println("Intercep Auth "+request.header("Authorization"));
        return chain.proceed(request);*/
		
		
		Request request = chain.request();
        Request newRequest;

	    newRequest = request.newBuilder()
	                .addHeader("Authorization","Basic " + getAuthHeader())
	                .build();
	        System.out.println("new R "+newRequest);

	        return chain.proceed(newRequest);
		
	}

	private String getAuthHeader(){
		return Base64.getEncoder().encodeToString((TOKEN +  ":").getBytes());
	}
	
}
