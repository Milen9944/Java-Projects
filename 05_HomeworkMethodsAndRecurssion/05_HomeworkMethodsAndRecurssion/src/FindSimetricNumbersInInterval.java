
public class FindSimetricNumbersInInterval {

	public static void main(String[] args) {

		System.out.print("Symetric numbers in interval [10; 999] are: ");
		printSymetricNumbers();

	}

	public static void printSymetricNumbers() {

		for (int number = 10; number < 1000; number++) {
			if (number < 100) {
				int tens = number / 10;
				int ones = number % 10;

				if (tens == ones) {
					System.out.print(number + " ");
				}
			} else {
				int hundreds = number / 100;
				int ones = number % 10;

				if (hundreds == ones) {
					System.out.print(number + " ");
				}
			}
		}
	}

}
