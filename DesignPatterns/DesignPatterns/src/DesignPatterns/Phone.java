package DesignPatterns;

public class Phone extends Device {
	private String shape;

	public String getShape() {
		return shape;
	}

	public void setShape(String deviceKind) {
		this.shape = shape;
	}

	public Phone(String model, String brand, String shape) {
		super(model, brand);
		this.shape = shape;
	}
	public void sayInformation(){
		System.out.printf("Brand:%s,Model:%s,shape:%s%n",getBrand(),getModel(),getShape());
	}
}
