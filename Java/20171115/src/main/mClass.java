package main;

import my.myClass;

public class mClass {

	public static void main(String[] args) {
		
		/*
		//static 은 클래슬명으로
		myClass.staticTag = 11;
		
		myClass mc = new myClass();
		
		mc.method();
		
		myClass cls = new myClass();
		//여러개의 클래스를 작성하면 인스턴스(cls)만 추가하여 생성된다.
		//재사용성
		/*
		 * 	init()		- 초기화
		 * 
		 * 	loop()		- 루프
		 * 
		 * 	release()	- 해방
		 * 
		 * 
		 
		myClass.staticTag = 11;
		
		
		*/
		
		myClass cls = new myClass();
		
		cls.func();
		
		cls.func();
		
		cls.func();				// instance method
		
		myClass.staticMethod(); // Class method
		
	}
	


}
