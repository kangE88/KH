package baseballMemberFinal;

import java.util.Scanner;

import dao.DaoClass;
import dao.DaoInter;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 	1. 선수 추가
		 *  2. 선수 삭제
		 *  3. 선수 검색
		 *  4. 선수 수정
		 *  5. 선수 모두 출력
		 *  6. 데이터 저장
		 *  7. 방어율 순위 (오름)
		 *  8. 타율 순위 (내림)  
		 *  9. 종료
		 * 
		 */		
		
		int choice; 
		
		DaoInter dao = new DaoClass();		
		
		while(true) {
			System.out.println("1.선수 추가");
			System.out.println("2.선수 삭제");
			System.out.println("3.선수 검색");
			System.out.println("4.선수 수정");
			System.out.println("5.선수 모두 출력");
			System.out.println("6.데이터 저장");
			System.out.println("7.종료");
			
			System.out.print("원하시는 작업의 번호를 입력해 주십시오 = ");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:	
					dao.insert();
					break;
				case 2:	
					dao.delete();
					break;
				case 3:
					dao.select();
					break;
				case 4:	
					dao.update();
					break;
				case 5:
					dao.allPrint();
					break;
				case 6:
					dao.saveData();
					break;
				case 7:
					break;			
			}			
		}
	}

}
