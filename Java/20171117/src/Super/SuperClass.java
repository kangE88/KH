package Super;

public class SuperClass {
	private int number;
	protected String name;
	/*
	 * protected
	 * 
	 * 자식 클래스에서는 접근을 허용, 외부접근은 안됨
	 *  
	 *  
	 */
	
	
	public void super_method() {
		System.out.println("SuperClass super_method()");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
