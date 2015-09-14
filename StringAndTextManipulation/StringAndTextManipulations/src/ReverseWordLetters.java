import java.util.Scanner;

public class ReverseWordLetters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		String word = " ";
		System.out.println("Please , enter a word for reversing !");
		word = input.nextLine();
		StringBuffer buff = new StringBuffer(word);
		System.out.println(buff.reverse());
		
		input.close();
	}

}
