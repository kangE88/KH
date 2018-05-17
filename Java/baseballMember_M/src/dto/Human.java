package dto;

public class Human {
	
	private int number;
	private String name;
	private String birth;
	private int age;
	private double height;
	
	public Human() {}

	public Human(int number, String name, String birth, int age, double height) {
		this.number = number;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.height = height;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return number + "-" + name + "-" + birth + "-" + age + "-" + height;
	}
}






