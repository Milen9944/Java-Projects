package Bank;

public class NegativeMoneyException extends Exception {
	public NegativeMoneyException() {
		super();
	}

	public NegativeMoneyException(String message) {
		super(message);
	}

}
