package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import DAO.DAOClass;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DAOClass dao = new DAOClass();
		
		while(true) {
		
			System.out.println("1. 선수 추가");
			System.out.println("2. 선수 삭제");
			System.out.println("3. 선수 찾기");
			System.out.println("4. 선수 교체");
			System.out.println("5. 전체 출력");
			System.out.println("6. 파일에 저장");
			System.out.println("7. 파일에서 불러오기");
			System.out.print("==>");
			
			try {
				int selNum = sc.nextInt();
				
				switch(selNum) {
				case 1:
					dao.Insert();
					break;
				case 2:
					dao.Delete();
					break;
				case 3:
					dao.Select();
					break;
				case 4:
					dao.Update();
					break;
				case 5:
					dao.allPrint();
					break;
				case 6:
					dao.Filesave();
					break;
				case 7:
					dao.Fileload();
					break;
				}
			}catch(InputMismatchException IE){
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			
			
			
		}
		
	
		
		
	}

}
