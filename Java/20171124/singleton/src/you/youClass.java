package you;

import main.SingletonClass;

public class youClass {
	private int youNumber;
	private int youNumber_2;
	
	
	public youClass() {
		youNumber_2 = 22;
	}

	public int getYouNumber() {
		return youNumber;
	}

	public void setYouNumber(int youNumber) {
		this.youNumber = youNumber;
	}

	public int getYouNumber_2() {
		return youNumber_2;
	}

	public void setYouNumber_2(int youNumber_2) {
		this.youNumber_2 = youNumber_2;
	}

	public void yMethod() {
		SingletonClass sc = SingletonClass.getInsance();
		youNumber = sc.scNumber;
		sc.scNumber = youNumber_2;
		
		
	}
	
	@Override
	public String toString() {
		return "youClass [youNumber=" + youNumber + "]";
	}	
	
}
