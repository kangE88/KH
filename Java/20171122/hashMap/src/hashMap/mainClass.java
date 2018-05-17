package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * hashMap  : 사전
		 * 			사과	:	apple
		 * 			(key	:	value)	-> 1 pair
		 * 			key 값은 중복 불가
		 * 			key 값은 수정 불가
		 * 
		 * 			tree 구조
		 * 
		 * Treemap	=	hashMap + sorting	
		 *  
		 * 
		 */
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();

		//추가
		hMap.put(1, "1번");
		hMap.put(2, "2번");
		hMap.put(3, "3번");
		
		//취득
		String value = hMap.get(2);
		System.out.println("value = " + value);
		
		
		//검색
		boolean b = hMap.containsKey(new Integer(3));
		System.out.println("b=== "+b);
		
		if (hMap.containsKey(2)) {
			value = hMap.get(2);
			System.out.println("value == "+value);
		}
		
		//삭제
		String s = hMap.remove(2);
		System.out.println("S=== "+s);
		
		b = hMap.containsKey(new Integer(2));
		System.out.println("b ==="+b);
		
		
		//수정
		hMap.replace(3, "3+30+300");
		hMap.put(3, "3");
		
		
		//데이터 전체 출력
		// Iterator -> while
		
		
		Iterator<Integer> keys = hMap.keySet().iterator();
		
		while (keys.hasNext()) {
			Integer key = keys.next();
			System.out.println("key : "+key+ " value : "+hMap.get(key));
			
		}
	
		//for each
		for (Integer i : hMap.keySet()) {
			System.out.println("(for each)key : "+i + " value"+hMap.get(i));
		}

		//HashMap<<Integer, Human>
		
		HashMap<String, String> sMap = new HashMap<String, String>();
		
		
		// 추가
		sMap.put("cccc", "사과");
		sMap.put("aaaa", "배");
		sMap.put("bbbb", "포도");

		// 취득
		String val = sMap.get("pear");
		System.out.println("val = "+val);
		
		// 수정
		sMap.replace("aaaa", "애플");
		val = sMap.get("apple");
		System.out.println("val = "+val);
		
		// 정렬
		TreeMap<String, String> treeMap = new TreeMap<String, String>( sMap );
		
		// 오름 차순 정렬
		Iterator<String> itkey = treeMap.keySet().iterator();
		
		// 내림 차순 정렬
		Iterator<String> itkey_de = treeMap.descendingKeySet().iterator();

		while(itkey.hasNext()) {
			String key = itkey.next();
			System.out.println("key == "+key+ " value == "+treeMap.get(key));
		}
		
		while(itkey_de.hasNext()) {
			String key = itkey_de.next();
			System.out.println("key == "+key+ " value == "+treeMap.get(key));
		}
		
		
		HashMap<Integer, DTO> myMap = new HashMap<>();
		
		// 추가
	
		myMap.put(1, new DTO(0, "홍길동"));
		myMap.put(2, new DTO(1, "길동"));
		myMap.put(3, new DTO(2, "동"));
		
		Iterator<Integer> mykey = myMap.keySet().iterator();
		
		while(mykey.hasNext()) {
			Integer key = mykey.next();
			System.out.println("key : "+key+ " value : "+myMap.get(key));
		}
		
		// 검색
		//boolean bl = myMap.containsKey(3);
		
		if (myMap.containsKey(2)) {
			DTO dto = myMap.get(2);
			System.out.println("dto == "+dto);
		}

		// 수정
		myMap.replace(1, new DTO(3, "수정"));
		
		// 삭제
		
		myMap.remove(2);

		// 모두출력
		
		mykey = myMap.keySet().iterator();
		
		while(mykey.hasNext()) {
			Integer key = mykey.next();
			System.out.println("key : "+key+ " value : "+myMap.get(key));
		}
		

	}

}
