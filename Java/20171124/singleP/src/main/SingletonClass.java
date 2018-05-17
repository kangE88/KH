package main;

public class SingletonClass {
	
	private static SingletonClass single = null;
	public int Stnumber;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstence() {
		
		if(single == null) {
			single = new SingletonClass();
		}
		
		return single;
	}
	
	

}
