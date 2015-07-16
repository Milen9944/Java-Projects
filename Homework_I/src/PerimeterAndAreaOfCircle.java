import java.util.Scanner;
public class PerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the radius");
		double pi = 3.14;
		Scanner rad = new Scanner(System.in);
		double radius = rad.nextDouble();
		System.out.println("The perimeter of the circle is: " + (2 * pi * radius) );
		
		
	}

}
