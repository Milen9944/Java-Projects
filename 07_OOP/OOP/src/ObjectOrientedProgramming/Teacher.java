package ObjectOrientedProgramming;

public class Teacher extends Person implements greetDay, greetBye {
	private String nameOfSubject;

	public Teacher() {
		super();
		this.nameOfSubject = "";
	}

	public Teacher(String firstName, String lastName, int age, int yearsOfService, String nameOfSubject) {
		super(firstName, lastName, age, yearsOfService);
		setNameOfSubject(nameOfSubject);
	}

	public String getNameOfSubject() {
		return nameOfSubject;
	}

	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}

	public final void check() {
		System.out.println("Checking homework!");
	}

	public void goodbye() {
		System.out.println("Goodby!");
	}

	public void goodDay() {
		System.out.println("Hello! Have a nice day!");
	}

}
