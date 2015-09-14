package DesignPatterns;

import java.util.Scanner;

public class Beginning {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DeviceFactory factory = DeviceFactory.getInstance();

		System.out.print("Enter device: ");
		String deviceType = input.nextLine();
		System.out.print("Enter model: ");
		String model = input.nextLine();
		System.out.print("Enter brand: ");
		String brand = input.nextLine();

		if (deviceType.equalsIgnoreCase("TABLET")) {
			System.out.print("Enter operating system: ");
			String operatingSystem = input.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, operatingSystem);
			device.sayInformation();
		} else if (deviceType.equalsIgnoreCase("PHONE")) {
			System.out.print("Enter shape: ");
			String shape = input.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, shape);
			device.sayInformation();
		} else if (deviceType.equalsIgnoreCase("LAPTOP")) {
			System.out.print("Enter color: ");
			String color = input.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, color);
			device.sayInformation();
		}
	}

}
