package DesignPatterns;

public class DeviceFactory {
	private static DeviceFactory instance = new DeviceFactory();

	public DeviceFactory() {

	}

	public static DeviceFactory getInstance() {
		return instance;
	}

	public Device getDevice(String deviceType, String model, String brand, String added) {

		if (deviceType == null) {
			return null;
		}

		if (deviceType.equalsIgnoreCase("TABLET")) {
			return new Tablet(model, brand, added);
		} else if (deviceType.equalsIgnoreCase("PHONE")) {
			return new Phone(model, brand, added);
		} else if (deviceType.equalsIgnoreCase("LAPTOP")) {
			return new Laptop(model, brand, added);
		} else {
			return null;
		}
	}

}
