package ObjectOrientedProgramming;

public abstract class Person {
	public static int counter = 0;

	protected String firsName;
	protected String lastName;
	protected int age;
	protected int yearsOfService;

	public Person() {
		this.firsName = "";
		this.lastName = "";
		this.age = 0;
		this.yearsOfService = 0;

	}

	public Person(String firstName, String lastName, int age, int yearsOfService) {
		setFirsName(firstName);
		setLastName(lastName);
		setAge(age);
		setYearsOfService(yearsOfService);
		counter++;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		if (yearsOfService >= 0) {
			this.yearsOfService = yearsOfService;
		}
	}

	public static int getCounter() {
		return counter;
	}

	public abstract void check();
}
