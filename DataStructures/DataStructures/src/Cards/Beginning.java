package Cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Beginning {

	public static void main(String[] args) {
		String[] cards = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		Random random = new Random();

		for (int i = 1; i <= 5; i++) {

			int randomCard = random.nextInt(13);

			Integer count = result.get(cards[randomCard]);
			if (count == null) {
				count = 0;
			}
			result.put(cards[randomCard], count++);
		}
		System.out.print(result + " ");
		System.out.println();

		for (int i = 0; i < 13; i++) {
			Integer temp = result.get(cards[i]);
			if (temp == null) {
				continue;
			}

			if (temp == 2) {
				System.out.println("pair!");
			} else if (temp == 3) {
				System.out.println("set!");
			} else if (temp == 4) {
				System.out.println("four of a kind!");
			}
		}

	}

}
