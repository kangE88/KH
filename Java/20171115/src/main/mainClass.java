package main;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 
		 *  Object oriented Programming
		 *  객체	지향	
		 *  반대 의미 : 절차 지향 ==> 순차적으로 처리
		 * 
		 * 1. 상속성
		 * 		부모/자식 Class간의 상관 관계
		 * 		
		 * 2. 은닉성
		 * 		외부 차단(변수)
		 * 
		 * 3. 다향성
		 * 		자식 클래스의 여러가지 형태
		 * 
		 * 
		 * AClass -> BClass
		 * 			 CClass
		 * 
		 * BClass bbb = new BClass();
		 * AClass aaa = new BClass();
		 * 
		 * AClass aa1 = new BClass();
		 * AClass aa2 = new CClass();
		 * 
		 *  
		 * 
		 * */
		
		int i;
		myClass cls; // 클래스변수 == 객체(object) instance(주체)
		
		cls = new myClass(); //동적할당(Heap)
		
		//cls.num = 12;
		
		cls.pnum = 12;
		
		cls.method();

		/////////////getter , setter
		
		cls.setNum(15);
		
		int r = cls.getNum();
		
		System.out.println("r == "+r);
		

	}

}

class myClass {  // Class 설계
	
	/*	은닉성
	 * 
	 * 	접근지정자
	 * 	private, public, 	protected   
	 *	개인적인 대중적인	상속	
	 *		
	 *
	 *
	 */
	
	//멤버변수
	private int num;
	public int pnum;
	
	void method() {
		num = 12;
		System.out.println("myClass method()");
	}
	
	// getter, setter ==> 메소드
	//멤버 변수에 선언한 변수를 사용
	
	
	//setter
	void setNum(int n) {
		num = n;
	}
	
	//getter
	int getNum() {
		return num;
	}
	
	
	
	
	
	
	
	
}