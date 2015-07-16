import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  System.out.println("You have to input two numbers for rectangle sides and then the program will calculate the facing:");
		 
		  System.out.println("Now you have to input the first side:"); 
		  Scanner scan = new Scanner(System.in);
		  double firstSide = scan.nextDouble();
		  
		  System.out.println("Input the second side of the rectangle");
		  double secondSide = scan.nextDouble();
		 
		  System.out.println("The facing of the rectangle is:" + (firstSide * secondSide) );
		  
		  scan.close();
		  
	      }			
	}

