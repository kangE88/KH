package main;

import java.util.ArrayList;

import dao.myClass;

public class mainClass {

	public static void main(String[] args) {

		ArrayList<myClass> list = new ArrayList<myClass>();
		
		//추가
		myClass cls = new myClass(1, "홍길동");
		list.add(cls);
		
		list.add(new myClass(2, "일지매"));
		
		cls = new myClass(3, "임꺽");
		list.add(cls);
		
		System.out.println();
		
		//원하는 곳에 추가
		cls = new myClass(4, "성춘향");
		list.add(0, cls);
		
		int len = list.size();
		
		System.out.println("len == "+len);
		
		for (int i = 0; i < list.size(); i++) {
			myClass my = list.get(i);
			System.out.println("list[ " + i +
					" ]== "+my.toString());
		}
		
		//삭제
		System.out.println("====삭제===="+list.remove(2).getName());
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			myClass my = list.get(i);
			System.out.println("list[ " + i + " ]== "+my.toString());
		}
		
		//검색
		
		String name ="홍길동";
		int findIndex =  -1;
		for (int i = 0; i < list.size(); i++) {
			myClass my = list.get(i);
			if(my.getName().equals(name)) {
				findIndex = 1;
				break;
			}
		}
		
		System.out.println("찾았습니다. 찾은 index ==>"+findIndex+", data ==>"+list.get(findIndex).toString());
		
		//수정
		cls = new myClass(5,"정수동");
		list.set(1, cls);
		
		for (int i = 0; i < list.size(); i++) {
			myClass my = list.get(i);
			System.out.println("list[ " + i + " ]== "+my.toString());
		}

	}

}
