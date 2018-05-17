package sGame;

import java.util.Scanner;

public class sotda {

	public static void main(String[] args) {
		
		int userCard[] = new int[2];
		int comCard[] = new int[2];
		int card[];
		
		String regame;
		
		int result = 0;

		int w_count = 0;
		int d_count = 0;
		int l_count = 0;

		
		
		while(true) {
			//카드 랜덤 생성
			card = cardShuffle();
			
			//카드 배분
			cardthrow(userCard, comCard, card);
			
			//점수 체크
			result = scoreck(userCard, comCard);
			
			
			if(result == 3) {
				w_count++;
			}else if(result == 2) {
				d_count++;
			}else {
				l_count++;
			}
			System.out.println("승 :"+w_count + " 패 : "+l_count+" 무 : "+d_count);
			
			//regame
			regame = regame();
			if(	"Y".equals(regame) || "y".equals(regame)) {
				continue;
			}else {
				break;
			}
		}
		
	}

	static int[] cardShuffle() {
		int w, r;
		boolean swit[] = new boolean[20];
		int card[] = new int[20];
		
		for(int i=0;i<swit.length;i++){
			swit[i] = false;
		}
		//random(1~20) 1~10 * 2
		w = 0;
		while(w< 20) {
			r = (int)(Math.random()*20);
			if(swit[r] == false) {
				swit[r] = true;
				card[w] = r + 1;
				
				if(card[w] > 10) {
					card[w] = card[w] -10;
				}
				w++;
			}
		}
		
/*			for(int i=0;i<card.length;i++) {
				System.out.println("card[" + i + "] = " + card[i]);
			}*/
			return card;
		
	}
	static void cardthrow(int userCard[], int comCard[], int card[]) {
		
		int temp;
		//com, user 할당
		userCard[0] = card[0];
		userCard[1] = card[1];
		
		comCard[0] = card[2];
		comCard[1] = card[3];
		
		if(userCard[0] > userCard[1]) {
			temp = userCard[0];
			userCard[0] = userCard[1];
			userCard[1] = temp;
			
		}
		if(comCard[0] > comCard[1]) {
			temp = comCard[0];
			comCard[0] = comCard[1];
			comCard[1] = temp;
		}
		
		for(int i=0; i<userCard.length;i++) {
			System.out.println("userCard[" + i + "] = "+userCard[i]);
		}
		
		for(int i=0; i<comCard.length;i++) {
			System.out.println("comCard[" + i + "] = "+comCard[i]);
		}
	}
	static int scoreck(int userCard[], int comCard[]) {
		int player, com;
		
		int result;
		
		// 점수 체크
		if(userCard[0] == userCard[1]) {
			player = userCard[0] +20;
		}else if(userCard[0] == 1 && userCard[1] == 2) {
			player = 20;
		}else if(userCard[0] == 1 && userCard[1] == 4) {
			player = 19;
		}else if(userCard[0] == 1 && userCard[1] == 9) {
			player = 18;
		}else if(userCard[0] == 1 && userCard[1] == 10) {
			player = 17;
		}else if(userCard[0] == 4 && userCard[1] == 10) {
			player = 16;
		}else if(userCard[0] == 4 && userCard[1] == 6) {
			player = 15;
		}else{
			player = (userCard[0] + userCard[1]) % 10;
		}
		
		if(comCard[0] == comCard[1]) {
			com = comCard[0] +20;
		}else if(comCard[0] == 1 && comCard[1] == 2) {
			com = 20;
		}else if(comCard[0] == 1 && comCard[1] == 4) {
			com = 19;
		}else if(comCard[0] == 1 && comCard[1] == 9) {
			com = 18;
		}else if(comCard[0] == 1 && comCard[1] == 10) {
			com = 17;
		}else if(comCard[0] == 4 && comCard[1] == 10) {
			com = 16;
		}else if(comCard[0] == 4 && comCard[1] == 6) {
			com = 15;
		}else{
			com = (comCard[0] + comCard[1]) % 10;
		}
		
		System.out.println("user Result :"+player);
		System.out.println("com Result :"+com);

		
		if(player > com) {
			System.out.println("player  Win");
			result = 3;
		}else if(player == com){
			System.out.println("draw");
			result = 2;
		}else {
			System.out.println("com Win");
			result = 1;
		}

		return result;
		
	}
	static String regame() {
				
		String regame = "";
		
		Scanner sc = new Scanner(System.in);

		System.out.print("다시하시겠습니까? Y/N = ");
		regame = sc.next();
		
		return regame;
	}
}
