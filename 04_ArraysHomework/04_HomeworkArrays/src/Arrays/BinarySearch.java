package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int temp = 0;
		
		int[] arrayForBinarySearch = {21 , 10 , 16 , 7 , 17 , 8  , 22 , 213 , 12 ,54};
		
		int first = 0;
		int last = arrayForBinarySearch.length - 1;
		int middle = ((first + last)/2);
		int target = input.nextInt();
		for(int i = 0; i < arrayForBinarySearch.length  ; i++){
			for(int j = 0; j < (arrayForBinarySearch.length - 1)  ; j++){
			if(arrayForBinarySearch[j ] > arrayForBinarySearch[j + 1]){
				temp = arrayForBinarySearch[j];
				arrayForBinarySearch[j] = arrayForBinarySearch[j + 1];
				arrayForBinarySearch[j + 1] = temp;
				
				}	
			}
		}
		for(int i = 0 ; i < arrayForBinarySearch.length ; i++){
			System.out.println(arrayForBinarySearch[i]);
		}
		
		System.out.println();
		if(target < middle){
			for(int i = first;i < middle +1; i++){
				if(target == arrayForBinarySearch[i]){
					System.out.println("You have found your target on index:");
					System.out.println(i);
					break;
				}	
			}
		}else if(target > middle){
			for(int i = middle + 1; i < arrayForBinarySearch.length; i++){
				if(target == arrayForBinarySearch[i]){
					System.out.println("You Have found your target on index:");
					System.out.println(i);
					break;
				}
				
			}
		}else {
			
			System.out.println("There is not such a number");
		
		}
		input.close();
	
	}

}












