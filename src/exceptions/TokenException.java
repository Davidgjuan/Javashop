package exceptions;

public class TokenException extends Exception {

	private static final long serialVersionUID = -1288192298824929498L;

	public TokenException() {
		super("User token required");
	}
}
