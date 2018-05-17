package main;

import Child.ChildClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 	은닉성	private public protected (자식클래스만)
		 * 	상속성	부모클래스 -> 자식클래스 Over Ride (추가기입)
		 * 	다형성	상속 -> 1, 2, 3
		 * 
		 * 	부모 cls = new 자식();  
		 * 
		 * 	변수
		 * 	local(지역) - stack
		 * 	member(멤버) - heap
		 * 	static(정적) - static
		 * 
		 */
		
		ChildClass cls = new ChildClass(1, "홍길동", 80, "컴공");
		
		System.out.println("cls == "+cls.toString());
		
		
		

	}

}
