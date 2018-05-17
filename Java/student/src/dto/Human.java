package dto;

public class Human {

	private int number;
	private String name;
	private String address;
	
	//생성자 init
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(int number, String name, String address) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return " Human [number=" + number + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
