
public class OddAndEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printingResult(200);
		printingResult(201);

	}

	public static void printingResult(int number) {
		if (number % 2 == 1) {
			System.out.printf("Number % d is odd!\n", number);
		} else {
			System.out.printf("Number % d is even!", number);
		}
	}

}
