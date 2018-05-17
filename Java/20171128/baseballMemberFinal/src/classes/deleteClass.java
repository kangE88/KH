package classes;

import java.util.Scanner;

import dto.Human;
import singleton.Delegate;

public class deleteClass {
	
	Scanner sc = new Scanner(System.in);
	
	public deleteClass() {
	}
	
	public void dataDelete() {		
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
		
		single.list.remove(findNum);
	}

}
