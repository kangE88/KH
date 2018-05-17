package Child;

import Super.SuperClass;

public class ChildClass extends SuperClass{
	
	public void func() {
		//SuperClass 상속받아 getter / setter 를 통해 세팅
		setNumber(1);
		
		//SuperClass 상속받아 세팅
		name ="hello";
	}
}
