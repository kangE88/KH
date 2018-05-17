package classes;

import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import singleton.Delegate;

public class updateClass {
	Scanner sc = new Scanner(System.in);	

	public updateClass() {
	}
	
	public void dataUpdate() {
		
		Delegate single = Delegate.getInstance();
		
		System.out.print("검색하고 싶은 이름을 입력 >>>");
		String name = sc.next();
		
		// 검색
		int findNum = -1;
		for (int i = 0; i < single.list.size(); i++) {
			Human h = single.list.get(i);
			if(h.getName().equals(name)) {
				findNum = i;
				break;
			}			
		}
		
		// 판별
		if(findNum == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		if(single.list.get(findNum) instanceof Pitcher) {
			Pitcher pit = (Pitcher)single.list.get(findNum);		
			
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
			Batter bat = (Batter)single.list.get(findNum);
			
		}
	}
}
