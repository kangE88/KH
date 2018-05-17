package you;

import main.SingletonClass;

public class youClass {
	
	private int youNumber;

	public int getYouNumber() {
		return youNumber;
	}

	public void setYouNumber(int youNumber) {
		this.youNumber = youNumber;
	}
	
	public void youMethod() {
		SingletonClass sc = SingletonClass.getInstence();
		youNumber = sc.Stnumber;
	}

	@Override
	public String toString() {
		return "youClass [youNumber=" + youNumber + "]";
	}
	
	

}
