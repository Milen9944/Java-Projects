package Arrays;

import java.util.Random;

public class SumOfEvenNumbersInArray {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		Random random = new Random();
		int sum = 0;
		
		for(int i=0;i< numbers.length;i++){
			
			numbers[i] = random.nextInt(numbers.length);
			System.out.println(numbers[i]);
			if(numbers[i] % 2 == 0){
				sum = sum + numbers[i];
			}
			
		}
		System.out.println();
		System.out.println("The summary of the even numbers in the array is:" +
		sum);
		
		
	}

}
