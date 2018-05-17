package Singleton;

import java.util.ArrayList;
import java.util.List;

import DTO.human;

public class SingletonClass {
	
	private static SingletonClass sc;
	
	public List<human> list;
	
	private SingletonClass() {
		list = new ArrayList<human>();
		
	}
	
	public static SingletonClass getInstance() {
		
		if(sc == null) {
			sc = new SingletonClass();
		}
		return sc;
	}

}
