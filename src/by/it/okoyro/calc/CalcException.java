package by.it.okoyro.calc;

public class CalcException extends Exception {
	public CalcException() {
		super();
	}

	public CalcException(String message) {
		super("ERROR: " + message);
	}

	public CalcException(String message, Throwable cause) {
		super("ERROR: +" + message, cause);
	}

	public CalcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super("ERROR: " + message, cause, enableSuppression, writableStackTrace);
	}

	public CalcException(Throwable cause) {
		super(cause);
	}
}
