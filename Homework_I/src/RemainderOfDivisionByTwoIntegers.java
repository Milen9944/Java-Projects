import java.util.Scanner;

public class RemainderOfDivisionByTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input two Integers");
		
		Scanner num = new Scanner(System.in);
		int firstNum = num.nextInt();
		int secondNum = num.nextInt();
		System.out.println("If the first number is bigger than the second the result is:" + firstNum % secondNum);
		System.out.println("If the second number is bigger than the first the result is :" + secondNum % firstNum);
		
	}

}
