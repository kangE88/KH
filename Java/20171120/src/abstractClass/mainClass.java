package abstractClass;

public class mainClass {

	public static void main(String[] args) {
		
		/* 
		 * 	abstract : 추상
		 * 		완전체는 아닌 완성품이 아닌 선언만 되어 있는 요소(추상클래스)
		 * 		interface
		 * 		하나 이상의 추상 메소드를 포함하고 있는 클래스 == 추상클래스
		 * 
		 * 		추상메소드 + 일반메소드
		 * 		생성이 불가능하다 -> 상속후 정의를 한 후에 
		 * 
		 */
		
		//abstractClass cls = new abstractClass();
		
		myClass cls = new myClass();
		
		cls.abMethod();
		cls.method();
		
		abstractClass scls = new myClass();
		
		scls.abMethod();
		scls.method();

	}

}
