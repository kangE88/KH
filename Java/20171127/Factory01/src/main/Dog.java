package main;

public class Dog implements Animal {

	@Override
	public void printDescript() {
		System.out.println("강아지입니다.");
	}
	
	public void DogMethod() {
		System.out.println("멍 멍");
	}

}
