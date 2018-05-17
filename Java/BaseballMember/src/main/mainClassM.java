package main;

import java.util.Scanner;

public class mainClassM {

	public static void main(String[] args) {
		/*
		 * 
		 * 	1. 선수 추가
		 * 	2. 선수 삭제
		 * 	3. 선수 검색
		 * 	4. 선수 수정
		 * 	5. 선수 모두 출력
		 * 	6. 데이터 저장
		 * 	7. 종료
		 *  
		 */
		
		Scanner sc =new Scanner(System.in);
		
		int choice;
		
		while(true) {
			System.out.println("* 	1. 선수 추가        ");
			System.out.println("* 	2. 선수 삭제        ");
			System.out.println("* 	3. 선수 검색        ");
			System.out.println("* 	4. 선수 수정        ");
			System.out.println("* 	5. 선수 모두 출력   ");
			System.out.println("* 	6. 데이터 저장      ");
			System.out.println("* 	7. 종료             ");
			
			System.out.print("원하는 메뉴 선택 ==>");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				break;
			}
		}

	}

}
