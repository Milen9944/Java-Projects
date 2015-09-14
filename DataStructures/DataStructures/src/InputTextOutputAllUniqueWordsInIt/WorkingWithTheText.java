package InputTextOutputAllUniqueWordsInIt;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class WorkingWithTheText {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("enter text: ");
		String text = input.nextLine();
		String[] words = text.split("[, .!?:]+");
		input.close();

		TreeMap<String, Integer> uniqueWords = new TreeMap<String, Integer>();

		for (String word : words) {
			Integer count = uniqueWords.get(word);
			if (count == null) {
				count = 0;
			}
			uniqueWords.put(word, count + 1);
		}

		Set<String> keys = uniqueWords.keySet();
		Iterator<String> iter = keys.iterator();

		while (iter.hasNext()) {
			String temp = iter.next();
			if (uniqueWords.get(temp) == 1) {
				System.out.print(temp + " ");
			}
		}

	}

}
