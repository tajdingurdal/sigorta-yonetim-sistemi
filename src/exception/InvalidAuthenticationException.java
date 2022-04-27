package exception;

public class InvalidAuthenticationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuthenticationException() {
		super();
	}

	public InvalidAuthenticationException(String s) {
		super(s);
	}

	public InvalidAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidAuthenticationException(Throwable cause) {
		super(cause);
	}

}
