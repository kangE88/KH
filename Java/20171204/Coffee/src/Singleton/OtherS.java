package Singleton;

import java.util.HashMap;

import DTO.other;

public class OtherS {
	private static OtherS sc;
	
	public HashMap<Integer, other> list;
	
	
	private OtherS() {
		list = new HashMap<Integer, other>();
	}

	public static OtherS getInstence() {
		
		if(sc==null) {
			sc = new OtherS();
		}
		
		return sc;
	}
	
}
