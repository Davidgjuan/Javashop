import connection.HttpConnection;
import request.GenericRequest;

public class main {

	public static void main(String[] args) throws Exception  {
		
		HttpConnection con1 = new HttpConnection("KNVLDUCURZ6BFKUUUQ6KNFCDEYX29TJM");
		con1.getInstance();
		con1.setDomain("https://polleria.fichajesgratis.com");//Si tiene la www la cadena da error

		GenericRequest cart = new GenericRequest();
		System.out.println(cart.get(1l));
		System.out.println(cart.get());
	}

}
