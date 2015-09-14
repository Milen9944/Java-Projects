package Library;

import java.util.ArrayList;
import java.util.TreeMap;

public class Library {

	private String nameOfLibrary;
	private String location;
	private TreeMap<String, ArrayList<Book>> colectionOfBooks = new TreeMap<String, ArrayList<Book>>();
	
	public Library(String nameOfLibrary, String location, TreeMap<String, ArrayList<Book>> colectionOfBooks) {
		super();
		this.nameOfLibrary = nameOfLibrary;
		this.location = location;
		this.colectionOfBooks = colectionOfBooks;
	}

	public String getNameOfLibrary() {
		return nameOfLibrary;
	}

	public void setNameOfLibrary(String nameOfLibrary) {
		this.nameOfLibrary = nameOfLibrary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public TreeMap<String, ArrayList<Book>> getColectionOfBooks() {
		return colectionOfBooks;
	}

	public void setColectionOfBooks(TreeMap<String, ArrayList<Book>> colectionOfBooks) {
		this.colectionOfBooks = colectionOfBooks;
	}
	
	public void addCopy(String name){
		if(colectionOfBooks.containsKey(name)){
			ArrayList<Book> list = colectionOfBooks.get(name);
			if(list.size() != 0){
				Book book = list.get(0);
				Book newBook = book;
				list.add(newBook);
				System.out.println("One copy was added!");
			} else{
				System.out.println("The list is empty!");
			}
		} else{
			System.out.println("There is no book with this name!");
		}
	}
	
	public void removeCopy(String name){
		if(colectionOfBooks.containsKey(name)){
			ArrayList<Book> list = colectionOfBooks.get(name);
			if(list.size() != 1){
				list.remove(list.size()-1);
				System.out.println("One copy was removed!");
			} else{
				System.out.println("There is no copy or list is empty!");
			}
		} else{
			System.out.println("There is no book with this name!");
		}
	}

	@Override
	public String toString() {
		return "Library: name - " + nameOfLibrary + ", location - " + location + ", colection: "
				+ colectionOfBooks;
	}

}
