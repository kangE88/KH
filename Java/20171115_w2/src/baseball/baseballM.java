package baseball;

import java.util.Scanner;

public class baseballM {

	private int r_num[],u_num[];
	private boolean clear;
	
	
	//초기화
	public void init() {
		r_num = new int[3];
		u_num = new int[3]; 
		clear = false;
		
		random();
	}
	
	//random
	public void random() {
		boolean swit[] = new boolean[10];
		int r, w;
		
		for(int i = 0;i < 10; i++){
			swit[i] = false;	// 00000 00000
		}
		
		w = 0;
		while(w < 3){
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(swit[r] == false){
				swit[r] = true;		// 00100 00000 
				r_num[w] = r + 1;	// 1 ~ 10 
				w++;
			}
		}

		for(int i = 0;i < r_num.length; i++){
			System.out.println("r_num[" + i + "] = " + r_num[i]);
		}
	}
	
	//userInput
	public void userIntput() {
		Scanner sc = new Scanner(System.in);
		int w = 0;
		
		while(w < 3){				
			System.out.print((w + 1) + "번째 수:");
			u_num[w] = sc.nextInt();
			w++;
		}
	}
	
	//판정
	public void loop() {
		int w = 0;
		int strike = 0, ball = 0;
		boolean clear = false;
		
		while(w < 10) { 
			strike = 0;
			ball = 0;
						
			// user input
			userIntput();
			
			// finding
			// ball
			for(int i = 0;i < 3; i++){
				for(int j = 0;j < 3; j++){
					if(u_num[i] == r_num[j] && i != j){
						ball++;
					}
				}
			}
			// strike
			for(int i = 0;i < 3; i++){
				if(u_num[i] == r_num[i]){
					strike++;
				}
			}					
			
			if(strike > 2){
				clear = true;
				break;
			}
			
			// message
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			w++;
		}
	}
	
	//결과출력
	public void resultPrint() {
		if(clear){
			System.out.println("게임 클리어!!");
		}else{
			System.out.println("게임 오버~~");
		}
	}
}
