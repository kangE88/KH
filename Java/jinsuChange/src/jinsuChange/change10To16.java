package jinsuChange;

import java.util.Scanner;

public class change10To16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		String result ="";
		
		int number;
		int temp;
		int temp2;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("바꿀 숫자를 입력하세요.(10진수->16진수) : ");
		input = sc.next();
		
		number = Integer.parseInt(input);
		//100 -> 6
		while(true) {
				if(number >= 1) {
					//값
					temp = number % 16; //0	
					System.out.println("temp == "+temp);
					//나누기
					temp2 = number / 16; //5
					System.out.println("temp2 == "+temp2);
					//나누기 후 남은 숫자 다시 number에 넣기
					number = temp2; //5
					System.out.println("number == "+number);
					
					
					//10 이상 문자열로 변환하여 결과값에 넣기
					if(temp == 10){
						result = "A"+result;
					}else if(temp == 11) {
						result = "B"+result;
					}else if(temp == 12) {
						result = "C"+result;
					}else if(temp == 13) {
						result = "D"+result;
					}else if(temp == 14) {
						result = "E"+result;
					}else if(temp == 15) {
						result = "F"+result;
					}else {
						result = temp+result;
					}	
				}else {
					break;
				}
		}
		System.out.print(result);
	}
}
