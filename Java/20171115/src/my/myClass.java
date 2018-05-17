package my;

public class myClass {

	private int number; // mumber 변수
	
	public static int staticTag=0;
	int localTag=0;
	
	
	/*
	 *  변수의 종류
	 *  local(지역) 변수 			- stack memory
	 * 	member(class에 소속) 변수	- heap memory
	 * 
	 * 	static(정적)변수			- static memory - global(전역) 변수
	 * 
	 * 	
	 * 
	 * */
	
	public void method() {
		
		int n; // local 변수
		
		System.out.println("myClass method()");
		staticTag = 12;
	}

	public void func() {
		
		int localTag = 0;
		int number = 12;
		
		staticTag++;		//프로그램이 종료 될때
		localTag++; 		//함수 빠져나갔을때 지워진다.
		number++;			//Class가 삭제됐을 때
		
		
		
		System.out.println("staticTag === "+staticTag);
		System.out.println("localTag === "+localTag);
		System.out.println("number ==== "+number);
	}
	
	public static void staticMethod() {
		System.out.println("myClass staticMethod()");
		
		//this 사용 불가
	}
}
