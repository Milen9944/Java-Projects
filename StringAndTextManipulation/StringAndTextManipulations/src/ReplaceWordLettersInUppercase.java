import java.util.Scanner;

public class ReplaceWordLettersInUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter word in lower case: ");
		String word = input.nextLine();
		System.out.println("Enter text in lower case: ");
		String text = input.nextLine();
		input.close();
		
		String newWord = word.toUpperCase();
		System.out.println(newWord);
		
		String newText = text.replace(word, newWord);
		System.out.println("New text: " + newText);

	}

}
