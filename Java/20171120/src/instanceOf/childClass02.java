package instanceOf;

public class childClass02 extends superClass {

	public void func() {
		System.out.println("childClass02 func()");
	}
	public void superMethod() {
		func();
	}
}
