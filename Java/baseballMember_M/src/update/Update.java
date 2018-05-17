package update;

import java.util.List;
import java.util.Scanner;

import Singleton.SingletonClass;
import dto.Batter;
import dto.Human;
import dto.Pitcher;

public class Update {
	public void Update() {
		Scanner sc = new Scanner(System.in);
		
		List<Human> list = SingletonClass.getInstance().getArray();
		
		System.out.print("검색하고 싶은 이름을 입력 >>>");
		String name = sc.next();
		
		// 검색
		int findNum = -1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) != null) {
				if(list.get(i).getName().equals(name)){
					findNum = i;
					break;
				}
			}
		}
		
		// 판별
		if(findNum == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		if(list.get(findNum) instanceof Pitcher) {
			Pitcher pit = (Pitcher)list.get(findNum);
		//	System.out.println(pit.toString());
			
			System.out.print("승:");
			int win = sc.nextInt();
			
			System.out.print("패:");
			int lose = sc.nextInt();
			
			System.out.print("방어율:");
			double defence = sc.nextDouble();
			
			pit.setWin(win);
			pit.setLose(lose);
			pit.setDefence(defence);
			
			System.out.println("성공적으로 수정되었습니다");
		}
		else {
			Batter bat = (Batter)list.get(findNum);
		//	System.out.println(bat.toString());
			
			System.out.print("타수:");
			int batCount = sc.nextInt();
			
			System.out.print("안타수:");
			int hit = sc.nextInt();
			
			System.out.print("타율:");
			double hitAvg = sc.nextDouble();
			
			bat.setHit(hit);
			bat.setBatCount(batCount);
			bat.setHitAvg(hitAvg);
			
			System.out.println("성공적으로 수정되었습니다");
		}
	}
}
