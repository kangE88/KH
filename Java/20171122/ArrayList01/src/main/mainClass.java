package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class mainClass {
	public static void main(String[] args) {
		/*
		 * 	List
		 * 	
		 * 	ArrayList(Vector)
		 * 		:	배열처럼 사용할 수 있는 목록
		 * 			선형구조	0-0-0-0-0-0-0
		 * 			List 중에 검색 속도가 빠르다
		 * 			관리가 index number 0 1 2 3 4
		 * 	
		 * 	LinkedList
		 * 		:	추가, 삭제 작업이 빈번하게 처리할경우 == 게임
		 * 			선형구조 0-0-0-0-0
		 * 
		 * 	HashMap
		 * 		:	key + valie
		 * 			TreeMap sorting
		 * 
		 */
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		//추가
		arrList.add(111);
		
		Integer in = new Integer(222);
		arrList.add(in);
		
		arrList.add(333);
		
		int len = arrList.size();		
		System.out.println("  "+len+"길이 ");
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		arrList.add(444);
		
		len = arrList.size();		
		System.out.println("  "+len+"길이 ");
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("-==-=-=-=-=-=-=-=-=-=");
		
		//원하는 위치에 추가
		arrList.add(2, 777);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		//삭제
		arrList.remove(1);
		
		len = arrList.size();		
		System.out.println("  "+len+"길이 ");
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		//검색
		System.out.println("=======검색=========");
		int findIndex = arrList.indexOf(333);
		System.out.println(findIndex);
		
		
		//수정
		System.out.println("=======수정=========");
		arrList.set(2, 222);
		/*
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		*/
		
		for(Integer in_ : arrList) {
			System.out.println("==>"+in_);
		}
		
		/*
		int arr[] = { 1, 2, 3};
		
		for (int i : arr) {
			
		}
		*/
		
		
		//String 
		List<String> list = new ArrayList<>();
		List<String> _list = new LinkedList<>();
		
		//추가
		list.add("aaa");
		_list.add("Ccc");
		System.out.println("추가 list ==>"+list);
		System.out.println("추가 _list ==>"+_list);
		System.out.println();
		
		list.add("bbb");
		_list.add("ddd");
		System.out.println("추가2 list ==>"+list);
		System.out.println("추가2 _list ==>"+_list);
		System.out.println();
		
		//삭제
		
		list.remove(0);
		_list.remove(0);
		System.out.println("삭제 list ==>"+list);
		System.out.println("삭제 _list ==>"+_list);
		System.out.println();
		
		//원하는곳에 추가
		list.add(0, "AAA");
		_list.add(0, "CCC");
		System.out.println("Select Add list ==>"+list);
		System.out.println("Select Add _list ==>"+_list);
		System.out.println();
		
		//검색
		int find = list.indexOf("AAA");
		System.out.println("검색 list==>"+find);
		int find2 = _list.indexOf("CCC");
		System.out.println("검색 _list==>"+find2);
		System.out.println();
		
		//수정
		list.set(0, "AaA");
		_list.set(0, "CcC");
		System.out.println("수정 list ==>"+list);
		System.out.println("수정 _list ==>"+_list);
		
		
	}

}
