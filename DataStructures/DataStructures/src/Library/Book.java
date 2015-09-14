package Library;

public class Book {
	private String nameOfBook;
	private String nameOfAuthor;
	private int numberOfPages;
	
	public Book(String nameOfBook, String nameOfAuthor, int numberOfPages) {
		super();
		this.nameOfBook = nameOfBook;
		this.nameOfAuthor = nameOfAuthor;
		this.numberOfPages = numberOfPages;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public String getNameOfAuthor() {
		return nameOfAuthor;
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book: name - " + nameOfBook + ", author - " + nameOfAuthor + ", pages - " + numberOfPages;
	}

	@Override
	public int hashCode() {
		return (this.nameOfBook + this.nameOfAuthor + this.numberOfPages).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		 if(obj == null){
		    	return false;
		    }
		    
		    if(!(obj instanceof Book)){
		    	return false;
		    }

		    Book book = (Book) obj;
		    return this.hashCode() == book.hashCode();
	}

}
