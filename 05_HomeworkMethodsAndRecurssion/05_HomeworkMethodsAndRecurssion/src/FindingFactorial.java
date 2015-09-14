import java.util.Scanner;

public class FindingFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int integer = input.nextInt();

		System.out.printf("\nThe factorial of %d is: ", integer);
		System.out.print(findingFactorial(integer));

		input.close();
			

	}

	public static long findingFactorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return (number * findingFactorial(number - 1));
	}

}
