package Singleton;

import java.util.ArrayList;
import java.util.List;

import DTO.human;

public class Singleton {
	
	private static Singleton sc;
	
	public List<human> list;
	
	
	private Singleton() {
		list = new ArrayList<human>();
	}

	public static Singleton getInstence() {
		
		if(sc==null) {
			sc = new Singleton();
		}
		
		return sc;
	}
	
	

}
