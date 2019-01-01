package vnuk.huong170205.assignment2.model;

public abstract class Person {
	protected int id;
	protected String name; 
	protected int yearOfBirth;
	protected int type;
	
	public Person() {}

	public abstract void input();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getType() {
		return type;
	}

	public abstract String toString();
	
	public abstract float getSalary();
	
}
