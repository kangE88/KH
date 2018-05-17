import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class jinsuChange {

	public static void main(String[] args) {
	
		/*
		 1. 10진수 -> 2진수
		 2. 2진수 -> 10진수
		 3. 10진수 -> 16진수
		 4. 16진수 -> 10진수
		 5. 2진수 -> 16진수
		 6. 16진수 -> 2진수
		 */
		
		String changeStr;
		int menu_num;
		
		//메뉴 선택
		menu_num = menuChoise();
		System.out.println(menu_num);
		
		//입력
		changeStr = input();
		
		//바뀔 메뉴
		jinsuChange(menu_num, changeStr);
		
		//결과
		//resultPrint()
	}
	static int menuChoise() {
		int menu;
		
		System.out.println("===== 메뉴를 선택하세요 =======");
		System.out.println("1. 10진수 -> 2진수");
		System.out.println("2. 2진수 -> 10진수");
		System.out.println("3. 10진수 -> 16진수");
		System.out.println("4. 16진수 -> 10진수");
		System.out.println("5. 2진수 -> 16진수");
		System.out.println("6. 16진수 -> 2진수");
		System.out.print("===> ");
		
		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();

		return menu;
	}
	
	static String input() {
		
		String input;
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("바꿀 값을 입력하세요.  : ");
		input = sc.next();
		
		//number = Integer.parseInt(input);
		
		return input;
		
	}	
		
	static void jinsuChange(int menu, String str) {
		
		String result ="";
		
		int number;
		
		number = Integer.parseInt(str);
		
		int temp=0;
		int temp2 = 0;
		
		//10 -> 2
		if(menu==1) {
			while(true) {
				if(number != 0) {
					//값
					temp = number % 2; //0
					//나누기
					temp2 = number / 2; //5
					//나누기 후 남은 숫자 다시 number에 넣기
					number = temp2; //5
					result = temp+result;
				}else {
					break;
				}
		}
			System.out.print("10진수 "+str+"를 2진수로 변환한 값 == "+result);
		
		}else if(menu==2) {	
			//문자열로 받은 후  배열 생성
			String c_number[];
			
			c_number = new String[str.length()];
			
			//result =String.valueOf(Integer.parseInt(str, 2));
			
			for(int i=0;i<str.length();i++) {
				c_number[i] = String.valueOf(str.charAt(i));
				System.out.println(c_number[i]);
				
				
			}
			
			
			System.out.print("2진수 "+str+"를 10진수로 변환한 값 == "+result);
		}
	}
}
