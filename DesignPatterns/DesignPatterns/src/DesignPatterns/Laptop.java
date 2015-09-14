package DesignPatterns;

public class Laptop extends Device {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String deviceKind) {
		this.color = color;
	}

	public Laptop(String model, String brand, String color) {
		super(model, brand);
		this.color = color;
	}
	public void sayInformation(){
		System.out.printf("Brand:%s,Model:%s,color:%s%n",getBrand(),getModel(),getColor());
	}
}
