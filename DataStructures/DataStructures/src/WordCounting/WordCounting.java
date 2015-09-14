package WordCounting;

import java.util.Scanner;
import java.util.TreeMap;

public class WordCounting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		String[] words = new String[20];
		
		System.out.println("Enter 20 words separate with comma: ");
		String text = input.nextLine();
		words = text.split("[, ]+");
	
		input.close();
			
		TreeMap<String, Integer> wordsCounting = new TreeMap<String, Integer>();
					
		for (String word : words) {
			Integer count = wordsCounting.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCounting.put(word, count + 1);
		}
			
		System.out.println(wordsCounting);


	}

}
