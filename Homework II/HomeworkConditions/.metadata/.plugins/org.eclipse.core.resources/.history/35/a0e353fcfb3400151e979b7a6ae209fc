package InputAndPositioningNumber;

import java.util.Scanner;

public class InputAndPositioningNumberOnTheCoordinateSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please , Input a number and I will tell you something about it");
		
		Scanner input = new Scanner(System.in);
		
		double number = input.nextDouble();
		
		if((number > 1) && (number <  5) ){
			if(number % 2 == 0){
				
				System.out.println("The number is EVEN and it is between 1 and 5");
			
			}else if(number % 2 == 1){
			
				System.out.println("The number is ODD and it is between 1 and 5");
			
			}
		}else if(number > 6 && number < 15){
			if(number % 3 == 0){
				
				System.out.println("The number does not have remainder");
			
			}else{
				
				System.out.println("The number doesn't have remainder");
			
			}
		}else{
			if(number > 0){
				
				System.out.println("The number is not in the intervals above."
						+ "I can only tell you that it is positive");
				
			}else if(number < 0){
				System.out.println("The number is not in the intervals above."
						+ "I can only tell you that it is negative");
			}else if(number == 0){
				System.out.println("The number is not in the intervals above."
						+ "I can only tell you that it is 0");
			}else{
				System.out.println("Please , Input number not bullshits");
			}
		}
		
		input.close();
	}

}
