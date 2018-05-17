package classes;

import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import singleton.Delegate;

public class insertClass {
	Scanner sc = new Scanner(System.in);
	
	private int memNumber;	// 선수: 투수(1000) 타자(2000)
	
	public insertClass() {
		memNumber = 1000;
		
		Delegate single = Delegate.getInstance();
		
		if(single.list.size() == 0) return;
		
		// number를 다음번호로 하기 위한 처리
		int len = single.list.size()-1;
		Human h = single.list.get(len);
		int nextNum = h.getNumber() % 1000;
		nextNum = nextNum + 1;
		
		memNumber = nextNum + memNumber;
		System.out.println(">>>>>>>>" + memNumber);		
	}
	
	public void dataInsert() {
		
		System.out.println(">>> 선수등록");
		System.out.println("투수(1)/타자(2) 중 등록하고 싶은 포지션을 입력해 주십시오");
		System.out.print(">>>>>>>>");
		
		int choice = sc.nextInt();
		
		Human human; 
		
		// Human
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("생년월일:");
		String birth = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("키:");
		double height = sc.nextDouble();
		
		if(choice == 1) {	// 투수
			System.out.print("승:");
			int win = sc.nextInt();
			
			System.out.print("패:");
			int lose = sc.nextInt();
			
			System.out.print("방어율:");
			double defence = sc.nextDouble();
			
			human = new Pitcher(memNumber, name, birth, age, height, win, lose, defence);
		}
		else {				// 타자			
			System.out.print("타수:");
			int batCount = sc.nextInt();
			
			System.out.print("안타수:");
			int hit = sc.nextInt();
			
			System.out.print("타율:");
			double hitAvg = sc.nextDouble();
			
			human = new Batter(memNumber + 1000, name, birth, age, height, batCount, hit, hitAvg);			
		}
		
		Delegate single = Delegate.getInstance();
		
		single.list.add(human);	
		memNumber++;
	}

}





