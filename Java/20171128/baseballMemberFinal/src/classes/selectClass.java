package classes;

import java.util.Scanner;

import dto.Human;
import singleton.Delegate;

public class selectClass {
	Scanner sc = new Scanner(System.in);
	
	public selectClass() {
	}
	
	public void dataSelect() {
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
		
		System.out.print("데이터를 찾았습니다 >>>");
		System.out.println(single.list.get(findNum).toString());
	}
}
