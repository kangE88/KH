package jinsuChange;

import java.util.Scanner;

public class change10To2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		String result ="";
		
		int number;
		int temp;
		int temp2;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("바꿀 숫자를 입력하세요.(10진수->2진수) : ");
		input = sc.next();
		
		number = Integer.parseInt(input);
		//10 -> 1010
		while(true) {
				if(number >= 1) {
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
		System.out.print(result);
	}

}
