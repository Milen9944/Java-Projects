import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the two sides of a triangle one after another and the program will calculate the area");
		
		Scanner sides = new Scanner(System.in);
		double firstSide = sides.nextDouble();
		double secondSide = sides.nextDouble();
		System.out.println("The area of the triangle is: " + ((firstSide*secondSide)/2) );
		
	}

}
