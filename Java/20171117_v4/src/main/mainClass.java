package main;

import Child.ChildClass;
import Child2.ChildClass2;
import Super.SuperClass;

public class mainClass {
	public static void main(String[] args) {
		
		/*
			ChildClass ch1[] = new ChildClass[3];
			
			ch1[0] = new ChildClass();
			ch1[1] = new ChildClass();
			ch1[2] = new ChildClass();
			ch1[0].method();
			ch1[1].method();
			
			ChildClass2 ch2[] = new ChildClass2[3];
			ch2[0] = new ChildClass2();
			ch2[0].method();
		*/
		
		SuperClass sc1 = new ChildClass();
		SuperClass sc2 = new ChildClass2();
		
		sc1.method();
		sc2.method();
		
		SuperClass arrSc[] = new SuperClass[4];
		
		arrSc[0] = new ChildClass();
		arrSc[1] = new ChildClass2();
		arrSc[2] = new ChildClass2();
		arrSc[3] = new ChildClass();
		arrSc[0].method();
		/*
			method()와 func() 메소드는 현재 ChildClass() 에 속해있으나, func()는 바로 사용하려면 사용이 불가능하다.
			arrSc[0].method(); 사용가능
			
			SuperClass (부모)로 묶인 ChildClass를 잠시 끊고 ChildClass 인스턴스를 선언하여 부모 클래스 배열에 있는
			내용을 캐스팅 변환을 통해  func(); 함수를 가져올 수 있다.
		*/
		ChildClass ch1 = (ChildClass)arrSc[0];
		ch1.func();
		
		
		
	}

}
