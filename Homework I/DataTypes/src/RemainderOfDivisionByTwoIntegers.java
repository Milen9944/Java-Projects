import java.util.Scanner;

public class RemainderOfDivisionByTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input two Integers");
		
		Scanner num = new Scanner(System.in);
		int firstNum = num.nextInt();
		int secondNum = num.nextInt();
		if(firstNum > secondNum){
			System.out.println("First Number is bigger than the Second and the remainder of the division is: " + (firstNum % secondNum) );
		}else if(secondNum > firstNum){
			System.out.println("Second Number is bigger than the first and the remainder of the division is :" + secondNum % firstNum);
		}
		
		num.close();
	}

}
