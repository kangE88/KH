package method;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * function : 함수. 독립적 
		 * 
		 * method : 클래스에 소속되어 있는 함수
		 * 
		 * 
		 * 구성요소
		 * 
		 * parameter : 인수, 인자 (들어가는 값)
		 * 
		 * return 돌아 오는 값
		 * 
		 * return 값(자료형) 함수명(자료형 자료형 변수(가상인수))
		 * 
		 * int funcNamge(char c, float f){
		 * 
		 * return 2;
		 * }
		 * 
		 * 
		 */
		
		func1();
		
		
		int i;
		i = func2(10);
		System.out.println("i == "+i);
		
		func3('W',123.456);
		
		String str;
		
		str = func4();
		System.out.println("str=== "+str);
		
		func5('A', 1, 123.123,"Hello");
		
		// 한문자를 넣으면 ASCII코드 값으로 리턴되어 나오도록 함수를 작성
		int key;
		key = charASCKeyValue('a'); 
		System.out.println("a 의 아스키코드 값은 ? "+key);
		
		// 숫자를 인자에 넣으면 정수인지 실수인지  구분
		intQdouble("1.13");
		
	}
	
	static boolean intQdouble(String s) {
		boolean r = false;
		char c;
		for(int i=0;i<s.length();i++) {
			c = s.charAt(i);
			if(c== '.') {
				r = true;
				break;
			}
		}
		if(r==true) {
			System.out.println("실수");
		}else {
			System.out.println("정수");
		}
		return r;
	}
	
	static int charASCKeyValue(char c){
		return (int)c;
	}
	
	
	// 1 입출력 없는 함수
	static void func1() {
		System.out.println("func1 호출");
	}
	
	// 입력만 있는 함수
	static int func2(int i) {
		int r;
		r = i * 2;
		return r;
	}
	
	//입출력 없는 함수
	static void func3(char c, double d) {
			System.out.println("c = "+c);
			System.out.println("d = "+d);
			
			System.out.println("func3(char c, double d) 호출  " + c +"  "+ d);
		}
	
	static String func4() {
		System.out.println("func4 호출");
		return "Hello";
	}
	
	// 대문자 -> 소문자
	static void func5(char c, int i, double d, String s) {
		c = (char)(int)( c + 32 );  //97(a) 65 (A)
		System.out.println("c === "+c);
	}
	
}
