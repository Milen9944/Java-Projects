package ObjectOrientedProgramming;

public class Professor extends Lecturer implements Conducting  {
	private String title;

	public Professor() {
		super();
		this.title = "";
	}

	public Professor(String firstName, String lastName, int age, int yearsOfService, String nameOfUniversity, String title) {
		super(firstName, lastName, age, yearsOfService, nameOfUniversity);
		setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void printTitleAndYears(){
		System.out.println("Title: " + getTitle());
		System.out.println("Years of service: " + getYearsOfService());
	}
	
	public void check() {
		System.out.println("Check homework! :)");
	}

	public void conductExams() {
		System.out.println("I can conduct exams!");
		
	}


}
