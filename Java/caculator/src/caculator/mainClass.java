package caculator;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		
		int result;
		
		result =	calProcess(50, "/", 5);
		
		System.out.println("result === "+result);
		
	}
	
	static int calProcess(int n1, String oper, int n2) {
						
		int result = 0;
		char c = oper.charAt(0);
		
		if(c == '+') {
			result = n1 + n2;
		}else if(c == '-') {
			result = n1 - n2;
		}else if(c == '*') {
			result = n1 * n2;
		}else if(c == '/') {
			result = n1 / n2;
		}else{
			System.out.println("연산자를 잘못 입력하여 계산이 불가능합니다. 0으로 출력됩니다.");
		}
		return result;
	}
/*
	static int plus(int n1, int n2) {
		return n1+n2;
	}
	static int minus(int n1, int n2) {
		return n1 - n2;		
	}
	static int multi(int n1, int n2) {
		return n1 * n2;	
	}
	static int div(int n1, int n2) {
		return n1 / n2;
	}
*/	
}
