import java.util.Scanner;
public class EvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a number and the program will tell you if its odd or even");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		if(number % 2 == 1){
			System.out.println("the number is odd");
		}else if(number % 2 == 0){
			System.out.println("the number is even");
		}
		num.close();
	}

}
