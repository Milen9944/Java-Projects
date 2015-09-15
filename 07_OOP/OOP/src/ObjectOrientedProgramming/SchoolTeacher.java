package ObjectOrientedProgramming;

public class SchoolTeacher extends Teacher implements Playing {

	private String[] classes = new String[5];

	public SchoolTeacher() {
		super();
		this.classes = null;
	}

	public SchoolTeacher(String firstName, String lastName, int age, int yearsOfService, String nameOfSubject,
			String[] classes) {
		super(firstName, lastName, age, yearsOfService, nameOfSubject);
		setClasses(classes);
	}

	public String[] getClasses() {
		return classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	public void printClasses() {
		System.out.print("Classes: ");
		for (String string : classes) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	public void play() {
		System.out.println("I can play with children!");

	}

}
