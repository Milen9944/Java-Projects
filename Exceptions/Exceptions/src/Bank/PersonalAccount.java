package Bank;

public class PersonalAccount extends Account {
	protected String name;
	protected long EGN;

	public PersonalAccount() throws NegativeMoneyException {
		super();

		this.name = "";
		this.EGN = 0;
	}

	public PersonalAccount(double sum, String name, long EGN) throws NegativeMoneyException {
		super(sum);

		setName(name);
		setEGN(EGN);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEGN() {
		return this.EGN;
	}

	public void setEGN(long EGN) {
		this.EGN = EGN;
	}

}
