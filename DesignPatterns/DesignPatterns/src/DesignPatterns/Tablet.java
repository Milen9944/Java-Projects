package DesignPatterns;

public class Tablet extends Device {
	private String operatingSystem;

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Tablet(String model, String brand, String operatingSystem) {
		super(model, brand);
		this.operatingSystem = operatingSystem;
	}

	public void sayInformation() {
		System.out.printf("Brand:%s,Model:%s,operating system:%s%n", getBrand(), getModel(), getOperatingSystem());
	}
}
