package Singleton;

import java.util.ArrayList;

import dto.Human;

public class SingletonClass {
	
	private static SingletonClass Instance;
	private static ArrayList<Human> list = null;
	
	public static SingletonClass getInstance(){
		
		if(Instance == null) {
			Instance = new SingletonClass();
		}
		return Instance;
	}
	
	private SingletonClass() {
		list = new ArrayList<Human>();
	}
	
	public ArrayList<Human> getArray(){
		return this.list;
	}
	
	public void addToArray(Human human) {
		list.add(human);
	}
	
}
