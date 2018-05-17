package main;

import java.util.Scanner;

import dao.daoClass;

public class mainClass {

	public static void main(String[] args) {

		/*
		 * loop
		 * 
		 * 어느 작업을 하시겠습니까?
		 * 
		 * 1. 학생 정보 추가
		 * 2. 학생 정보 삭제
		 * 3. 학생 정보 검색
		 * 4. 학생 정보 수정
		 * 5. 학생 정보 전체 출력
		 * 6. 종료
		 *  
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		daoClass da = new daoClass();
		
		
		while(true) {
			System.out.println("* 어느 작업을 하시겠습니까?");
			System.out.println();
			System.out.println("* 1. 학생 정보 추가    	");
			System.out.println("* 2. 학생 정보 삭제    	");
			System.out.println("* 3. 학생 정보 검색   	");
			System.out.println("* 4. 학생 정보 수정    	");
			System.out.println("* 5. 학생 정보 전체 출력");
			System.out.println("* 6. 종료          		");
			System.out.print("===>");
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
				case 1: 
					da.insert();
					break;
				case 2:
					da.delete();
					break;
				case 3:
					da.select();
					break;
				case 4:
					da.update();
					break;
				case 5:
					da.allPrint();
					break;
				case 6:
					System.out.println("잘가");
					break;
			}
			if(selectNum==6) {
				break;
			}
		}
		
	}

}
