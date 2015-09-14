import java.util.Scanner;

public class FindingSumOfNumbersInInterval {

	public static void main(String[] args) {

		System.out.print("Please , enter a number between 10 and 30 000: ");
		int number = input();

		int sumOfNumbers = CalculateSumOfNumbers(number);

		System.out.println("The sum of from 10 to " + number + " is: " + sumOfNumbers);

	}

	public static int CalculateSumOfNumbers(int num) {

		if (num > 1) {
			return num + CalculateSumOfNumbers(num - 1);
		} else {
			return 1;
		}
	}

	public static int input() {
		Scanner input = new Scanner(System.in, "UTF-8");
		
		int number=0;
		
		
		while(input.hasNextInt()){
			
			number = input.nextInt();
			
			if(number>=10 && number<=30000){
				break;
			}
			
			System.out.print("Invalid or wrong number!");
		}
		return number;
		
	}	
	
}
