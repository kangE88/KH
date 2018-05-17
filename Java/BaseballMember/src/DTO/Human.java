package DTO;

public class Human {	
	private boolean position;
	private int no;
	private String name;
	private String birth;
	private int age;
	private double height;
	
	public Human() {
		
	}
	
	public Human(int no, String name, String birth, int age, double height, boolean position) {
		super();
		this.no = no;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.height = height;
		this.position = position;
	}

	public boolean getPosition() {
		return position;
	}

	public void setPosition(boolean position) {
		this.position = position;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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
		return  position + "-" + no + "-" + name + "-" + birth + "-" + age + "-" + height;
	}
	
	
	
}
