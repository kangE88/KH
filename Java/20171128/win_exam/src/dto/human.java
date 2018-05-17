package dto;

public class human {
	private String name;
	private String number;
	private String age;
	
	public human(String name, String string, String string2) {
		super();
		this.name = name;
		this.number = string;
		this.age = string2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name == " + name + " number == " + number + " age == " + age;
	}
	
}
