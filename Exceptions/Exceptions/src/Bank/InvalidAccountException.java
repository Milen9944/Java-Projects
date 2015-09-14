package Bank;

public class InvalidAccountException extends Exception {
	public InvalidAccountException() {
		super();
	}

	public InvalidAccountException(String message) {
		super(message);
	}

}
