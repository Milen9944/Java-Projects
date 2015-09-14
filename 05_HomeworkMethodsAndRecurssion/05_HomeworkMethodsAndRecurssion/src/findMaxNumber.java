import java.util.Scanner;

public class findMaxNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter three integers:");

		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		int thirdNum = input.nextInt();
		int maximum = MaxNumber(MaxNumber(firstNum, secondNum), thirdNum);
		
		System.out.println("Max value is:" + maximum);

		input.close();
	}

	public static int MaxNumber(int firstNum, int secondNum) {
		int maximum = 0;

		if (firstNum > secondNum) {

			maximum = firstNum;

		} else {
			maximum = secondNum;
		}
		return maximum;
	}

}
