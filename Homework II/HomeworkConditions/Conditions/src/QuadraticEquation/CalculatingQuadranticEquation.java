package QuadraticEquation;
import java.math.*;
import java.util.Scanner;

public class CalculatingQuadranticEquation {

	public static void main(String[] args) {
		
		System.out.println("Enter the factor of the equation");
		
		Scanner input = new Scanner(System.in);
		
		double a = input.nextInt();
		double b = input.nextInt();
		double c = input.nextInt();
		
		if((b * b) - 4 * a * c > 0){
			
			double fx = (double) ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
			double sx = (double) ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
			
			System.out.println("the two roots are: " + fx + " and " + sx );
		}else if((b * b) - 4 * a * c == 0){
			
			double x = (double)(-b/2*a);
			
			System.out.println("the only root is: " + x);
			
		}else{
			
			System.out.println("There is no real roots of the equation");
			
		}
		
		input.close();
	}

}
