package interfaceClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 	interface
		 * 	추상 메소드만 갖는다 하지만 abstract는 붙이지 않는다.
		 * 	일반메소드는 포함이 불가능하다.
		 * 	interface : 추상 메소드 == (prototype)정의만 되어있는 메소드
		 * 	abstract : 추상 메소드 + 일반메소드 
		 * 
		 * 	생성하지 못한다. 상속 받은 클래스에서 메소드를 정의하고 생성하여 사용할 수 있다.
		 */
		
		//myinterface mi = new myinterface();
		
		
		myClass cls = new myClass();
		cls.method();

		
		youClass ycls = new youClass();
		ycls.method();
		ycls.func();
		
		myinterface mycls = new myClass();
		mycls.method();
		
		myinterface youcls = new youClass();
		youcls.method();
		youcls.func();
		
		if(youcls instanceof youClass) {
			youClass y = (youClass)youcls;
			y.youMethod();
		}
		
		myinterface mif = new myinterface() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void func() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
