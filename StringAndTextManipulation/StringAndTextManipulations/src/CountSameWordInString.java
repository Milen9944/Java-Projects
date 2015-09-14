import java.util.Scanner;

public class CountSameWordInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please , enter text where you want to count: ");
		String text = input.nextLine();
		System.out.println("Please , enter word in lower case for counting: ");
		String word = input.nextLine();
		input.close();
		int counter = 0;
		String newText = text.toLowerCase();
		
		int index = newText.indexOf(word);
		while(index != -1){
			counter++;
			index = newText.indexOf(word, index + 1);
		}
		System.out.println("Number of words: " + counter);
	}
}
