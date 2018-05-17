package game;

import java.util.Scanner;

public class game {
	
	//user 입력 1~15 input
	
	//뺄 숫자 input
	
	//컴 뺄 숫자 random
	
	//random 정답
	
	private int sendMax;
	private int u_send;
	private int c_send;
	private boolean over;
	
	//private boolean uover;
	//private boolean cover;
	
	public void init() {
		sendMax = 0;
		u_send  = 0;
		c_send  = 0;
		
	}
	
	public void loop() {
		Scanner sc = new Scanner(System.in);
		int min=0;
		int max=0;
		
		System.out.println("Max 모래양 지정 : ");
		sendMax =sc.nextInt();
		
		System.out.println("모래 가져가기 최소값 : ");
		min = sc.nextInt();
		System.out.println("모래 가져가기 최대값 : ");
		max = sc.nextInt();
		
		while(true) {

			System.out.print("뺄 모래의 양을 선택하세요( "+min+" ~ "+max+" ) : ");
			u_send = sc.nextInt();
			
			if(u_send >= min && u_send <= max) {
				//user
				if((sendMax-u_send) >= 0){
					sendMax = sendMax - u_send;
				}else{
					over = true;
					//System.out.println("user 패배");
					break;
				}
				//com
				c_send = (int)(Math.random()*(max-min))+min;
				sendMax = sendMax - c_send;

				if((sendMax-c_send) >= 0) {
					System.out.println("컴퓨터가 빼내었습니다."+sendMax);
				}else {
					over =false;
					//System.out.println("com 패배");
					break;
				}
			}else{
				System.out.println("잘못입력하셨습니다.");
			}		
			
		}
	}
	/*
	public boolean userTurn(int min, int max) {
		over = false;
		if(u_send >= min && u_send <= max) {
			if((sendMax-u_send) >= 0){
				sendMax = sendMax - u_send;
			}else{
				over = true;
			}
		}else{
			System.out.println("잘못입력하셨습니다.");
		}
		return over;
	}
	
	public boolean comTurn(int min, int max) {
		if((sendMax-c_send) >= 0) {
			c_send = (int)(Math.random()*(max-min))+min;
			sendMax = sendMax - c_send;
			System.out.println("컴퓨터가 빼내었습니다."+sendMax);
		}else {
			over = ture;
		}
		return over;
	}
	
	*/
	public void resultPrint() {
		
		if(over) {
			System.out.println("player 패배!");
		}else{
			System.out.println("com 패배!");
		}
		
	}
	
}
