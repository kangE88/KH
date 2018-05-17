package main;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 추상 팩토리 패턴 Abstrect Factory 
		 * factory pattern 목적
		 * 원하는 클래스 형태를 생성 하기 위함.
		 * 
		 */
		
		Animal animal1 = AnimalFactory.Create("고양이");
		
		animal1.printDescript();
		
		Cat cat = (Cat)animal1;
		cat.CatMethod();
		
		
		Animal animal2 = AnimalFactory.Create("소");
		
		animal2.printDescript();
		
		Cow cow = (Cow)animal2;
		cow.CowMethod();
		
		Animal animal3 = AnimalFactory.Create("강아지");
		
		animal3.printDescript();
		
		Dog dog = (Dog)animal3;
		dog.DogMethod();

	}

}
