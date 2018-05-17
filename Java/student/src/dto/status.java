package dto;

public class status extends Human{
	
	private int age;
	private double height;
	private double weight;
	
	//init
	public status() {
		
	}
	
	public status(int number, String name, String address, int age, double height, double weight) {
		super(number, name, address);
		this.age = age;
		this.height = height;
		this.weight = weight;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return super.toString() + " status [age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

}
