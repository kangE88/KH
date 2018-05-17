package Super;

public class Human { // Data Transfer Object
	private String name;
	private int age;
	private double height;
	
	public Human() {}

	public Human(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
}
