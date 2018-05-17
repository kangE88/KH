package constructorClass;

public class myClass {
	private int num;
	private String name;
	
	/*
	 * 	constructor 생성자
	 * 	함수
	 * 	클래스명과 같은 함수
	 * 	return 값이 없다
	 * 	Over load가 가능하다.
	 * 	자동호출(클래스 생성시) myClass cls = new myClass(); ==> (): 생성자
	 * 	별도의 호출은 불가능하다.
	 * 	초기화 데이터를 설정은 부적합 - init
	 * 
	 * 	destructor : 소멸자
	 * 	자동호출
	 * 	반드시 한개 또는 없다.
	 * 	없어졌음
	 * 
	 * 
	 */
	
	public myClass() { // defult 생성자
		System.out.println("myClass  == myClass()");
	}
	
	public myClass(int i) {
		System.out.println("myClass myClass(int i)"+i);
	}
	
	public myClass(char c, String s) {
		System.out.println("myClass myClass(char c, String s) == "+c+" "+s);
	}
	
	
	public myClass(int num, String name) {
		this.num = num;
		this.name = name;
		
		System.out.println("myClass myClass(int num, String name) == "+num+" "+name);
	}
}
