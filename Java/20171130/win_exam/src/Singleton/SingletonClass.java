package Singleton;

import java.util.HashMap;

import dto.human;

public class SingletonClass {
	
	private static SingletonClass Instance;
	public HashMap<String, human> hm_list = null;
	
	public static SingletonClass getInstance() {
		
		if(Instance == null) {
			Instance = new SingletonClass();
		}
		return Instance;
	}
	
	private SingletonClass(){
		hm_list = new HashMap<String, human>();
	}
	
	public HashMap<String, human> get(){
		return this.hm_list;
	}
	
	public void putToHashmap(human human) {
		hm_list.put(human.getName(), human);
	}
	
	
}
