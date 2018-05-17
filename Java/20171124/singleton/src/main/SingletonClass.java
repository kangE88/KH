package main;

public class SingletonClass {

	
	//delegate 대리인
	private static SingletonClass single = null;
	public int scNumber;
	
	private SingletonClass() {
	}
	
	public static SingletonClass getInsance() {
		if(single == null) {
			single = new SingletonClass();
			
		}
		return single;
	}
	
	
}
