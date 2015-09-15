package ObjectOrientedProgramming;

public class CollegeTeacher extends Teacher {
	private String college;

	public CollegeTeacher() {
		super();
		this.college = "";
	}

	public CollegeTeacher(String firstName, String lastName, int age, int yearsOfService, String nameOfSubject, String college) {
		super(firstName, lastName, age, yearsOfService, nameOfSubject);
		setCollege(college);
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
