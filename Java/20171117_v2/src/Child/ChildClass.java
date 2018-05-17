package Child;

import Super.SuperClass;

public class ChildClass extends SuperClass {

	public void method() {// - OverRide 그림 투명처리 추가
		super.method(); // 부모클래스 메소드 접근
		System.out.println("child Class method()");
	}
}
