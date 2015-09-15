package ObjectOrientedProgramming;

public class Lecturer extends Person implements greetDay {
	private static final int MAX_LECTURES = 10;
	private String nameOfUniversity;

	public Lecturer() {
		super();
		this.nameOfUniversity = "";
	}

	public Lecturer(String firstName, String lastName, int age, int yearsOfService, String nameOfUniversity) {
		super(firstName, lastName, age, yearsOfService);
		setNameOfUniversity(nameOfUniversity);
	}

	public String getNameOfUniversity() {
		return nameOfUniversity;
	}

	public void setNameOfUniversity(String nameOfUniversity) {
		this.nameOfUniversity = nameOfUniversity;
	}

	public void check() {
		System.out.println("Checking homework!");

	}

	public void goodDay() {
		System.out.println("Hello! Have a nice day!");

	}

	public void printMaxLectures() {
		System.out.println("Max lectures: " + MAX_LECTURES);
	}

	public static void exercise() {
		System.out.println("We have exercises!");
	}

	public static void exercise(int hours) {
		System.out.printf("We have exercises since %d hours!\n", hours);
	}

	public static void exercise(int hours, String nameOfSubject) {
		System.out.printf("We have %s exercises since %d hours!\n", nameOfSubject, hours);
	}

}
