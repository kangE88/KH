package finalClass;

public class mainClass {

	public static void main(String[] args) {
		
		final int num = 1; //변수 -> 상수  const
		
		//num = 2;
		
		/*
		 * 	method, class 에 상수값 적용 가능
		 * 	
		 * 	
		 * 
		 * 
		 */

	}

}

/*final*/ class superClass {
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public /*final*/ void method() {
		System.out.println("superClass method()");
	}
}

class childClass extends superClass {
	public void method() { // Over Ride
		System.out.println("superClass method()");
	}
}