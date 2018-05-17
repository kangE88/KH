package main;

import java.util.Scanner;

public class input {
	
	public static int ss=11;   		//static
	private int u_count = 0;		//member 변수
	private int[] number = null;	//member 변수
	private int sum = 0;			//member 변수
	private int avg = 0;			//member 변수
	
	
	public void inputmethod() {
		Scanner sc = new Scanner(System.in);

		System.out.print("몇개 숫자 입력 하시겠습니까 ? : ");
		u_count = sc.nextInt();
		
		number = new int[u_count];
		
		for(int i=0;i<number.length;i++) {
			System.out.print(number.length+"개 만큼 숫자를 입력하세요. : ");
			number[i] = sc.nextInt();
		}
		
		for(int i=0;i<number.length;i++) {
			System.out.print("number["+i+"] ==="+number[i]);
			System.out.println();
		}		
	}
	
	//sum
	public void sum_method() {
		for (int i = 0; i < number.length; i++) {
			sum = sum+number[i]; 
		}
	}
	
	//avg
	public void avg_method() {
		avg = sum / number.length;
	}
	
	//result
	public void resultPrint() {
		System.out.println("합계 == "+sum);
		System.out.println("평균 == "+avg);
	}
	
}
