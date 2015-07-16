import java.util.Scanner;

public class SwitchVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input the first integer");
		
		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		
		System.out.println("Input the second integer");
		Scanner sc = new Scanner(System.in);
		int secondNum = sc.nextInt();
		
		System.out.println("Before the swap firstNumber");
		System.out.println(firstNum);
		System.out.println("Before the swap secondNumber");
		System.out.println(secondNum);
		System.out.println("Now lets swap them");
		
		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		
		
		
		
	}

}
