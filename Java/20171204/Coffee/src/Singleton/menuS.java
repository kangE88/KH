package Singleton;

import java.util.ArrayList;
import java.util.List;

import DTO.coffee;

public class menuS {
	
	private static menuS ms;
	
	public List<coffee> list;

	private menuS() {
		list = new ArrayList<coffee>();
		
		list.add(new coffee("헤이즐넛 카라멜 모카", 4800, 5300, 5800));
		list.add(new coffee("카라멜  마끼아또", 4300, 4800, 5300));
		list.add(new coffee("화이트 초콜릿 모카", 4300, 4800, 5300));
		list.add(new coffee("카라멜 모카", 4300, 4800, 5300));
		list.add(new coffee("카페 모카", 3800, 4300	, 4800));
		list.add(new coffee("카라멜 라떼", 3800, 4300, 4800));
		list.add(new coffee("카페 라떼", 3300, 3800, 4300));
		list.add(new coffee("카푸치노", 3300, 3800, 4300));
		list.add(new coffee("아메리카노", 2800, 3300, 3800));
		list.add(new coffee("오늘의 커피", 2500, 3000, 3500)); 
		
	}

	public static menuS getInstence() {
		
		if(ms==null) {
			ms = new menuS();
		}
		
		return ms;
	}
	
	

}
