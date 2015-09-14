package Bank;

public class CorporativeAccount extends Account {
	protected String firmName;
	protected long bulstat;

	public CorporativeAccount() throws NegativeMoneyException{
		super();
		
		this.firmName="";
		this.bulstat=0;
	}

	public CorporativeAccount(double sum, String firmName,long bulstat) throws NegativeMoneyException{
		super(sum);
		
		setFirmName(firmName);
		setBulstat(bulstat);
	}

	public String getFirmName() {
		return this.firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public long getBulstat() {
		return this.bulstat;
	}

	public void setBulstat(long bulstat) {
		this.bulstat = bulstat;
	}

}
