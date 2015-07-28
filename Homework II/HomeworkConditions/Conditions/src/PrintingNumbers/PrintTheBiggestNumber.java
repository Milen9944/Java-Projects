package PrintingNumbers;

import java.util.Scanner;

public class PrintTheBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter tree numbers for comparing: ");
		
		Scanner input = new Scanner(System.in);
		
		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		int thirdNum = input.nextInt();
		if((firstNum > secondNum) && (firstNum > thirdNum)){
			
			System.out.println("The number " + firstNum + " is the biggest");
			
		}else if((secondNum > firstNum) && (secondNum > thirdNum)){
			
			System.out.println("The number "+ secondNum + " is the biggest");
			
		}else if((thirdNum > firstNum) && (thirdNum > secondNum)){
			
			System.out.println("The number " + thirdNum + " is the biggerst");
			
		}
		
		input.close();
		
		
		
	}

}
