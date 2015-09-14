package Library;

import java.util.ArrayList;
import java.util.TreeMap;

public class Beginning {

	public static void main(String[] args) {

		Book firstBook = new Book("Thing And Be Rich", "Napoleon Hill", 200);
		Book secondBook = new Book("Risky is the new Safety", "Randy Gage", 900);
		
		ArrayList<Book> firstList = new ArrayList<>();
		firstList.add(firstBook);
		
		ArrayList<Book> secondList = new ArrayList<>();
		secondList.add(secondBook);
		
		TreeMap<String, ArrayList<Book>> firstMap = new TreeMap<>();
		firstMap.put("Thing And Be Rich", firstList);
		firstMap.put("Pride and Prejudice", secondList);
		
		
		Library first = new Library("OReilly", "Bulgaria", firstMap);
		System.out.println(first);
		
		first.addCopy("Thing And Be Rich");	
		first.addCopy("Thing And Be Rich");
		first.removeCopy("Thing And Be Rich");
		first.addCopy("Risky is the new Safety");
		first.removeCopy("Risky is the new Safety");
		first.removeCopy("Risky is the new Safety");
		first.addCopy("The art of Talking");
		first.removeCopy("Book");
		
		System.out.println(first);

	}

}
