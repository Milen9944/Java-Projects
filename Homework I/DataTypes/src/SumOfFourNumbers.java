import java.util.Scanner;

public class SumOfFourNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input four integers, one after another and the program will return you their sum");
		
		Scanner scann = new Scanner(System.in);
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		int d = scann.nextInt();
		System.out.println("Here they are: " + a + b + c + d);
		
		scann.close();
		
		}
		
	}

