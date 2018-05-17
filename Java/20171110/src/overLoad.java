
public class overLoad {

	public static void main(String[] args) {
		
		/*
		 	OverLoad :
		 	 메소드 명은 같고 인수(Parameter)의 자료형이나
		 	 인수의 갯수가 다른 함수를 의미합니다.
		
			image -> r g b	->24 bit
						r g b a ->32bit
						
			paint();
			paint(int a);
			
		 	 
		*/
		
		method();
		method('h');
		method(1);
		method(1,'h');
		
		int sum;
		
		sum = disp(1,2,3,4);
		System.out.println(sum);
		sum = disp("a",1,2,3,4);
		System.out.println(sum);
		
	}
	
	//가변인수
	// ...  배열 역활처럼 사용가능하지만, 배열을 사용하려면 선언해서 넣어야한다.
	static int disp(int...num) {
		int sum =0;
		for(int i=0;i<num.length;i++) {
			sum = sum+num[i];
		}
		return sum;
	}
	//가인수 int...num String str <-- 사용불가
	static int disp(String str, int...num) {
		int sum =0;
		for(int i=0;i<num.length;i++) {
			sum = sum+num[i];
		}
		return sum;
	}
	
	
	////////////////////////////////////////////////////////////////////
	
	static void method() {
		System.out.println("mainClass method()");
	}
	
	static void method(char c) {
		System.out.println("mainClass method(char c)");
	}
	// 
	/* 위에와 이름이 같아 사용 불가
	static char method(char c) {
		System.out.println("mainClass method(char c)");
	}
	*/
	static void method(int i) {
		System.out.println("mainClass method(int i)");
	}
	
	static void method(int i,char c) {
		System.out.println("mainClass method(int i , char c)");
	}
	

	
	

}
