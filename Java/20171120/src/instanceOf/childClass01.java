package instanceOf;

public class childClass01 extends superClass {

	public void method() {
		System.out.println("childClass01 method()");
	}
	
	public void superMethod() {
		method();
	}
}
