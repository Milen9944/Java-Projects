
package NumbersBecameWords;

import java.util.Scanner;
public class InputNumberOutputWordOfTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number fron 0 to 9 and I will tell you the words");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		
		switch(number){
		
		case 0 : 
			System.out.println("zero");
			break;
			
		case 1 : 
			System.out.println("one");
			break;
			
		case 2 : 
			System.out.println("two");
			break;
			
		case 3 : 
			System.out.println("three");
			break;
			
		case 4 : 
			System.out.println("four");
			break;
		case 5 : 
			System.out.println("five");
			break;
			
		case 6 :
			System.out.println("six");
			break;
			
		case 7 : 
			System.out.println("seven");
			break;
			
		case 8 : 
			System.out.println("eight");
			break;
			
		case 9 : 
			System.out.println("nine");
			break;
			
		default:
			System.out.println("You didn't enter number from 0 to 9");
		
		}
		
		input.close();
		
	}

}

