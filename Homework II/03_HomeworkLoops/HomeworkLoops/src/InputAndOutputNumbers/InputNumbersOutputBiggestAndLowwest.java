package InputAndOutputNumbers;

import java.util.Scanner;

public class InputNumbersOutputBiggestAndLowwest {

	public static void main(String[] args) {
		
		System.out.println("Input Numbers and I will tell you who's the biggest and the lowwest");
		
		
		Scanner input = new Scanner(System.in);
		
		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		int thirdNum = input.nextInt();
		int fourthNum = input.nextInt();
		int fifthNum = input.nextInt();
		
		int[] array = {firstNum , secondNum , thirdNum , fourthNum , fifthNum };
		
		int smallestNum = array[0];
		int biggestNum = array[0];
		
		for(int i = 1 ; i < array.length ; i++){
			
			if(array[i] > biggestNum){
				
				biggestNum = array[i];
				
			}else if(array[i] < smallestNum){
				
				smallestNum = array[i];
				
			}					
		}
		
		System.out.println("The Biggest Number is: " + biggestNum);
		System.out.println("The Smallest Number is: " + smallestNum);
		
		input.close();
	}

}
