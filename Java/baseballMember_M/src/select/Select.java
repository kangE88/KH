package select;

import java.util.List;
import java.util.Scanner;

import Singleton.SingletonClass;
import dto.Human;

public class Select {
	public void Select() {
		
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
		
		System.out.print("데이터를 찾았습니다 >>>");
		System.out.println(list.get(findNum).toString());		
	}
}
