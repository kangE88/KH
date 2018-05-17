package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Human;
import dto.student;

//Data Access Object
public class daoClass extends Human{

	private student arrStu[];
	private int count;
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<student> st = new ArrayList<student>();
	
	public daoClass() {
		arrStu = new student[20];
		count = 0;
	}
	
	/*
	 * 
	 * 추가 insert
	 * 
	 * 삭제 delete
	 * 
	 * 검색 search --> select
	 * 
	 * 수정 update
	 * 
	 * 
	 */

	//추가 - 배열 데이터 추가
	public void insert() {
		System.out.print("번호를 입력해주세요 : ");
		int number = sc.nextInt();
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("주소를 입력해주세요 : ");
		String address = sc.next();
		System.out.println("국어 점수 입력 : ");
		int ko = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		/*
		 * 아래 한줄과 같은 개념
		student st = new student();
		
		st.setNumber(number);
		st.setName(name);
		st.setAddress(address);
		
		*/
		
		//student st = new student(ko, eng, math);
		
		student stC = new student(ko, eng, math, number, name, address);
		

		
		if(count <20) {
			st.add(count, stC);
			count++;
		}else {
			System.out.println("20명까지 저장이 가능합니다.");
		}
	}
	
	//삭제 -배열 데이터 빈칸
	public void delete() {
		
		int num = select();
		
		st.remove(num);

		System.out.println("삭제되었습니다.");
		
	}
	
	//검색
	public int select() {
		System.out.println("===");
		//무엇을 검색하시겠습니까?
		System.out.println("검색할 이름을 입력하세요 :");
		String search = sc.next();
		
		int f_arrNum = -1;
		
		for (int i = 0; i < st.size(); i++) {
			if(st.get(i).getName().equals(search)) {
				System.out.println("배열["+i+"]"+"에서 "+search+"를 찾았습니다.");
				f_arrNum = i;
				break;
			}else {
				System.out.println("찾지 못했습니다.");
				break;
			}
		}
		return f_arrNum;
	}
	
	//수정
	public void update() {
		String cName="";
		
		int num = select();
		
		System.out.println("바꿀이름을 입력하세요 :");
		cName = sc.next();
		
		//arrStu[num].setName(cName);

		st.get(num).setName(cName);
		
		System.out.println("변경되었습니다.");
		
	}
	//전체 출력
	public void allPrint() {
		for (int i = 0; i < st.size(); i++) {
			if(st.get(i)!=null) {
				System.out.println("st[ "+i+" ]== "+st.get(i));
			}
		}
	}

}
