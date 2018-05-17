import java.util.Random;

class cardShuffle
{
	public static void main(String[] args) 
	{

/*
		//	card 0~51
		// card select 
		// 0-12 1-10 11  j 12  q 12 k 스페이드
		// 다이아 하트 클로버

		//

		int w;
		int r;

		int r_card[] = new int[52];

		String sp, da, ha, clo;

		boolean swit[] = new boolean[52]; 

		r_card = 0;

		for(int i = 0;i < 52; i++){
			swit[i] = false;	
		}

		w = 0;
		r = 0;
		while(w < 1){
			r = (int)(Math.random() * 52);	 // 0 - 51
			if(swit[r] == false){
				swit[r] = true;		
				r_card = r + 1;	// 1 ~ 10 
				w++;
			}
		}

		System.out.println(r_card); 

		

		//52 	13 13 13 13
		//11 12 13 // 24 25 26 // 37 38 39 // 50 51 52
		//1 - 10 스페이드 13
		//14 - 23 다이아  26
		//27 - 36 하트    39
		//40 - 49 클로버  52

		if(r_card > 1 && r_card < 14){
			System.out.println("스페이드");
		}else if(r_card > 13 && r_card < 27){
			System.out.println("다이아");
		}else if(r_card > 26 && r_card < 40){
			System.out.println("하트");
		}else if(r_card > 39 && r_card < 53){
			System.out.println("클로버");
		}
		**/


		int number[] = new int[52];
		
		boolean swit[] = new boolean[52];

		int w, r;

		w= 0;

		//초기화
		for(int i=0;i<swit.length;i++){
			swit[i] = false;
		}

		//random 1 - 52
		while( w< 52){
			r = (int)(Math.random()*52);
			if(!swit[r]){
				swit[r] = true;
				number[w] = r; //+1;
				w++;
			}
		}
		
		for(int i =0; i< number.length;i++){
			System.out.println("number["+i+"] == "+number[i]);
		}

		/*
			0 - 51
			숫자 + 1    1 - 13

			( 0 - 51 % 13 )  + 1 -> 1 - 13 카드 숫자

			숫자 / 13 
			0 - 12 = 0
			13 - 25 = 1
			25 - 38 = 2

		*/

		System.out.println();

		int cardNum;
		int cardPic;

		for(int i = 0; i < number.length;i++){
			cardNum = ( number[i] % 13 ) + 1;
			// A - 10 J Q K

			if(cardNum == 1){
				System.out.print("card Number : "+ number[i] + ", A");
			}else if(cardNum == 11){
				System.out.print("card Number : "+ number[i] + ", J");
			}else if(cardNum == 12){
				System.out.print("card Number : "+ number[i] + ", Q");
			}else if(cardNum == 13){
				System.out.print("card Number : "+ number[i] + ", K");
			}else{
				System.out.print("card Number : "+ number[i]);
			}

			//무늬
			cardPic = number[i] / 13;

			switch(cardPic){
				case 0:
					System.out.println(" 스페이드 ");
					break;
				case 1:
					System.out.println(" 다이아 ");
					break;
				case 2:
					System.out.println(" 하트 ");
					break;
				case 3:
					System.out.println(" 클로버 ");
					break;
			}
		}



	
	}
}
