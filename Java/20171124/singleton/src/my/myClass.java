package my;

import main.SingletonClass;

public class myClass {

	private int myNumber;
	
	public myClass() {
		myNumber = 99;
	}
	
	public int getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}
	
	public void mMethod() {
		SingletonClass sc = SingletonClass.getInsance();
		myNumber = sc.scNumber;
	}
	
	
	@Override
	public String toString() {
		return "myClass [myNumber=" + myNumber + "]";
	}
}
