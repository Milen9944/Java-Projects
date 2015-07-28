package PlayCards;

import java.util.Scanner;

public class PlayCardsRecognizing {

	public static void main(String[] args) {
		
			System.out.println("Enter a number fron 0 to 9 and I will tell you the words");
			
			Scanner input = new Scanner(System.in);
			
			char cardType = input.next().charAt(0);
			
			
			switch(cardType){
			
			case 2 : 
				System.out.println("Valid Card");
				break;
				
			case 3 : 
				System.out.println("Valid Card");
				break;
				
			case 4 : 
				System.out.println("Valid Card");
				break;
				
			case 5 : 
				System.out.println("Valid Card");
				break;
				
			case 6 : 
				System.out.println("Valid Card");
				break;
			case 7 : 
				System.out.println("Valid Card");
				break;
				
			case 8 :
				System.out.println("Valid Card");
				break;
				
			case 9 : 
				System.out.println("Valid Card");
				break;
				
			case 10 : 
				System.out.println("Valid Card");
				break;
				
			case 'J' : 
				System.out.println("Valid Card");
				break;
				
			case 'Q' : 
				System.out.println("Valid Card");
				break;
				
			case 'K' : 
				System.out.println("Valid Card");
				break;
				
			case 'A' : 
				System.out.println("Valid Card");
				break;
				
			default:
				System.out.println("Not Valid Card");
			
			}
			
			input.close();
			

	}

}
