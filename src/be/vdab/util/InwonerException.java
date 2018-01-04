package be.vdab.util;

public class InwonerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InwonerException() {
		super();
	}

	public InwonerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InwonerException(String message, Throwable cause) {
		super(message, cause);
	}

	public InwonerException(String message) {
		super(message);
	}

	public InwonerException(Throwable cause) {
		super(cause);
	}
	
}
