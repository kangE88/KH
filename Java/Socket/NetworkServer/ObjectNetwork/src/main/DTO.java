package main;

import java.io.Serializable;

public class DTO implements Serializable{

	private int number;
	private String name;
	private int age;
	
	public DTO() {
	}

	public DTO(int number, String name, int age) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "DTO [number=" + number + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
