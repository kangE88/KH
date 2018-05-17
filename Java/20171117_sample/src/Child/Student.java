package Child;

import Super.Human;

public class Student extends Human {
	private int number;
	private int count;
	
	public Student() {
	}
	
	public Student(int number, int count, String name, int age, double height) {
		super(name, age, height);
		this.number = number;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Student [number=" + number + ", count=" + count + "]";
	}
	

	
}
