package Singleton;

import java.util.ArrayList;
import java.util.List;

import DTO.human;

public class humanS {
	
	private static humanS sc;
	
	public List<human> list;
	
	
	private humanS() {
		list = new ArrayList<human>();
	}

	public static humanS getInstence() {
		
		if(sc==null) {
			sc = new humanS();
		}
		
		return sc;
	}
	
	

}
