package insert;

import java.util.Scanner;

import Singleton.SingletonClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;



public class Insert {
	
	public void Insert(int memNumber) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println(">>> 선수등록");
		System.out.println("투수(1)/타자(2) 중 등록하고 싶은 포지션을 입력해 주십시오");
		System.out.print(">>>>>>>>");
		
		int choice = sc.nextInt();
		
		// Human
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("생년월일:");
		String birth = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("키:");
		double height = sc.nextDouble();
		
		Human human;
		
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

			human = new Batter(memNumber+1000, name, birth, age, height, batCount, hit, hitAvg);
			
		}
		
		SingletonClass.getInstance().addToArray(human);
		//System.out.println("****** "+SingletonClass.getInstance().getArray());
	}
		

}
