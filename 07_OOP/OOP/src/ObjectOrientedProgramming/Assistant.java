package ObjectOrientedProgramming;

public class Assistant extends Lecturer implements Writing, Checking {
	private boolean chiefAssistant;

	public Assistant() {
		super();
		this.chiefAssistant = false;
	}

	public Assistant(String firstName, String lastName, int age, int yearsOfService, String nameOfUniversity,
			boolean chiefAssistant) {
		super(firstName, lastName, age, yearsOfService, nameOfUniversity);
		setChiefAssistant(chiefAssistant);
	}

	public boolean isChiefAssistant() {
		return chiefAssistant;
	}

	public void setChiefAssistant(boolean chiefAssistant) {
		this.chiefAssistant = chiefAssistant;
	}

	public void printNameAndPosition() {
		System.out.println("Name: " + getFirsName() + " " + getLastName());
		System.out.println("Chief assistant: " + isChiefAssistant());
	}

	public void check() {
		System.out.println("Check homework! :)");
	}

	public void ckeckExams() {
		System.out.println("I can check exams!");

	}

	public void writeMemoir() {
		System.out.println("I can write memoir!");

	}

}
