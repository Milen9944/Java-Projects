package DesignPatterns;

public class Device {
	private String model;
	private String brand;

	public Device(String model, String brand) {
		super();
		setModel(model);
		setBrand(brand);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void sayInformation() {
		System.out.printf("Brand:%s,Model:%s%n", getBrand(), getModel());
	}
}
