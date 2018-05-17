package my;

import main.SingletonClass;

public class myClass {
	private int myNumber;
	
	public myClass() {
		myNumber = 10;
	}

	public int getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}
	
	public void myMethod() {
		SingletonClass sc =SingletonClass.getInstence();
		sc.Stnumber = myNumber;
	}

	@Override
	public String toString() {
		return "myClass [myNumber=" + myNumber + "]";
	}

}
