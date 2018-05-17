import java.util.Scanner;
import java.util.Random;

class exam_3_20171103 
{
	public static void main(String[] args) 
	{
		int player;

		String hand[];
		String com_hand[];
		
		String t_hand;

		int hands_c;
		int com_count;

		int hand_p[];

		int h_result;

		int result;

		hand = new String[2];
		com_hand = new String[2];
		hand_p = new int[2];

		hands_c = 0;
		com_count = 0;
		h_result = 0;
		result = 0;

		Scanner scan = new Scanner(System.in);

		while(true){
			for(int i=0;i<2;i++){
				System.out.print("가위 바위 보  (입력) "+(i+1)+" / 2 번째 입력 : ");
				hand[i] = scan.next();

				//입력받은 값 숫자로 변환
				if("가위".equals(hand[i]) || "바위".equals(hand[i]) || "보".equals(hand[i])){
					if(hand[i] == "가위"){
						hand_p[i] = 0;
					}else if(hand[i] == "바위"){
						hand_p[i] = 1;
					}else{
						hand_p[i] = 2;
					}
					//2개 입력 카운트
					hands_c++;
				}else{
					System.out.println("올바른값을 입력하세요 . (가위, 바위, 보)");
					continue;
				}
			}
			//2개입력 시 break;
			if(hands_c == 2){
				break;
			}
		}
		//하나뺴기
		while(true){
			System.out.print("무엇을 내시겠습니까 ? : ");
			t_hand = scan.next();

			if("가위".equals(t_hand)){
					h_result = 0;
			}else if("바위".equals(t_hand)){
					h_result = 1;
			}else{
					h_result = 2;
			}
			
			System.out.println("h_result 1====="+h_result);

			//내는 값 체크
				if(hand_p[0] == h_result || hand_p[1] == h_result){
					System.out.println(t_hand+" 를 선택 하였습니다.");
					break;
				}else{
					System.out.println("잘못 선택 하였습니다.");
					continue;
				}			
		}
	
		//com 값 random 
		while(true){
			//com random 값 입력
			for(int i=0;i<2;i++){
				com_count = ((int)(Math.random()*3));
				com_hand[i] = String.valueOf(com_count);
			}
			// 가위 = 0 / 바위 = 1 / 보 = 2 /	
			System.out.println();

			if(com_count == 0){
				System.out.println("가위");
			}else if(com_count == 1){
				System.out.println("바위");
			}else if(com_count == 2){
				System.out.println("보");
			}
			break;
		}

		//p	c	result
//		result = 
			/*
				(가위 == 0)(바위 == 1)(보 == 2)

				com		user		win	-> 1
				2	-	0   + 2 =	4	% 3	-> 1
				0	-	1	+ 2	=	1	% 3
				1	-	2	+ 2	=	1	% 3

				com		user		lose -> 0
				0	-	2	+ 2 =	0	% 3	-> 0
				1	-	0	+ 2 =	3	% 3
				2	-	1	+ 2 =	3	% 3

				com		user		draw -> 2	
				0	-	0	+ 2 =	2	% 3
				1	-	1	+ 2	=	2	% 3
				2	-	2	+ 2 =	2	% 3
			*/

		result = ((com_count - h_result + 2)%3);

		if(result == 1){
			System.out.println("player win");
		}else if(result == 0){
			System.out.println("com win");		
		}else if(result == 2){
			System.out.println("draw");
		}

		


	}
}
