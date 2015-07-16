import java.util.Scanner;

public class CheckForDivisionOnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input the number");
		
		Scanner num = new Scanner(System.in);
		
		int number = num.nextInt();
		if((number % 5)== 0 && (number % 7) == 0){
			System.out.println("The number can be divided by 5 & 7");
		}else
			System.out.println("wrong");
		
		
	}

}
