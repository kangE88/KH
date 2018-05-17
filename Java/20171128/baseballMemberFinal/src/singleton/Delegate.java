package singleton;

import java.util.ArrayList;
import java.util.List;

import dto.Human;

public class Delegate {

	private static Delegate single = null;
	
	public List<Human> list; 
			
	private Delegate() {
		list = new ArrayList<Human>();
	}
	
	public static Delegate getInstance() {
		if(single == null) {
			single = new Delegate();
		}
		
		return single;
	}
}
