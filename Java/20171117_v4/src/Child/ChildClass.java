package Child;

import Super.SuperClass;

public class ChildClass extends SuperClass{

	public void method() { // Over Ride
		//super.method(); 부모 메소드를 가져올 때
		System.out.println("Child1 Class method()");
	}
	
	public void func() {
		System.out.println("child func()");
	}
}
