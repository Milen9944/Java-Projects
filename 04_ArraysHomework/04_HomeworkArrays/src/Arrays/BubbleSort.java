package Arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 0;
		
		Scanner input = new Scanner(System.in , "UTF-8");
		
		int[] arrayForSorting = {21 , 10 , 16 , 7 , 17 , 8 };
		
		System.out.println("Array before Bubble Sorting:");
		
		for(int i = 0 ; i < arrayForSorting.length ; i++){
			System.out.println(arrayForSorting[i]);
		}
		
		for(int i = 0; i < arrayForSorting.length  ; i++){
			for(int j = 0; j < (arrayForSorting.length - 1)  ; j++){
			if(arrayForSorting[j ] > arrayForSorting[j + 1]){
				temp = arrayForSorting[j];
				arrayForSorting[j] = arrayForSorting[j + 1];
				arrayForSorting[j + 1] = temp;
				
				}	
			}
		}
		System.out.println("Array after Bubble Sorting:");
		for(int i = 0 ; i < arrayForSorting.length ; i++){
			System.out.println(arrayForSorting[i]);
		}
		input.close();
		
	}

}












